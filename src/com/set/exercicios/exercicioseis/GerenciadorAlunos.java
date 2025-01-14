package com.set.exercicios.exercicioseis;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula){
        Aluno alunoParaRemover = null;
        for(Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }


}
