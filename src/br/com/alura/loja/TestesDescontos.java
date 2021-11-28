package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        Orcamento orc1 = new Orcamento(new BigDecimal("200"), 4);
        Orcamento orc2 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orc3 = new Orcamento(new BigDecimal(("1000")), 1);
        System.out.println(calculadora.efetuarCalculo(orc1));
        System.out.println(calculadora.efetuarCalculo(orc2));
        System.out.println(calculadora.efetuarCalculo(orc3));
    }
}
