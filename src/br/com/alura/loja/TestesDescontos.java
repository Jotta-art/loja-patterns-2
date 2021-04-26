package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItenOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItenOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        primeiro.adicionarItem(new ItenOrcamento(new BigDecimal("1000")));

        Orcamento terceiro = new Orcamento();
        primeiro.adicionarItem(new ItenOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }
}
