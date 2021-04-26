package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItenOrcamento implements Orcavel {

    private BigDecimal valor;

    public ItenOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
