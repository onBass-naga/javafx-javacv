package com.example.cv;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        var root = new VBox();
        var label = new Label("Hello JavaFX!!");
        root.getChildren().add(label);
        Scene scene = new Scene(root, 800, 640);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
