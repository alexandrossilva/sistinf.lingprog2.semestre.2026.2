package aulas.aula02.exemplo01;

import java.util.Scanner;

public class Programa {

    static void main(String[] args) {
        final int TAM = 5;
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        double media;
        int[] numeros = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            soma = soma + numeros[i];
        }

        media = soma / (double)TAM;

        System.out.println("Média: " + media);
    }

}