package aulas.aula15.exemplo01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

    static void main(String[] args) {
        String caminhoArquivo = "src/aulas/aula15/exemplo01/numeros.txt";
        BufferedReader br;
        FileReader fr;
        int somaNumeros = 0;

        try {
            fr = new FileReader(caminhoArquivo);
            br = new BufferedReader(fr);

            String linha = null;
            do {
                linha = br.readLine();

                if (linha != null) {
                    int n = Integer.parseInt(linha);
                    somaNumeros = somaNumeros + n;
                }
            } while (linha != null);

            System.out.println("Soma dos números lidos: " + somaNumeros);

            br.close();
            fr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir arquivo para leitura!");
        }
        catch (IOException e) {
            System.out.println("Erro ao ler linha do arquivo!");
        }
    }

}
