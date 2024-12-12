package com.github.carlossce.interface_seguradora.modelo;

public class ImovelResidencial implements BemSeguravel {
    public static final double VALOR_POR_METRO_CONSTRUIDO = 0.3;
    public static final double VALOR_TAXA_FIXA_PREMIO = 0.01;

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }
    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }
    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (valorMercado * VALOR_TAXA_FIXA_PREMIO) + (areaConstruida / VALOR_POR_METRO_CONSTRUIDO);
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f%nPrêmio: R$%.2f%n",
                getAreaConstruida(), getValorMercado(), calcularValorPremio());
    }
}
