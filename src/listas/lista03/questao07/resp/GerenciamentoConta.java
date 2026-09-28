package temp.listas.lista03.questao07.resp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciamentoConta {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instanciação de novo objeto da classe Conta utilizando-se método criarConta
        Conta conta = criarConta(scanner);

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
                    // tentativa de realização de operação de depósito
                    try {
                        // entrada de valor a ser depositado utlizando-se método lerNumero
                        double deposito = lerNumero(scanner, "Digite valor a ser depositado: ");
                        conta.depositar(deposito);                      // execução de operação de depósito
                        System.out.println("Depósito realizado com sucesso!");
                    }
                    // captura de exceção em caso de não efetivação de depósito exibindo-se mensagem
                    catch(IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Depósito não realizado!");
                    }
                    break;
                // operação de saque
                case "s":
                    // tentativa de realização de operação de depósito
                    try {
                        // entrada de valor a ser sacado utlizando-se método lerNumero
                        double saque = lerNumero(scanner, "Digite valor a ser sacado: ");
                        conta.sacar(saque);                         // execução de operação de saque
                        System.out.println("Saque realizado com sucesso!");
                    }
                    // captura de exceção (seja qual for) em caso de não efetivação de saque
                    catch(Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Saque não realizado!");
                    }
                    break;
            }
        } while (!op.equalsIgnoreCase("e"));

        System.out.println("Saldo final da conta: " + conta.getSaldo());
    }

    // instanciação e retorno de objeto da classe Conta a partir de dados fornecidos pelo usuário
    public static Conta criarConta(Scanner scanner) {
        // repetição, se necessário, de leitura de limite e instanciação/retorno de objeto
        do {
            // entrada, pelo usuário, de limite utilizando-se do método lerNumero
            double limite = lerNumero(scanner, "Digite limite da conta: ");

            if (limite >= 0) {              // se limite for positivo ou igual a 0 (zero)...
                return new Conta(limite);   // instanciação e retorno de objeto da classe Conta
            }
            else {                          // caso contrário...
                System.out.println("Limite deve ser positivo ou igual a 0 (zero)!");
            }
        } while (true);
    }

    // leitura e retorno de número utilizando-se de objeto Scanner e mensagem de entrada
    public static double lerNumero(Scanner scanner, String mensagem) {
        // bloco de repetição (se necessário) de leitura de entrada numérica
        do {
            System.out.print(mensagem);                 // listagem de mensagem
            // tentativa de leitura de número e retorno dele
            try {
                double numero = scanner.nextDouble();   // leitura de entrada numérica
                scanner.nextLine();                     // descarte de caracteres não processados
                return numero;                          // retorno de número fornecido
            }
            // captura de exceção com listagem de mensagem de erro
            catch (InputMismatchException e) {
                System.out.println("Entrada fornecida não corresponde a um número!");
                scanner.nextLine();                     // descarte de caracteres não processados
            }
        } while (true);
    }

}