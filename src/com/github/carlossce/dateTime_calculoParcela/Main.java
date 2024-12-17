package com.github.carlossce.dateTime_calculoParcela;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data;
        int quantidade = 0;
        LocalDate date;

        while (true) {
            try {
                System.out.print("Digite a data da primeira parcela: ");
                data = sc.nextLine();
                date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                break;
            } catch (Exception e) {
                System.out.println("Data invalida. Por favor, tente novamente");
            }
        }

        while (true){
            try {
                System.out.print("Digite a quantidade de parcelas: ");
                quantidade = sc.nextInt();
                break;
            } catch (Exception e) {
                if (quantidade < 0) {
                    throw new IllegalArgumentException("Quantidade invalida. Por favor, tente novamente");
                }
            }
        }

        CalculadoraParcela calculadora = new CalculadoraParcela();
        imprimirParcela(calculadora.calcularParcela(date, quantidade));
    }

    public static void imprimirParcela(List<LocalDate> parcelas) {
        int quantidade = 1;
        for (LocalDate parcela : parcelas) {
            System.out.printf("%d Parcela - %s%n", quantidade, parcela.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            quantidade++;
        }
    }
}
