package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItenOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItenOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItenOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }

}
