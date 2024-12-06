package com.github.carlossce.servicoFinanceiro.modelo;


public class Funcionario implements ClienteFinanciavel, PessoaBonificavel {

     public static final double QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;

     private String nome;
     private double salarioMensal;

     public Funcionario (String nome, double salarioMensal){
         if (nome == null || nome.isEmpty()){
             throw new RuntimeException(String.format("Por favor, insira um nome..."));
         }
         this.nome = nome;
         salario(salarioMensal);
     }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        salario(salarioMensal);
    }

    private void salario(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            throw new RuntimeException(String.format("Salario inapropriado para emprestimo..."));
        }
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada / 100;
    }
}
