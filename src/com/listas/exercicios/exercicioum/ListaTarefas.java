package com.listas.exercicios.exercicioum;

import java.util.List;

import java.util.ArrayList;

public class ListaTarefas {
    private List <Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefas){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefas);
    }


}
