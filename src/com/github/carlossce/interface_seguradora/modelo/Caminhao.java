package com.github.carlossce.interface_seguradora.modelo;

public class Caminhao extends VeiculoAutomotor{
    public static final int VALOR_POR_EIXO = 50;
    public static final double VALOR_FIXO_CAMINHAO = 0.02;

    private int quantidadeEixos;

    public Caminhao(String modelo, int anoFabricacao, double valorMercado, int quantidadeEixos) {
        super(modelo, anoFabricacao, valorMercado);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * VALOR_FIXO_CAMINHAO) + (getQuantidadeEixos() * VALOR_POR_EIXO);
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado no valor de R$%.2f%nPrêmio: R$%.2f%n",
                getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado(), calcularValorPremio());
    }
}
