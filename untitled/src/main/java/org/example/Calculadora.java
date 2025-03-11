package org.example;

class Calculadora {
    // Metodo para somar dois inteiros
    int soma(int a, int b) {
        return a + b;
    }

    // Metodo para somar três inteiros
    int soma(int a, int b, int c) {
        return a + b + c;
    }

    // Metodo para somar dois números em ponto flutuante
    double soma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Array de notas
        int[] notas = new int[4];

        // Atribuindo valores
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 93;

        // Acessando valores
        System.out.println("Primeira nota: " + notas[0]);

        // Percorrendo um array com for tradicional
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Usando foreach para percorrer o array
        for (int nota : notas) {
            System.out.println("Notas: " + nota);
        }
    }
}
