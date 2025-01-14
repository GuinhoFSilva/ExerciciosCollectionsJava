package com.set.exercicios.exerciciotres;

public class Testes {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Novo Contato 1", 40028922);
        agendaContatos.adicionarContato("Novo Contato 2", 40028923);
        agendaContatos.adicionarContato("Novo Contato 3", 40028924);
        agendaContatos.adicionarContato("Jorge", 40028925);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("Novo")); // Vai mostrar todos os contatos que começam com "Novo"

        agendaContatos.atualizarNumeroContato("Jorge", 123456789);

        agendaContatos.exibirContatos();

    }
}
