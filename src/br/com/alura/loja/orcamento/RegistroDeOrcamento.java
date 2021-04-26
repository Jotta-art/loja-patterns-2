package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        //chamada HTTP para API externa
        //Como disparar uma requisição HTTP para um serviço externo:
        //URL Connection
        //lib REST
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado!");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
                                           "quantidadeItens", orcamento.getQuantidadeItens());
        http.post(url, dados);
    }

}
