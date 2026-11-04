package aulas.aula13.exemplo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeituraLinhas {

    public static String caminhoArquivo = "funcionarios.txt";

    public static void main(String[] args) {
        ArrayList<String> linhas = lerLinhas();

        for (int i = 0; i < linhas.size(); i++) {
            System.out.println(linhas.get(i));
        }
    }

    public static ArrayList<String> lerLinhas() {
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> linhas = new ArrayList<String>();

        try {
            fr = new FileReader(caminhoArquivo);
            br  = new BufferedReader(fr);

            String linha = null;

            do {
                linha = br.readLine();
                if (linha != null) {
                    linhas.add(linha);
                }
            } while (linha != null);

            br.close();
            fr.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado ou não acessível!");
        }
        catch(IOException e) {
            System.out.println("Erro de entrada/saída");
        }

        return linhas;
    }

}
