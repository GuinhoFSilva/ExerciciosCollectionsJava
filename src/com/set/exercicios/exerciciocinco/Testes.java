package com.set.exercicios.exerciciocinco;

public class Testes {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Café", 123, 11.00, 2);

        cadastroProdutos.adicionarProduto("Chocolate", 321, 10.00, 5);

        cadastroProdutos.adicionarProduto("PS5", 231, 3000.00, 6);

        cadastroProdutos.adicionarProduto("Teste", 123, 500.00, 1);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());

    }   
}
