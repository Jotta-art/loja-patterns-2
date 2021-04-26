package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.CriarPedidoNoBanco;
import br.com.alura.loja.pedido.acao.EnviarPedidoPorEmail;
import br.com.alura.loja.pedido.acao.LogDePedido;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new EnviarPedidoPorEmail(),
                                                                        new CriarPedidoNoBanco(),
                                                                        new LogDePedido())/*dependencias*/);
        handler.executar(gerador);
    }
}
