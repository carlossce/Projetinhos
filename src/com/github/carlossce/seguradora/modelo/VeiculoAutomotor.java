package com.github.carlossce.seguradora.modelo;

import java.util.Objects;

public abstract class VeiculoAutomotor implements BemSeguravel {
    private String modelo;
    private double valorMercado;
    private int anoFabricacao;

    public VeiculoAutomotor(String modelo, int anoFabricacao, double valorMercado) {
        Objects.requireNonNull(modelo);
        Objects.requireNonNull(valorMercado);
        Objects.requireNonNull(anoFabricacao);

        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }
    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
