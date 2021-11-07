package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal efetuarCalculo(Orcamento orcamento){
        Desconto cadeiaDeDescontos =
                new DescontoParaOrcamentoMaisDeCincoItens(
                        new DescontoParaOrcamentoValorMaiorQueQuinhentos(
                                new SemDesconto()));

        return cadeiaDeDescontos.efetuarCalculo(orcamento);
    }
}
