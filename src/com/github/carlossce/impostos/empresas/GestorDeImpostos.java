package com.github.carlossce.impostos.empresas;

public class GestorDeImpostos {
    private double valorTotalImposto;

    public void adicionar(Pessoa... pessoa) {
//        ArrayList<Pessoa> pessoas = new ArrayList<>();
//        pessoas.add(pessoa);
        for (Pessoa p : pessoa) {
            System.out.printf("Impostos devidos de %s: %.2f%n", p.getNome(), p.calculaImpostos());
            valorTotalImposto += p.calculaImpostos();
        }
    }

    public double getValorTotalImpostos() {
        return valorTotalImposto;
    }
}
