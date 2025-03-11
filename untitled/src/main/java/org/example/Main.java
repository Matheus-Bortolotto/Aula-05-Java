package org.example;

public class Main{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        //Chama o método com dois inteiros
        System.out.println(calc.soma(2,3));
        //Chama o médoto com três inteiros
        System.out.println(calc.soma(2,3,4));
        //Chama o método com números em ponto flutuantes
        System.out.println(calc.soma(2.5,3.5));
    }
}