package com.github.carlossce.impostos.empresas;

public class PessoaFisica extends Pessoa {
    public static final double RECEITA_ANUAL_ISENCAO = 45000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calculaImpostos() {
        double valorReceita = 0;

        if (getReceitaAnual() > RECEITA_ANUAL_ISENCAO) {
            valorReceita = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }
        return valorReceita;
    }
}