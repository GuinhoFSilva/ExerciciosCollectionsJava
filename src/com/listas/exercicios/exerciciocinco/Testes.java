package com.listas.exercicios.exerciciocinco;

public class Testes {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Leandro", 24, 1.80);
        ordenacaoPessoa.adicionarPessoa("Fernando", 28, 1.79);
        ordenacaoPessoa.adicionarPessoa("Guilherme", 20, 1.84);

       System.out.println(ordenacaoPessoa.ordenarPorIdade());

       System.out.println(ordenacaoPessoa.ordenarPorAltura());

       ordenacaoPessoa.mostrarPessoas();
    }
}
