package com.github.carlossce.impostos;

import com.github.carlossce.impostos.empresas.GestorDeImpostos;
import com.github.carlossce.impostos.empresas.PessoaFisica;

public class Principal1 {
    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva", 45_000);
        var maria = new PessoaFisica("Maria Souza", 180_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}
