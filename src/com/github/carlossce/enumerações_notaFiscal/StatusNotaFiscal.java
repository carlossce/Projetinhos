package com.github.carlossce.enumerações_notaFiscal;

public enum StatusNotaFiscal {

    NA0_EMITIDA {
        @Override
        public boolean podeSerCancelado(double valorTotal) {
            if (valorTotal < 1_000){
                return true;
            }
            return false;
        }
    },
    EMITIDA {
        @Override
        public boolean podeSerCancelado(double valorTotal) {
            return false;
        }
    },
    CANCELADA {
        @Override
        public boolean podeSerCancelado(double valorTotal) {
            return false;
        }
    };

    public abstract boolean podeSerCancelado(double valorTotal);

}
