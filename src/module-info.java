module Fontes {

    requires javafx.controls;
    requires javafx.fxml;

    opens aulas.aula14.exemplo01 to javafx.fxml;
    opens aulas.aula14.exemplo02 to javafx.fxml;

    exports aulas.aula14.exemplo01;
    exports aulas.aula14.exemplo02;

}