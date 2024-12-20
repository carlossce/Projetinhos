package com.github.carlossce.lambdaMethodReference_desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários inativos
//        Predicate<Funcionario> predicate = Funcionario -> Funcionario.isInativo();
//        funcionarios.removeIf(predicate);
        funcionarios.removeIf(Funcionario::isInativo);

        // TODO ordenar funcionários pelo valor do salário
//        Comparator<Funcionario> comparator = Comparator.comparing(Funcionario -> Funcionario.getSalario());
//        funcionarios.sort(comparator);
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));

        // TODO iterar e imprimir funcionários usando o método estático imprimir
        imprimir(funcionarios);
    }

    private static void imprimir(List<Funcionario> funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)
//        for (Funcionario funcionario1 : funcionario) {
//            System.out.printf("%s - salário de R$%.2f com imposto de R$%.2f (20%%)%n",
//                    funcionario1.getNome(), funcionario1.getSalario(), funcionario1.getSalario().multiply(new BigDecimal(0.2)));
//        }

        funcionario.forEach(funcionarios -> System.out.printf("%s - salário de R$%.2f com imposto de R$%.2f (20%%)%n",
                funcionarios.getNome(), funcionarios.getSalario(), funcionarios.getSalario().multiply(new BigDecimal(0.2))));
    }

}
