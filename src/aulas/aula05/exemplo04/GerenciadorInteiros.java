package aulas.aula05.exemplo04;

import java.util.Scanner;

public class GerenciadorInteiros {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaInteiros lista;                    // lista de inteiros (não inicializada)

        System.out.print("Digite a capacidade da lista: ");
        int capacidade = Integer.parseInt(sc.nextLine());

        lista = new ListaInteiros(capacidade);

        int op = 0;

        do {
            System.out.println();
            System.out.println("Operações: 0 -> Encerrar | 1 -> Inserir | 2 -> Listar");
            System.out.print("Digite próxima operação [0|1|2]: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("Digite inteiro a ser inserido: ");
                    int numero = Integer.parseInt(sc.nextLine());
                    lista.adicionar(numero);
                    break;
                case 2:
                    System.out.println("Lista atual: " + lista.getElementos());
                    break;
            }
        } while (op != 0);
    }

}