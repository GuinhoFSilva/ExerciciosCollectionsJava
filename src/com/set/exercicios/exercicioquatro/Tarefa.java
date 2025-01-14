package com.set.exercicios.exercicioquatro;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao, boolean tarefaConcluida){
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getTarefaConcluida(){
        return tarefaConcluida;
    }

    public void setTarefaConcluida(){
        this.tarefaConcluida = true;
    }

    public void setTarefaPendente(){
        this.tarefaConcluida = false;
    }

    public String toString(){
        return descricao + " " + tarefaConcluida;
    }



}
