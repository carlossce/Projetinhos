package com.github.carlossce.stream_desafio;

import com.github.carlossce.stream_desafio.comercial.Cliente;
import com.github.carlossce.stream_desafio.comercial.ServicoDeVenda;
import com.github.carlossce.stream_desafio.comercial.Venda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        List<Cliente> clientes = new ArrayList<>();
//        for (Venda venda : vendas) {
//            if (venda.isFechada() && !clientes.contains(venda.getCliente())) {
//                clientes.add(venda.getCliente());
//            }
//        }
//        clientes.sort(Comparator.comparing(Cliente::nome));
//
//        for (Cliente cliente : clientes) {
//            System.out.println(cliente);
//        }

        vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .distinct()
                .forEach(System.out::println);
    }

}
