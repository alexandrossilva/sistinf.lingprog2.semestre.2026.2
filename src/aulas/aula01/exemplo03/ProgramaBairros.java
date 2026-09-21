package aulas.aula01.exemplo03;

import java.util.Scanner;

public class ProgramaBairros {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // comentário de linha contendo declaração de variável-objeto b1
        // Bairro b1 = new Bairro();
        Bairro b2 = new Bairro("Candeias");

        System.out.print("Digite o nome do bairro: ");
        Bairro b3 = new Bairro(sc.nextLine());

        // existência de erro em linha abaixo considerando-se comentário da linha de declaração da variável-objeto b1
        // System.out.println("Endereço do objeto criado da classe Bairro: " + b1);
    }

}
