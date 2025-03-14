package org.example;

public class Calculadora {
    // Somar dois números inteiros
    int soma(int a, int b){
        return a + b;
    }

    // Somar dois números de ponto flutuante
    double soma (double a, double b){
        return a+b;
    }

    // Somar três números inteiros
    int soma(int a, int b, int c){
        return a + b + c;
    }

    // Somar um array de números inteiros
    int soma(int [] numeros){
        int somaTotal = 0;
        for(int numero: numeros){
            somaTotal += numero;
        }
        return somaTotal;
    }

    // Subtrair dois números inteiros
    int subtrair (int a, int b){
        return a - b;
    }

    // Subtrair dois números de ponto flutuante
    double subtrair (double a, double b){
        return a - b;
    }

    // Subtrair três números inteiros
    int subtrair(int a, int b, int c){
        return a - b - c;
    }

    // Subtrair um array de números inteiros
    int subtrair(int a, int b, int c, int d, int e){
        int [] numeros = new int[] {a,b,c,d,e};
        int subtracaoTotal = 0;
        for (int numero: numeros){
            subtracaoTotal = numero - subtracaoTotal;
        }
        return subtracaoTotal;
    }

    int subtrair(int [] numeros){
        int subtracaoTotal = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            subtracaoTotal -= numeros[i];
        }
        return subtracaoTotal;
    }

    // Multiplicar dois números inteiros
    int multiplicar(int a, int b){
        return a*b;
    }

    // Multiplicar dois números flutuantes
    double multiplicar(double a, double b){
        return a*b;
    }

    // Multiplicar três números inteiros
    int multiplicar(int a, int b, int c){
        return (a*b)*c;
    }

    // Multiplicar números inteiros
    int multiplicar(int a, int b, int c, int d, int e){
        int [] numeros = new int[]{a,b,c,d,e};
        int multTotal = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            multTotal -= numeros[i];
        }
        return multTotal;
    }

    int multiplicar(int [] numeros){
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            resultado -= numeros[i];
        }
        return resultado;
    }


    // Dividir dois números inteiros
    int dividir(int a, int b){
        return a/b;
    }

    // Dividir dois números flutuantes
    double dividir(double a, double b){
        return a/b;
    }

    // Dividir três números inteiros
    int dividir(int a, int b, int c){
        return (a/b)/c;
    }

    // Dividir números inteiros
    int dividir(int a, int b, int c, int d, int e){
        int [] numeros = new int[]{a,b,c,d,e};
        int divisaoTotal = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            divisaoTotal /= numeros[i];
        }
        return divisaoTotal;
    }

    int dividir(int [] numeros){
        int divisaoTotal = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            divisaoTotal /= numeros[i];
        }
        return divisaoTotal;
    }


}
