package com.listas.exercicios.exerciciotres;

public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getTitulo(){
        return titulo;
    } 
    
    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return anoPublicacao;
    }

    public String toString(){
        return titulo + " " + autor + " " + anoPublicacao;
    }
}