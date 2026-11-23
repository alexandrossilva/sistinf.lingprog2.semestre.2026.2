package aulas.aula15.exemplo04;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programa extends Application {

    @Override
    public void start(Stage stage) {
        String caminhoArquivo = "src/aulas/aula15/exemplo04/numeros.txt";
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


            String mensagem;

            if (menorNegativo == 0) {
                mensagem = "Não há números negativos no arquivo lido!";
            }
            else {
                mensagem = "Menor número negativo: " + menorNegativo;
            }

            if (maiorPositivo == 0) {
                mensagem = mensagem + "\nNão há números positivos no arquivo lido!";
            }
            else {
                mensagem = mensagem + "\nMaior número positivo: " + maiorPositivo;
            }

            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setHeaderText(null);
            alerta.setContentText(mensagem);
            alerta.showAndWait();

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

    static void main(String[] args) {
        launch(args);
    }

}