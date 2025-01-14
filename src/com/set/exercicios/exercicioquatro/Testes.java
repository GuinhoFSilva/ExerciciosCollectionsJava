package com.set.exercicios.exercicioquatro;

public class Testes {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        
        listaTarefas.adicionarTarefa("Estudar Java", true);
        
        listaTarefas.adicionarTarefa("Estudar Cálculo", false);
        
        listaTarefas.adicionarTarefa("Limpar Casa", false);
        
        listaTarefas.adicionarTarefa("Dormir", true);

        System.out.println("Sua lista de tarefas tem um total de: " + listaTarefas.contarTarefas() + " tarefas.");

        listaTarefas.exibirTarefas();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Estudar Cálculo");

        listaTarefas.marcarTarefaPendente("Dormir");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Estudar Java");

        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();

    }
}
