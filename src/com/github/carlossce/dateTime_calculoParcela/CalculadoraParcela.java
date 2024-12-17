package com.github.carlossce.dateTime_calculoParcela;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraParcela {

    public static List<LocalDate> calcularParcela(LocalDate calendar, int numeroParcelas) {
        List<LocalDate> parcelas = new ArrayList<>();

        parcelas.add(calendar);
        for (int i = 1; i <= numeroParcelas - 1; i++) {
            parcelas.add(calendar.plus(i, ChronoUnit.MONTHS));
        }
        return parcelas;
    }

}
