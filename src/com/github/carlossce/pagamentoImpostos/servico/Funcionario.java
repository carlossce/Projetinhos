package com.github.carlossce.pagamentoImpostos.servico;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        if(nome != null){
            this.nome = nome;
            this.valorHora = valorHora;
        } else {
            System.out.println("Perdão, insira um nome!");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("Perdão, insira um nome!");
        }
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        if(valorHora > 0){
            this.valorHora = valorHora;
        } else {
            System.out.println("Perdão, valor invalido!");
        }
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double salario = calcularSalario(horasTrabalhadas);

        Holerite holerite = new Holerite(nome, mesAno, salario);
        return holerite;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
