package com.github.carlossce.stream_desafio;

import com.github.carlossce.stream_desafio.comercial.ServicoDeVenda;
import com.github.carlossce.stream_desafio.comercial.Venda;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class Principal4 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        BigDecimal totalVendas = BigDecimal.ZERO;
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                totalVendas = totalVendas.add(venda.getValorTotal());
//            }
//        }
//
//        System.out.println(totalVendas);

        BigDecimal totalVendas = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalVendas);
    }

}
