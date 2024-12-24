package com.github.carlossce.stream_desafio;

import com.github.carlossce.stream_desafio.comercial.ServicoDeVenda;
import com.github.carlossce.stream_desafio.comercial.Venda;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
//        List<Venda> vendas = servicoDeVenda.obterTodas();
//
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                System.out.println(venda);
//            }
//        }

        List<Venda> vendas = servicoDeVenda.obterTodas();
        vendas.stream()
                .filter(Venda::isFechada)
                .forEach(System.out::println);
    }

}
