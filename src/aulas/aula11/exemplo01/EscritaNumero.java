package aulas.aula11.exemplo01;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Escrita de caracteres em arquivo de texto usando a classe FileWriter
public class EscritaNumero {

    static void main(String[] args) {
        String caminhoArquivo = "numeros.txt";      // caminho do arquivo no qual serão realizadas operações de escrita
        FileWriter fluxo = null;                    // fluxo de escrita
        Scanner scanner = new Scanner(System.in);   // scanner de fluxo de entrada padrão (teclado)

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();                  // leitura de número

        try {
            // criação de fluxo de escrita baseado em caminho de arquivo definido anteriormente (sem sobrescrever conteúdo anterior do arquivo)
            fluxo = new FileWriter(caminhoArquivo, true);
            fluxo.write(n + "\n");              // escrita de número (convertido em string) em arquivo após concatenção com caractere de quebra de linha
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
