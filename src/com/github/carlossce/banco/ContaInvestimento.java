package com.github.carlossce.banco;

public class ContaInvestimento extends Conta {
    private double valorTotalRendimento;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimento() {
        return valorTotalRendimento;
    }
    public void setValorTotalRendimento(double valorTotalRendimento) {
        this.valorTotalRendimento = valorTotalRendimento;
        setSaldoComInvestimento(this.valorTotalRendimento);
    }

    public void creditarRendimento(double percentualJuros) {
        double valor = getSaldo() * (percentualJuros / 100);
        setValorTotalRendimento(valor);
    }

    @Override
    public boolean temImpressaoGratuita() {
        return getValorTotalRendimento() > 0;
    }
}
