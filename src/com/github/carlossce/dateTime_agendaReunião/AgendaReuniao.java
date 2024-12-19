package com.github.carlossce.dateTime_agendaReunião;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaReuniao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano em que deseja realizar a reunião: ");
        int ano = sc.nextInt();
        System.out.print("Qual o mês inicial: ");
        int mes = sc.nextInt();


        Year year = Year.of(ano);
        Month month = Month.of(mes);

        LocalDate data = LocalDate.of(year.getValue(), month.getValue(), 1);
        LocalDate dataReuniao = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println();
        System.out.println("Reuniões agendadas para:");
        System.out.println("segunda-feira - " + dataReuniao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        for (int i = 1; true; i++) {
            dataReuniao = data.plusMonths(i).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
            System.out.println("segunda-feira - " + dataReuniao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            mes++;
            if (mes == 12) {
                break;
            }
        }
    }
}
