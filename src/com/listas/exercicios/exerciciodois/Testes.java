package com.listas.exercicios.exerciciodois;

public class Testes {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Café", 10.99, 2);
        carrinhoDeCompras.adicionarItem("Chocolate", 3.99, 1);

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Café");

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());


    }
}   
