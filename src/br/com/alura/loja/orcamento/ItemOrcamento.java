package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel{
    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor){
        this.valor = valor;
    }

    public ItemOrcamento(float valor){
        this.valor = BigDecimal.valueOf(valor);
    }

    @Override
    public BigDecimal getValor(){ return this.valor; }
}
