package com.github.carlossce.stream_desafio;

import com.github.carlossce.stream_desafio.comercial.Cliente;
import com.github.carlossce.stream_desafio.comercial.ServicoDeVenda;
import com.github.carlossce.stream_desafio.comercial.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        List<String> clientes = new ArrayList<>();
//
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                if (!clientes.contains(venda.getCliente().nome())) {
//                    clientes.add(venda.getCliente().nome());
//                }
//            }
//        }
//
//        Collections.sort(clientes);
//        System.out.println(clientes);

        vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .sorted(Comparator.comparing(Cliente::nome))
                .distinct()
                .forEach(System.out::println);
    }

}
