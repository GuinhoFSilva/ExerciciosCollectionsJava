package com.listas.exercicios.exerciciotres;

public class Testes {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K Rowling", 1997);
        
        catalogoLivros.adicionarLivro("Harry Potter e a Câmara Secreta", "J.K Rowling", 1998);
        
        catalogoLivros.adicionarLivro("O Ladrão de Raios - Percy Jackson e os Olimpianos", "Rick Riordan", 2005);

        catalogoLivros.adicionarLivro("O Mar de Monstros - Percy Jackson e os Olimpianos", "Rick Riordan", 2006);

        System.out.println(catalogoLivros.pesquisarPorAutor("Rick Riordan"));

        System.out.println(catalogoLivros.pesquisarPorAutor("J.K Rowling"));
        
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1998, 2005));
        
        System.out.println(catalogoLivros.pesquisaPorTiulo("Harry Potter e a Pedra Filosofal"));

        System.out.println(catalogoLivros.pesquisaPorTiulo("aaa"));

        catalogoLivros. mostrarLivros();
    }
    

}
