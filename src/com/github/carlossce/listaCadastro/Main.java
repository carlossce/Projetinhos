package com.github.carlossce.listaCadastro;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 21_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

//        cadastro.removerPorDescricao("Disney (10 noites)");

//        cadastro.ordenar();
        cadastro.ordenarPorPrecoDecrescente();

//        PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Disney (10 noites)");
//        System.out.println(pacoteEncontrado);

        imprimirPacotes(cadastro.obterTodos());
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        // TODO iterar nos pacotes e imprimir descrição e preço
        for (PacoteViagem p : pacotes) {
            System.out.printf("%s - %.2f%n", p.getDescricao(), p.getPrecoPorPessoa());
        }
    }

}
