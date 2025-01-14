package com.set.exercicios.exercicioquatro;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean tarefaConcluida){
        tarefaSet.add(new Tarefa(descricao, tarefaConcluida));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equals(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.getTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.getTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equals(descricao)){
                tarefaConcluida = t;
                break;
            }
        }
        if(tarefaConcluida != null){
            tarefaConcluida.setTarefaConcluida();
            System.out.println("A tarefa " + descricao + " foi marcada como concluída");
        } else {
            System.out.println("A tarefa não foi encontrada");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equals(descricao)){
                tarefaPendente = t;
                break;
            }
        }
        if(tarefaPendente != null){
            tarefaPendente.setTarefaPendente();
            System.out.println("A tarefa " + descricao + " foi marcada como pendente");
        } else {
            System.out.println("A tarefa não foi encontrada");
        }
    }
    public void limparListaTarefas(){
        Set<Tarefa> tarefasParaLimpar = new HashSet<>();
        for(Tarefa t : tarefaSet){
            tarefasParaLimpar.add(t);
        }
        tarefaSet.removeAll(tarefasParaLimpar);
        System.out.println("Todas as tarefas foram removidas da lista");
    }

}
