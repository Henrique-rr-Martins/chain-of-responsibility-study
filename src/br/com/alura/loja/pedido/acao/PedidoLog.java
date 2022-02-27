package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class PedidoLog implements AcaoAposGerarPedido{

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado " + pedido.toString());
    }
}
