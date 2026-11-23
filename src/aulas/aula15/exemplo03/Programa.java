package aulas.aula15.exemplo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

    static void main(String[] args) {
        String caminhoArquivo = "src/aulas/aula15/exemplo03/numerospositivos.txt";
        BufferedReader br;
        FileReader fr;
        int menorNegativo = 0;
        int maiorPositivo = 0;

        try {
            fr = new FileReader(caminhoArquivo);
            br = new BufferedReader(fr);

            String linha = null;
            do {
                linha = br.readLine();

                if (linha != null) {
                    int n = Integer.parseInt(linha);
                    if (n < 0 && n < menorNegativo) { menorNegativo = n; }
                    if (n > 0 && n > maiorPositivo) { maiorPositivo = n; }
                }
            } while (linha != null);

            if (menorNegativo == 0) {
                System.out.println("Não há números negativos no arquivo lido!");
            }
            else {
                System.out.println("Menor número negativo: " + menorNegativo);
            }

            if (maiorPositivo == 0) {
                System.out.println("Não há números positivos no arquivo lido!");
            }
            else {
                System.out.println("Maior número positivo: " + maiorPositivo);
            }

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