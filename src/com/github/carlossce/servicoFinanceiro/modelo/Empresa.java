package com.github.carlossce.servicoFinanceiro.modelo;

public abstract class Empresa {
    private String razaoSocial;
    private double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        faturamento(totalFaturamento);
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }
    public void setTotalFaturamento(double totalFaturamento) {
        faturamento(totalFaturamento);
    }

    private void faturamento(double totalFaturamento) {
        if (totalFaturamento > 0){
            this.totalFaturamento = totalFaturamento;
        } else {
            throw new RuntimeException(String.format("Com esse faturamento será impossivel..."));
        }
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public double calcularJuros(double valorSolicitado) {
        return valorSolicitado * totalFaturamento;
    }
}
