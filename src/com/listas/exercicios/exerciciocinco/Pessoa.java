package com.listas.exercicios.exerciciocinco;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public String toString(){
        return nome + " " + idade + " " + altura;
    }

 

}

class ComparatorPorAltura implements Comparator<Pessoa>{
    public int compare(Pessoa p1, Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}