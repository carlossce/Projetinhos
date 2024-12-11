package com.github.carlossce.listaCadastro;

import java.util.*;

public class CadastroPacoteViagem{
    
    public List<PacoteViagem> listaPacoteViagem = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        if (listaPacoteViagem.contains(new PacoteViagem(descricao, precoDiaria))) {
            throw new NomeJaExistenteException("Ja existe um cadastro de viagem com essa descricao");
        }

        listaPacoteViagem.add(new PacoteViagem(descricao, precoDiaria));
    }

    public List<PacoteViagem> obterTodos() {
        return listaPacoteViagem;
    }

    public void ordenar() {
        Collections.sort(listaPacoteViagem, Comparator.comparing(PacoteViagem::getDescricao));
    }

    public void ordenarPorPrecoDecrescente() {
        Collections.sort(listaPacoteViagem, Collections.reverseOrder());
    }

    public void removerPorDescricao(String descricao) {
        boolean existe = false;

        Iterator<PacoteViagem> iterator = listaPacoteViagem.iterator();
        while (iterator.hasNext()) {
            PacoteViagem pacote = iterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                iterator.remove();
                existe = true;
            }
        }

        if (!existe) {
            throw new NomeNaoEncontradoException("Nenhum cadastro com essa descrição foi encontrado");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        Iterator<PacoteViagem> iterator = listaPacoteViagem.iterator();
        while (iterator.hasNext()) {
            PacoteViagem pacote = iterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                return pacote; // Retorna o pacote encontrado
            }
        }

        throw new NomeNaoEncontradoException("Nome não encontrado na lista");
    }

}
