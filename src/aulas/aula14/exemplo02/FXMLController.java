package aulas.aula14.exemplo02;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private TextField campoNumero;

    @FXML
    private Button botaoRaiz;

    @FXML
    private void calcularRaizQuadrada() {
        double n = Double.parseDouble(campoNumero.getText());
        double r = Math.sqrt(n);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Raiz Quadrada de " + n + ": " + r);
        alerta.showAndWait();
    }

}