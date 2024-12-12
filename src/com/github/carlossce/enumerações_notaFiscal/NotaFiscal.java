package com.github.carlossce.enumerações_notaFiscal;

public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscal status = StatusNotaFiscal.NA0_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void cancelar() {
        if (!status.podeSerCancelado(getValor())) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        status = StatusNotaFiscal.CANCELADA;
    }

    public void emitir() {
        if (status.equals(status.EMITIDA) || status.equals(status.CANCELADA)) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = StatusNotaFiscal.EMITIDA;
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), getStatus());
    }

}
