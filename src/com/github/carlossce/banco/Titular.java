package com.github.carlossce.banco;

public class Titular {
    private String nome;
    private String cpf;

    public Titular(String nome, String cpf) {
        this.nome = nome;
        if (cpf != null) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF invalido!");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}
