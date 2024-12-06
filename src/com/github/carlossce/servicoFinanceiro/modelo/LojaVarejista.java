package com.github.carlossce.servicoFinanceiro.modelo;

public class LojaVarejista extends EmpresaFinanciavel {
    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.2;
    public static final double PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO = 0.5;

    private double valorTotalEstoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento, double valorTotalEstoque) {
        super(razaoSocial, totalFaturamento);
        estoque(valorTotalEstoque);
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }
    public void setValorTotalEstoque(double valorTotalEstoque) {
        estoque(valorTotalEstoque);
    }

    private void estoque(double valorTotalEstoque) {
        if (valorTotalEstoque > 0){
            this.valorTotalEstoque = valorTotalEstoque;
        } else {
            throw new RuntimeException(String.format("Com esse estoque será impossivel..."));
        }
    }

    @Override
    public double calcularLimiteAprovado() {
        return (getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO)
                + (getValorTotalEstoque() * PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO);
    }
}
