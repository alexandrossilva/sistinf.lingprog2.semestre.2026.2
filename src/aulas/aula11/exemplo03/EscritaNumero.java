package aulas.aula11.exemplo03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// Escrita de caracteres em arquivo de texto usando a classe PrintWriter
public class EscritaNumero {

    static void main(String[] args) {
        String caminhoArquivo = "numeros.txt";      // caminho do arquivo no qual serão realizadas operações de escrita
        PrintWriter fluxo = null;                   // fluxo de escrita
        Scanner scanner = new Scanner(System.in);   // scanner de fluxo de entrada padrão (teclado)

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();                  // leitura de número

        try {
            // criação de fluxo de escrita baseado em caminho de arquivo definido anteriormente (conteúdo anterior do arquivo é sobrescrito)
            fluxo = new PrintWriter(caminhoArquivo);
            fluxo.println(n);                       // escrita, em arquivo, de número (conversão automática para string) e, após isso, de quebra de linha
            System.out.println("Número gravado em arquivo!");
            fluxo.close();                          // fechamento de fluxo de escrita
            scanner.close();                        // fechamento de fluxo de entrada usado pelo scanner
        } catch (FileNotFoundException e) {         // captura de exceção por inexistência de arquivo
            System.out.println("Arquivo inexistente no caminho indicado!");
        } catch (IOException e) {                   // captura de exceção por erro de entrada/saída
            System.out.println("Erro em operação de saída!");
        }
    }

}
