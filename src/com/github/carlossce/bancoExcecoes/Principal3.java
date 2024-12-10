package com.github.carlossce.bancoExcecoes;

import com.github.carlossce.bancoExcecoes.execoes.SemSaldoException;
import com.github.carlossce.bancoExcecoes.execoes.StatusDaContaException;
import com.github.carlossce.bancoExcecoes.service.ContaCorrente;

public class Principal3 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        conta1.ativar();
        conta2.ativar();

//        try {
//            conta1.depositar(1_000);
//            conta1.transferir(conta2, 1_200);
//        } catch (StatusDaContaException | IllegalArgumentException | SemSaldoException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

        conta1.depositar(1_000);
        conta1.transferir(conta2, 1_200);

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
    }
}
