package aulas.aula10.exemplo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class EscritaLinhaTexto {

    static void main(String[] args) {
        String caminhoArquivo = "texto.txt";
        FileOutputStream fluxo = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine() + "\n";

        try {
            fluxo = new FileOutputStream(caminhoArquivo, true);
            byte[] bytes = texto.getBytes();
            System.out.println("Texto em bytes: " + Arrays.toString(bytes));
            fluxo.write(bytes);
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
