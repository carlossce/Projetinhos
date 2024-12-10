package com.github.carlossce.bancoExcecoes;

import com.github.carlossce.bancoExcecoes.execoes.StatusDaContaException;
import com.github.carlossce.bancoExcecoes.service.ContaCorrente;

import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        Scanner sc = new Scanner(System.in);

//        do {
//            try {
//                conta1.depositar(1_000);
//                break;
//            } catch (StatusDaContaException e) {
//                System.out.println("Erro: " + e.getMessage());
//
//                System.out.print("Deseja ativar a conta? ");
//                if (sc.nextLine().equalsIgnoreCase("sim")) {
//                    conta1.ativar();
//                } else {
//                    System.out.println("Okay.");
//                    break;
//                }
//            }
//        } while (true);

        conta1.depositar(1_000);


        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
    }
}
