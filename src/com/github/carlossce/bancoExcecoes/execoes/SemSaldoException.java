package com.github.carlossce.bancoExcecoes.execoes;

public class SemSaldoException extends RuntimeException {

    public SemSaldoException(String mensagem) {
        super(mensagem);
    }

}
