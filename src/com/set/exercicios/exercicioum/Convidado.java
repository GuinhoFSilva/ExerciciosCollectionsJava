package com.set.exercicios.exercicioum;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado (String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome(){
        return nome;
    }
    
    public int getCodigo(){
        return codigoConvite;
    }

    public String toString(){
        return nome + " " + codigoConvite;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

}
