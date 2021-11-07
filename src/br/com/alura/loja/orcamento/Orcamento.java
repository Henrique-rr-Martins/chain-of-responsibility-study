package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;

    //Métodos
    public Orcamento(BigDecimal valor, int quantidadeItens){
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }
    public BigDecimal getValor(){ return this.valor; }
    public int getQuantidadeItens(){ return this.quantidadeItens; }
}
