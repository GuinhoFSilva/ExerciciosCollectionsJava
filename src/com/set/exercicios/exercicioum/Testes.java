package com.set.exercicios.exercicioum;

public class Testes {
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Total de convidados: " + conjuntoConvidado.contarConvidados());

        conjuntoConvidado.adicionarConvidado("Roberto", 001);
        conjuntoConvidado.adicionarConvidado("James", 007);
        conjuntoConvidado.adicionarConvidado("FakeBond", 007); // Não vai ser adicionado
        conjuntoConvidado.adicionarConvidado("Bond", 700);

        System.out.println("Total de convidados: " + conjuntoConvidado.contarConvidados());
        
        conjuntoConvidado.removerConvidadoPorCodigo(001);
        
        System.out.println("Total de convidados: " + conjuntoConvidado.contarConvidados());
        
        conjuntoConvidado.exibirConvidados();

    }
}
