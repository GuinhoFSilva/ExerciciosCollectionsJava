package com.listas.exercicios.exercicioseis;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List <Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List <Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(numeros);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }

    public List <Integer> ordenarDecrescente(){
        List<Integer> numeroDecrescente = new ArrayList<>(numeros);
        numeroDecrescente.sort(Collections.reverseOrder());
        return numeroDecrescente;
    }
    
}

