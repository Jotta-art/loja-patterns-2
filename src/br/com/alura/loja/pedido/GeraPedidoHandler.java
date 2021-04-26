package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItenOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

    //construtor com injecao de dependencias: repository, service etc.

    private List<AcaoAposGerarPedido> acoesAposGerarPedido;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acaoAposGerarPedidos) {
        this.acoesAposGerarPedido = acaoAposGerarPedidos;
    }

    public void executar(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItenOrcamento(dados.getValorOrcamento()));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
    }

}
