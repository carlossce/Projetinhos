package com.github.carlossce.impostos.empresas;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public abstract double calculaImpostos();
}
