package br.com.clinica.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class ViewMain extends Application {
    private static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        ScrollPane scrollPane = FXMLLoader.load(getClass().getResource("ViewMain.fxml"));
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        primaryStage.setTitle("Clínica de Podologia");
        primaryStage.setScene(new Scene(scrollPane, 1024, 768));
        primaryStage.show();
    }

    public static Scene getMainScene(){
        return mainScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
