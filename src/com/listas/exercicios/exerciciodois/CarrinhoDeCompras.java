package com.listas.exercicios.exerciciodois;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    List <Item> ListaItens;

    public CarrinhoDeCompras(){
        this.ListaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        ListaItens.add(new Item(nome, preco, quantidade)); 
    }

    public void removerItem(String nome){
        List <Item> itensParaRemover = new ArrayList<>();
        for(Item i : ListaItens){
            if(i.getNome().equals(nome)){
                itensParaRemover.add(i);
            }
        }
        ListaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0;
        for(Item i : ListaItens){
            double precoAtual = i.getPreco();
            int qtdAtual = i.getQuantidade();
            
            soma += precoAtual * qtdAtual;
        }
        return soma;
    }

    public void exibirItens(){
       System.out.println(ListaItens);
    }


}