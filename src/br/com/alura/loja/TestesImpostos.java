package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
