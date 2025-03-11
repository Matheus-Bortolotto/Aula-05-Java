package org.example;

public class Aluno {
    private  String nome;
    private int idade;

    //Construtor padrão (sem parâmetros)
    public Aluno(){
        nome = "Não Informado";
        idade = 0;
    }

    //Construtor com parâmetros
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
