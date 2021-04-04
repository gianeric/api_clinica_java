package br.com.clinica.application.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewCadastroCliente extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane anchorPanePane = FXMLLoader.load(getClass().getResource("ViewCadastroCliente.fxml"));

        primaryStage.setTitle("Cadastro de Cliente");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(anchorPanePane, 621, 228));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
