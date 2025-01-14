package com.set.exercicios.exercicioseis;

public class Testes {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Guilherme", 1010, 10);
        gerenciadorAlunos.adicionarAluno("Eduardo", 1011, 7);
        gerenciadorAlunos.adicionarAluno("João", 1111, 5);
        gerenciadorAlunos.adicionarAluno("Gabriel", 1111, 8); // Não será adicionado

        gerenciadorAlunos.removerAluno(1111);

        System.out.println(gerenciadorAlunos.exibirAlunoPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());

        gerenciadorAlunos.exibirAlunos();
    }
}
