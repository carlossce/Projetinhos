package com.github.carlossce.banco;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Titular titular;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    protected void setSaldoComInvestimento(double saldo) {
        this.saldo += saldo;
    }
    public Titular getTitular() {
        return titular;
    }

    public void validarSaldoParaSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new RuntimeException("O valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 50) {
            saldo += valorDeposito;
        } else {
            throw new RuntimeException("Deposito minimo de R$50,00.");
        }
    }

    public boolean temImpressaoGratuita() {
        return false;
    }

    public void imprimirDemonstrativo() {
        System.out.printf("Titular: %s\n", titular.getNome());
        System.out.printf("Agencia: %d\n", getAgencia());
        System.out.printf("Numero: %d\n", getNumero());
        System.out.printf("Saldo: %.2f\n", getSaldo());
    }
}
