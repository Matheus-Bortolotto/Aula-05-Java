package org.example;

public class Array {
    public static void main(String[] args) {
        // Array com 5 posições
        int[] numeros = new int[5];

        // Array inicializados com valores
        String[] nomes = {"João", "Maria", "Pedro"};

        // Array de precos inicializado
        double[] precos = new double[]{1.99, 2.99, 3.99};

        // Exemplo de uso de array
        int[] notas = new int[4];

        // Atribuindo valores
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 93;

        // Acessando valores
        System.out.println("Primeira nota: " + notas[0]);

        // Percorrendo um array com for tradicional
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Usando foreach para percorrer o array
        for (int nota : notas){
            System.out.println("Notas: " + nota);
        }
    }
}
