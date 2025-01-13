package com.listas.exercicios.exercicioquatro;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List <Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    
    public int calcularSoma(){
        int soma = 0;
        for(int numeroAtual : numeros){
            soma += numeroAtual; 
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = numeros.get(0);
        if(!numeros.isEmpty()){
            for(int numeroAtual : numeros){
                if(numeroAtual > maior){
                    maior = numeroAtual;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = numeros.get(0);
        if(!numeros.isEmpty()){
            for(int numeroAtual : numeros){
                if(numeroAtual < menor){
                    menor = numeroAtual;
                }
            }
        }
        return menor;

    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }
}
