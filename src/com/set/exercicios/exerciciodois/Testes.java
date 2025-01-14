package com.set.exercicios.exerciciodois;

public class Testes {
    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        
        conjuntoPalavrasUnicas.adicionarPalavra("Teste");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste");
        conjuntoPalavrasUnicas.adicionarPalavra("PalavraUm");
        conjuntoPalavrasUnicas.adicionarPalavra("PalavraDois");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        
        conjuntoPalavrasUnicas.removerPalavra("Teste");
        
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("PalavraDois"));


    }
}
