package aulas.aula11.exemplo07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Leitura, a partir de arquivo de texto, de dados de funcionários usando as classes FileReader e FileReader
public class LeituraFuncionario {

    static void main(String[] args) {
        String caminhoArquivo = "funcionarios.txt";             // caminho do arquivo no qual serão realizadas operações de escrita

        FileReader fluxoArquivo = null;                         // fluxo de leitura de arquivo
        BufferedReader fluxoBuffer = null;                      // fluxo de leitura com buffer para armazenamento temporário dos dados lidos

        try {
            // criação de fluxo de leitura de arquivo baseado em caminho definido anteriormente
            fluxoArquivo = new FileReader(caminhoArquivo);
            // criação de fluxo de leitura com buffer usando-se fluxo de leitura de arquivo criado anteriormente
            fluxoBuffer = new BufferedReader(fluxoArquivo);

            String linha = fluxoBuffer.readLine();              // leitura de linha de texto a parti de fluxo de leitura com buffer

            System.out.println("Linha lida: " + linha);         // listagem de linha de texto linha

            fluxoBuffer.close();                                // fechamento de fluxo de leutura com buferr
            fluxoArquivo.close();                               // fechamento de fluxo de leitura de arquivo
        } catch (FileNotFoundException e) {                     // captura de exceção por inexistência de arquivo
            System.out.println("Arquivo inexistente no caminho indicado!");
        } catch (IOException e) {                               // captura de exceção por erro de entrada/saída
            System.out.println("Erro em operação de entrada!");
        }
    }

}
