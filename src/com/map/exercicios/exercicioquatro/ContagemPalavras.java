package com.map.exercicios.exercicioquatro;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras(){
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        } else {
            System.out.println("Não há palavras cadastradas");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public String encontrarPalavraMaisFrequente(){
        int frequente = 0;
        String palavraEncontrada = null;
        if(!palavrasMap.isEmpty()){
            for(var entry : palavrasMap.entrySet()){
                if(entry.getValue() > frequente){
                    frequente = entry.getValue();
                    palavraEncontrada = entry.getKey();
                }
            }
        }
        return palavraEncontrada;
    }
}

