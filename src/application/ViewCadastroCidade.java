package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewCadastroCidade extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane anchorPanePane = FXMLLoader.load(getClass().getResource("ViewCadastroCidade.fxml"));

        primaryStage.setTitle("Cadastro de Cidade");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(anchorPanePane, 529, 140));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
