package com.github.carlossce.calendar_calculoParcelas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final DateFormat fd = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = entrada.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        Date dataParcela = fd.parse(dataParcelaTexto);

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataParcela);

        List<Date> datasParcelas = CalculadoraParcelas.calcularParcelas(dataParcela, quantidadeParcelas);

        imprimirParcelas(datasParcelas);
    }

    private static void imprimirParcelas(List<Date> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("#%d - %s%n", i+1,
                    fd.format(datasParcelas.get(i)));
        }
    }

}
