package com.example.crapsgame2602;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = new VBox();
        Label infolabel = new Label( "CLICK HERE");
        Button helloBtn = new Button("Saludar");
        root.getChildren().add(infolabel);
        root.getChildren().add(helloBtn);
        Scene scene = new Scene(root, 250, 250);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}