package com.github.carlossce.servicoFinanceiro.modelo;

public interface ClienteFinanciavel {

    double JUROS_PEQUENO_VALOR = 1.0;
    double JUROS_MEDIO_VALOR = 1.5;
    double JUROS_GRANDE_VALOR = 2.0;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)){
            return JUROS_PEQUENO_VALOR;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIO_VALOR;
        }
        return JUROS_GRANDE_VALOR;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

}
