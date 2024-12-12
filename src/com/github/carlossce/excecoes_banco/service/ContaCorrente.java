package com.github.carlossce.excecoes_banco.service;

import com.github.carlossce.excecoes_banco.execoes.SemSaldoException;
import com.github.carlossce.excecoes_banco.execoes.StatusDaContaException;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public double sacar(double valor) throws SemSaldoException, StatusDaContaException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new SemSaldoException("Conta sem saldo");
        }

        if (isInativa()) {
            throw new StatusDaContaException("Conta esta inativa");
        }

        return this.saldo -= valor;
    }

    public double depositar(double valor) throws StatusDaContaException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new StatusDaContaException("Conta esta inativa");
        }

        return this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) throws StatusDaContaException, SemSaldoException {
        if (contaDestino.isInativa()) {
            throw new StatusDaContaException("Conta de destino está inativa");
        }

        if (valor < this.saldo) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            throw new SemSaldoException("Conta sem saldo");
        }
    }
}
