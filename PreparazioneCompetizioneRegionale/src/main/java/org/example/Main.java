package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        var root = new StackPane(new Label("JavaFX is running ✅"));
        var scene = new Scene(root, 600, 400);

        stage.setTitle("Skill 09 Starter");
        stage.setMinWidth(500);
        stage.setMinHeight(350);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
