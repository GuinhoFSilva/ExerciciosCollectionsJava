package com.map.exercicios.exercicioquatro;

public class Teste {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra", 1000);
        contagemPalavras.adicionarPalavra("Word", 1001);

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

        contagemPalavras.exibirContagemPalavras();
        
        contagemPalavras.removerPalavra("Word");
        
        contagemPalavras.exibirContagemPalavras();
    }
}
