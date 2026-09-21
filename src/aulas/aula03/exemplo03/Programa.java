package aulas.aula03.exemplo03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    static void main(String[] args) {
        final int TAM = 5;
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media;
        int[] numeros = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            do {
                try {
                    System.out.print("Digite o " + (i + 1) + "º numero: ");
                    numeros[i] = scanner.nextInt();
                }
                catch(InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("Não é um número válido. Informe-o novamente!");
                }
            } while (true);
        }

        for (int i = 0; i < TAM; i++) {
            soma = soma + numeros[i];
        }

        media = soma / TAM;

        System.out.println("Média: " + media);
    }

}