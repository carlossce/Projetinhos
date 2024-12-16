package com.github.carlossce.dateTime_agendamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date;
        LocalTime hora;

        while (true) {
            try {
                System.out.print("Digite a data do evento: ");
                date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                break;
            } catch (Exception e) {
                System.out.println("Data Invalida. Tente novamente");
            }
        }

        while (true) {
            try {
                System.out.print("Digite a hora do evento: ");
                hora = LocalTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));
                break;
            } catch (Exception e) {
                System.out.println("Horário inválido. Tente novamente");
            }
        }

        LocalDateTime agendamento = LocalDateTime.of(date, hora);
        DateTimeFormatter formatacao = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                .withLocale(new Locale("pt", "BR"));

        System.out.println("Evento agendado para " + formatacao.format(agendamento));
    }
}
