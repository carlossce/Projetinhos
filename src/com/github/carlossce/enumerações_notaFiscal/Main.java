package com.github.carlossce.enumerações_notaFiscal;

public class Main {

    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 18_000);
        System.out.println(nf.getDescricaoCompleta());

//        nf.emitir();
//        System.out.println(nf.getDescricaoCompleta());

        //Se ja foi emitida a nota, ou o valor é acima de 1_000, não pode ser cancelada
        nf.cancelar();
        System.out.println(nf.getDescricaoCompleta());
    }

}
