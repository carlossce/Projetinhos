package com.github.carlossce.pagamentoImpostos.servico;

public class Programador extends Funcionario {
    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }
    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected double calcularSalario(int horasTrabalhadas) {
        return getValorBonus() + super.calcularSalario(horasTrabalhadas);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", valorHora=" + getValorHora() +
                ", valorBonus=" + getValorBonus() +
                '}';
    }
}
