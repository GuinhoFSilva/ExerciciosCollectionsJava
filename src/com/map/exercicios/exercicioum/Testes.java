package com.map.exercicios.exercicioum;

public class Testes {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato um", 123123123);

        agendaContatos.adicionarContato("Contato um", 123123133); // Não vai ser adicionado
        
        agendaContatos.adicionarContato("Contato dois", 321321321);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Contato um");

        System.out.println(agendaContatos.pesquisarPorNome("Contato dois"));

    }
}
