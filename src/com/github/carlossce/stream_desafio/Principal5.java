package com.github.carlossce.stream_desafio;

import com.github.carlossce.stream_desafio.comercial.ServicoDeVenda;
import com.github.carlossce.stream_desafio.comercial.Venda;

import java.util.List;

public class Principal5 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        int quantidadeItensVendidos = 0;
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                for (Venda.Item item : venda.getItens()) {
//                    quantidadeItensVendidos += item.quantidade();
//                }
//            }
//        }
//
//        System.out.println(quantidadeItensVendidos);

        int quantidadeVendida = vendas.stream()
                .filter(Venda::isFechada)
                .flatMap(venda -> venda.getItens().stream())
                .mapToInt(Venda.Item::quantidade)
                .sum();

        System.out.println(quantidadeVendida);
    }

}
