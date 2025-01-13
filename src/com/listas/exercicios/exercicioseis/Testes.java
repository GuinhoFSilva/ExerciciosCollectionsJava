package com.listas.exercicios.exercicioseis;

public class Testes {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(199);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(ordenacaoNumeros.ordenarDecrescente());



    }
}
