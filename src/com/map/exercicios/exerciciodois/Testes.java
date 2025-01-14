package com.map.exercicios.exerciciodois;

public class Testes {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.removerPalavra("Palavra");

        dicionario.adicionarPalavra("Palavra", "unidade da língua escrita, situada entre dois espaços em branco, ou entre espaço em branco e sinal de pontuação.");

        dicionario.adicionarPalavra("dicionário", "compilação completa ou parcial das unidades léxicas de uma língua");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("dicionário"));


    }
}
