package com.github.carlossce.gerenciadorEstoque.estoque;

public class GerenciadorEstoque<E extends Estocavel> {

    private int quantidadeTotal;

    public void adicionar(E estocavel) {
        quantidadeTotal += estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

}
