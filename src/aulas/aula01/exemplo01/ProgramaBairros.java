package aulas.aula01.exemplo01;

import java.util.Scanner;

public class ProgramaBairros {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bairro b1 = new Bairro();

        System.out.print("Digite o nome do bairro: ");
        b1.nome = sc.nextLine();

        System.out.println("Endereço do objeto criado da classe Bairro: " + b1);
    }

}
