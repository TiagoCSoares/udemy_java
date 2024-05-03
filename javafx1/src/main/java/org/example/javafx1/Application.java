package org.example.javafx1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        try {
            // Parent é uma super classe de todos os elementos de interface gráfica
            Parent parent = FXMLLoader.load(getClass().getResource("gui/View.fxml"));
            //FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(parent);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}