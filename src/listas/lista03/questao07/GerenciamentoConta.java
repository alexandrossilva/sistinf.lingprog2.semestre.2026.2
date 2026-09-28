package temp.listas.lista03.questao07;

import java.util.Scanner;
import temp.listas.lista03.questao04.Conta;

public class GerenciamentoConta {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entrada, pelo usuário, de limite da conta
        System.out.print("Digite limite da conta: ");
        double limite = scanner.nextDouble();
        scanner.nextLine();

        // instanciação de novo objeto da classe Conta
        Conta conta = new Conta(limite);

        String op;

        // bloco de repetição de operações de depósito e saque
        do {
            // entrada, pelo usuário, de operação a ser realizada
            System.out.print("Operação (depósito, saque ou encerramento) a realizar [D|S|E]: ");
            op = scanner.nextLine();

            // realização de operação de acordo com entrada
            switch (op.toLowerCase()) {
                // operação de depósito
                case "d":
                    System.out.print("Digite valor a ser depositado: ");
                    double deposito = scanner.nextDouble();     // entrada de valor a ser depositado
                    scanner.nextLine();
                    conta.depositar(deposito);                  // execução de operação de depósito
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                // operação de saque
                case "s":
                    System.out.print("Digite valor a ser sacado: ");
                    double saque = scanner.nextDouble();        // entrada de valor a ser sacado
                    scanner.nextLine();
                    conta.sacar(saque);                         // execução de operação de saque
                    System.out.println("Saque realizado com sucesso!");
                    break;
            }
        } while (!op.equalsIgnoreCase("e"));

        System.out.println("Saldo final da conta: " + conta.getSaldo());
    }

}
