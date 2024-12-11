package com.github.carlossce.gerenciadorEstoque;

import com.github.carlossce.gerenciadorEstoque.estoque.Carro;
import com.github.carlossce.gerenciadorEstoque.estoque.GerenciadorEstoque;
import com.github.carlossce.gerenciadorEstoque.estoque.Roupa;

public class Main {

    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque();
        estoqueRoupas.adicionar(new Roupa("Camiseta básica branca", 20));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica preta", 10));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque();
        estoqueCarros.adicionar(new Carro("BMW X1", 4));
        estoqueCarros.adicionar(new Carro("Honda HR-V", 8));
        imprimirEstoque(estoqueCarros);
    }

    private static void imprimirEstoque(GerenciadorEstoque gerenciadorEstoque) {
        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }

}
