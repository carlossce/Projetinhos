package com.github.carlossce.banco;

public class ContaEspecial extends ContaInvestimento {
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }
    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if (limiteChequeEspecial > 0) {
            this.limiteChequeEspecial = limiteChequeEspecial;
        }
    }

    public double getSaldoDisponivel() {
        return getSaldo() + limiteChequeEspecial;
    }

    @Override
    public void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Tarifa mensal: %.2f\n", getTarifaMensal());
        System.out.printf("Saldo disponivel: %.2f\n", getSaldoDisponivel());
    }
}
