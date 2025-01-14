package com.set.exercicios.exerciciotres;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> setContato;

    public AgendaContatos(){
        this.setContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        setContato.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(setContato);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : setContato){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : setContato){
            if(c.getNome().equals(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


}
