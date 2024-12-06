package com.github.carlossce.seguradora;

import com.github.carlossce.seguradora.modelo.Caminhao;
import com.github.carlossce.seguradora.modelo.CarroParticular;
import com.github.carlossce.seguradora.modelo.ImovelResidencial;
import com.github.carlossce.seguradora.servico.ServicoPropostaSeguro;

public class Main {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 2022, 150_000);
        Caminhao caminhao = new Caminhao("Actros", 2021, 780_000, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }
}
