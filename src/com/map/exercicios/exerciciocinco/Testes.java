package com.map.exercicios.exerciciocinco;

import java.time.LocalDate;

public class Testes {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 9), "Olimptech", "Show de Banda");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 10), "Olimptech", "Apresentação teatral");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 12, 11), "Olimptech", "Stand-Up");

        agendaEventos.exibirAgenda();

        agendaEventos.proximoEvento();
    }
}
