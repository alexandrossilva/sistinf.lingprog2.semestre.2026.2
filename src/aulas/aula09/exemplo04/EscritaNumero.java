package aulas.aula09.exemplo04;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaNumero {

    static void main(String[] args) {
        String caminhoArquivo = "numeros.txt";
        FileWriter fluxo = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        try {
            fluxo = new FileWriter(caminhoArquivo, true);
            fluxo.write(n + "\n");
            System.out.println("Número gravado em arquivo!");
            fluxo.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo inexistente no caminho indicado!");
        } catch (IOException e) {
            System.out.println("Erro em operação de saída!");
        }
    }

}
