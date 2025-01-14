package com.map.exercicios.exerciciotres;

public class Testes {
    public static void main(String[] args) {   
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        
        estoqueProdutos.adicionarProduto(123, "Café", 10.49, 100);

        estoqueProdutos.adicionarProduto(123, "Leite", 4.49, 102);

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

    }

}
