package com.github.carlossce.dateTime_conviteFesta;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {
    private static final Scanner sc = new Scanner(System.in);
    private static final DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter formatacaoHorario = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter formatacaoGeral = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'às' hh:mm")
            .withLocale(new Locale("pt", "BR"));


    public static void main(String[] args) {
        LocalDate data;
        LocalTime horario;

        while (true) {
            try {
                System.out.print("Qual será a data local da festa? ");
                data = LocalDate.parse(sc.nextLine(), formatacaoData);
                break;
            } catch (Exception e) {
                System.out.println("Data invalida. Tente novamente");
            }

        }

        while (true) {
            try {
                System.out.print("Qual será o horário da festa? ");
                horario = LocalTime.parse(sc.nextLine(), formatacaoHorario);
                break;
            } catch (Exception e) {
                System.out.println("Horário invalida. Tente novamente");
            }

        }

        ZonedDateTime dataBrasil = ZonedDateTime.of(data, horario,
                ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime dataJapao = dataBrasil.withZoneSameInstant(ZoneId.of("Japan"));
        ZonedDateTime dataLosAngeles = dataBrasil.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataBrasil.format(formatacaoGeral) +" (No Horário de Brasília)");
        System.out.println(dataJapao.format(formatacaoGeral) + " (No Horário do Japão)");
        System.out.println(dataLosAngeles.format(formatacaoGeral) + " (No Horário de Los Angeles)");
    }

}
