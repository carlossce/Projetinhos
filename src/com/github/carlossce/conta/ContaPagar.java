package com.github.carlossce.conta;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }
    private void setPago(boolean pago) {
        this.pago = pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        if (!isPago()){
            this.valor -= valor;
            setPago(true);
            System.out.println("Pagamento efetuado com sucesso!");
        } else {
            System.out.println("A conta ja foi paga com sucesso!");
        }
    }

    public void cancelarPagamento(){
        if (isPago()){
            System.out.println("Perdão mas o pagamento ja foi feito!");
        }
    }
}
