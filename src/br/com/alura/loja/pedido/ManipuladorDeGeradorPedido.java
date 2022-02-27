package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class ManipuladorDeGeradorPedido {
    private List<AcaoAposGerarPedido> acoes;

    public ManipuladorDeGeradorPedido(AcaoAposGerarPedido... acoes){
        this.acoes = Arrays.asList(acoes);
    }

    public void executar(GeradorPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executar(pedido));
    }
}
