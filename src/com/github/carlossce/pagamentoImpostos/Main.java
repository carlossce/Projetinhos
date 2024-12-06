package com.github.carlossce.pagamentoImpostos;

import com.github.carlossce.pagamentoImpostos.servico.Funcionario;
import com.github.carlossce.pagamentoImpostos.servico.Holerite;
import com.github.carlossce.pagamentoImpostos.servico.Programador;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 40);
        System.out.println(funcionario1);
        Holerite holerite1 = funcionario1.gerarHolerite(180, "jul/2022");
        holerite1.imprimir();

        System.out.println();

        Funcionario funcionario2 = new Funcionario("João", 40);
        System.out.println(funcionario2);
        Holerite holerite2 = funcionario2.gerarHolerite(180, "jul/2022");
        holerite2.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Maria", 80);
        programador1.setValorBonus(1000);
        System.out.println(programador1);
        Holerite holerite3 = programador1.gerarHolerite(180, "jul/2022");
        holerite3.imprimir();
        
        System.out.println();

        System.out.println(funcionario1.equals(funcionario2));
    }
}
