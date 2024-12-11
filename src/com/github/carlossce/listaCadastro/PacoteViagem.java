package com.github.carlossce.listaCadastro;

import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem> {

    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        Objects.requireNonNull(descricao);

        if (precoPorPessoa < 0) {
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
        }

        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoPorPessoa=" + precoPorPessoa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        PacoteViagem that = (PacoteViagem) o;
        return Double.compare(precoPorPessoa, that.precoPorPessoa) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(precoPorPessoa);
    }

    @Override
    public int compareTo(PacoteViagem o) {
        return Double.compare(precoPorPessoa, o.precoPorPessoa);
    }

}
