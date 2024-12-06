package com.github.carlossce.servicoFinanceiro;

import com.github.carlossce.servicoFinanceiro.modelo.ClienteFinanciavel;
import com.github.carlossce.servicoFinanceiro.modelo.Fazenda;
import com.github.carlossce.servicoFinanceiro.modelo.Funcionario;
import com.github.carlossce.servicoFinanceiro.modelo.Industria;
import com.github.carlossce.servicoFinanceiro.servico.ServicoFinanciamento;
import com.github.carlossce.servicoFinanceiro.servico.ServicoPagamentoBonus;

public class Main {
    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var servicoPagamentoBonus = new ServicoPagamentoBonus();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 1_000_000, true);
        var funcionario = new Funcionario("Carlos", 6_000);

        System.out.println(ClienteFinanciavel.isFinanciamentoGrandeValor(250_000));
        
        servicoPagamentoBonus.pagar(funcionario, 80);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 24_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 2_500_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 300_000);
    }
}
