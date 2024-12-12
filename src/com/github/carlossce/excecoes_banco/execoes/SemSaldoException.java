package com.github.carlossce.excecoes_banco.execoes;

public class SemSaldoException extends RuntimeException {

    public SemSaldoException(String mensagem) {
        super(mensagem);
    }

}
