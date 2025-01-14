package com.set.exercicios.exerciciodois;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public String verificarPalavra(String palavra){
        String palavraEncontrada = null;
        for(String procurarPalavra : palavrasUnicas){
            if(procurarPalavra.equals(palavra)){
                palavraEncontrada = procurarPalavra;
                break;
            }
        }
        return palavraEncontrada;
    }   

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

}
