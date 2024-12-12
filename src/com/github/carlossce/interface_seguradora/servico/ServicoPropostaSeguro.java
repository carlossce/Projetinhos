package com.github.carlossce.interface_seguradora.servico;

import com.github.carlossce.interface_seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {
    public void emitir(BemSeguravel bem) {
        proposta();
        System.out.println(bem.descrever());
    }

    private static void proposta() {
        System.out.println("-------------------");
        System.out.println("Proposta de seguro");
        System.out.println("-------------------");
    }
}
