package com.github.carlossce.banco;

public class Main {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setSaldo(500);
//        conta1.setValorTotalRendimento(100);
        conta1.creditarRendimento(10);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Maria Joana", "98798798700"),
                2222, 888888, 90);

        ContaSalario conta3 = new ContaSalario(new Titular("Francisco Souza", "78978978955"),
                3333, 777777, 18_000);

        conta3.depositar(300);

//        caixaEletronico.transferir(conta1, conta3, 50);
//        System.out.println("");
//        conta1.imprimirDemonstrativo();
//        System.out.println("");
//        conta3.imprimirDemonstrativo();

        caixaEletronico.imprimirDemonstrativo(conta1);
    }
}
