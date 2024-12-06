package com.github.carlossce.banco;

public class CaixaEletronico {
    public static final double TARIFA_TRANSFERENCIA = 1.5;
    public static final double TARIFA_IMPRESSAO = 1.5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        contaOrigem.sacar(valor + TARIFA_TRANSFERENCIA);
        contaDestino.setSaldo(valor);

        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
                valor, contaOrigem.getNumero(), contaOrigem.getAgencia(), contaDestino.getNumero(), contaDestino.getAgencia());
    }

//    public void imprimirDemonstrativo(Conta conta) {
////        if (conta instanceof ContaInvestimento) {
////            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
////        if (contaInvestimento.getValorTotalRendimento() > 0) {
////            System.out.println("Valor da impressão gratuita\n");
////        } else {
////            impressao(conta);
////        }
//
//        if (conta instanceof ContaInvestimento contaInvestimento
//                && contaInvestimento.getValorTotalRendimento() > 0) {
//                System.out.println("Valor da impressão gratuita\n");
//        } else {
//            debitarTarifaDaImpressao(conta);
//        }
//        conta.imprimirDemonstrativo();
//    }

    public void imprimirDemonstrativo(Conta conta) {
        if (conta.temImpressaoGratuita()) {
            System.out.println("Valor da impressão gratuita\n");
        } else {
            debitarTarifaDaImpressao(conta);
        }
        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaDaImpressao(Conta conta) {
        System.out.printf("Valor da impressão: R$%.2f%n%n", TARIFA_IMPRESSAO);
        conta.sacar(TARIFA_IMPRESSAO);
    }
}
