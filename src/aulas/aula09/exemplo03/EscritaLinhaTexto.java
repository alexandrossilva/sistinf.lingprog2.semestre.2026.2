package aulas.aula09.exemplo03;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaLinhaTexto {

    static void main(String[] args) {
        String caminhoArquivo = "texto.txt";
        FileWriter fluxo = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        try {
            fluxo = new FileWriter(caminhoArquivo, true);
            fluxo.write(texto + "\n");
            System.out.println("Texto gravado em arquivo!");
            fluxo.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo inexistente no caminho indicado!");
        } catch (IOException e) {
            System.out.println("Erro em operação de saída!");
        }
    }

}
