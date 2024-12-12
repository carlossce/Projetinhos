package com.github.carlossce.interface_seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor{

    public static final double VALOR_TAXA_FIXA = 0.04;
    public static final double VALOR_PARA_CARROS_ANTIGOS = 0.05;

    public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
        super(modelo, anoFabricacao, valorMercado);
    }

    @Override
    public double calcularValorPremio() {
        double valor = getValorMercado() * VALOR_TAXA_FIXA;
        if (getAnoFabricacao() > 2000) {
            return valor;
        }
        return valor + (valor * VALOR_PARA_CARROS_ANTIGOS);
    }

    @Override
    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado no valor de R$%.2f%nPrêmio: %.2f%n",
                getModelo(), getAnoFabricacao(), getValorMercado(), calcularValorPremio());
    }
}
