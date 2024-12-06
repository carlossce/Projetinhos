package com.github.carlossce.servicoFinanceiro.servico;

import com.github.carlossce.servicoFinanceiro.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {
    public void pagar(PessoaBonificavel pessoaBonificavel, double percentualMetaAlcancada) {
        double valorBonus = pessoaBonificavel.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bônus pago no valor de %.2f%n", valorBonus);
    }
}
