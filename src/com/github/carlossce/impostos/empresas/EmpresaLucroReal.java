package com.github.carlossce.impostos.empresas;

public class EmpresaLucroReal extends PessoaJuridica{
    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal (String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calculaImpostos() {
        return getLucroAnual() * ALIQUOTA_IMPOSTO_LUCRO;
    }
}
