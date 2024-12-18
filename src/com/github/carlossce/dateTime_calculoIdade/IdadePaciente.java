package com.github.carlossce.dateTime_calculoIdade;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IdadePaciente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dataNascimento;
        LocalDate nascimento;

        while (true) {
            try {
                System.out.print("Digite a sua data de nascimento: ");
                dataNascimento = sc.nextLine();
                nascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                break;
            } catch (DateTimeException e) {
                System.out.println("Data invalida. Tente novamente");
            }
        }

        LocalDate hoje = LocalDate.now();

        Period duracao = Period.between(nascimento, hoje);

        if (duracao.getYears() != 1) {
            System.out.printf("O paciente tem: %s anos ", duracao.getYears());
        } else {
            System.out.printf("O paciente tem: %s ano ", duracao.getYears());
        }

        if (duracao.getMonths() != 1) {
            System.out.printf("%s meses ", duracao.getMonths());
        } else {
            System.out.printf("%s mês ", duracao.getMonths());
        }

        if (duracao.getDays() != 1) {
            System.out.printf("%s dias ", duracao.getDays());
        } else {
            System.out.printf("%s dia ", duracao.getDays());
        }
    }

}
