package com.github.carlossce.pagamentoImpostos.servico;

public record Holerite(String nome, String mesAno, double valorSalario) {
    public void imprimir() {
        System.out.printf("Nome: %s%nMês: %s%nValor: %.2f%n", nome, mesAno, valorSalario);
    }
}
