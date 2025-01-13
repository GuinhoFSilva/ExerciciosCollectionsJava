package com.listas.exercicios.exercicioum;
import java.util.Scanner;

public class Testes {
    public static void main(String [] args){
        try (Scanner scanner = new Scanner(System.in)){

            ListaTarefas listaTarefas = new ListaTarefas();

            System.out.println("Qual tarefa gostaria de adicionar à sua lista?");

            String descricao = scanner.nextLine();
            listaTarefas.adicionarTarefa(descricao);
            
            System.out.println("Sua lista de tarefas tem um total de: " + listaTarefas.obterNumeroTotalTarefas() + " tarefas.");

            listaTarefas.obterDescricoesTarefas();

            System.out.println("informe a descrição da tarefa que deseja remover");
            String descricaoRemover = scanner.nextLine();

            listaTarefas.removerTarefa(descricaoRemover);
            System.out.println("Agora sua lista de tarefas tem um total de: " + listaTarefas.obterNumeroTotalTarefas() + " tarefas.");
            
        } 
    }
    
}