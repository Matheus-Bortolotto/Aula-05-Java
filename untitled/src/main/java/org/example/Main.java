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
        System.out.println(calc.soma(new int[]{1,2,3,5,6,7,8,8,10}));
        System.out.println(calc.subtrair(2.5,3.5));
        System.out.println(calc.subtrair(5,3));
        System.out.println(calc.subtrair(5,3,1));
        System.out.println(calc.subtrair(new int[]{1,2,3,5,6,7,8,8,10}));
        System.out.println(calc.multiplicar(1,2));
        System.out.println(calc.multiplicar(5.5,3.5));
        System.out.println(calc.multiplicar(1,2,5));
        System.out.println(calc.multiplicar(1,2,5,8,9));
        System.out.println(calc.multiplicar(new int[]{1,2,3,5,6,7,8,8,10}));
        System.out.println(calc.dividir(1,2));
        System.out.println(calc.dividir(5.5,3.5));
        System.out.println(calc.dividir(1,2,5));
        System.out.println(calc.dividir(1,2,5,8,9));
        System.out.println(calc.dividir(new int[]{1,2,3,5,6,7,8,8,10}));
    }
}