package aulas.aula06.exemplo01;

import java.util.Scanner;

public class GerenciadorNumerosReais {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaReais lista = null;                // lista de números reais (não inicializada)

        // bloco de repetição para entrada, pelo usuário, de capacidade da lista e instanciação, após isso, dela
        do {
            System.out.print("Digite a capacidade da lista: ");
            try {
                int capacidade = Integer.parseInt(sc.nextLine());   // entrada de capacidade
                lista = new ListaReais(capacidade);                 // instanciação de lista
                break;                                              // encerramento de bloco de repetição
            }
            catch (IllegalArgumentException e) {                    // captura e tratamento de exceção em caso de entrada de capacidade inválida
                System.out.print(e.getMessage());
                System.out.println(" Será solicitao que você informe-a novamente!");
            }
        } while (true);

        int op = -1;                            // código de príxima operação

        // bloco de repetição de operações com a lista instanciada
        do {
            System.out.println();
            System.out.println("Operações: 0 -> Encerrar | 1 -> Inserir | 2 -> Listar");
            System.out.print("Digite próxima operação [0|1|2]: ");

            try {
                op = Integer.parseInt(sc.nextLine());               // entrada de código de próxima operação

                switch (op) {                       // seleção de operação de acordo com entrada
                    case 1:                         // entrada de número e inserção em lista
                        System.out.print("Digite número real a ser inserido: ");
                        double numero = Double.parseDouble(sc.nextLine());
                        lista.adicionar(numero);
                        break;
                    case 2:                         // listagem de números inseridos na lista
                        System.out.println("Lista atual: " + lista.getElementos());
                        break;
                }
            }
            catch (IllegalStateException e) {       // captura e tratamento de exceção em caso de inserção com lista cheia
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException e) {       // captura e tratamento de exceção em caso de entrada não for número válido
                System.out.println("Entrada não corresponde a um número formatado corretamente!");
            }
        } while (op != 0);
    }

}