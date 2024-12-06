package com.github.carlossce.servicoFinanceiro.servico;

import com.github.carlossce.servicoFinanceiro.modelo.ClienteFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {
        double limiteAprovado = cliente.calcularLimiteAprovado();
        double valorJuros = cliente.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamento não pode ser aprovado. Limite máximo de " +
                    "%.2f%n", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento de %.2f com juros de %.2f%% aprovado. Limite máximo de %.2f%n",
                valorSolicitado, valorJuros, limiteAprovado);

    }
}
