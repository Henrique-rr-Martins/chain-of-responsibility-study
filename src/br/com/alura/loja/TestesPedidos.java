package br.com.alura.loja;

import br.com.alura.loja.pedido.GeradorPedido;
import br.com.alura.loja.pedido.ManipuladorDeGeradorPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.PedidoLog;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDado;

import java.math.BigDecimal;

public class TestesPedidos {
    public static void main(String[] args){
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeradorPedido gerador = new GeradorPedido(cliente, valorOrcamento, quantidadeItens);
        ManipuladorDeGeradorPedido handler = new ManipuladorDeGeradorPedido(new SalvarPedidoNoBancoDeDado(), new EnviarEmailPedido(), new PedidoLog());
        handler.executar(gerador);
    }
}
