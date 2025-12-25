package com.example.typespeed;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TypeSpeedApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // === Main Menu ===
        Button playButton = new Button("Play");
        Button exitButton = new Button("Exit");

        playButton.setOnAction(e -> openGameWindow());
        exitButton.setOnAction(e -> primaryStage.close());

        VBox menu = new VBox(20, playButton, exitButton);
        menu.setAlignment(Pos.CENTER);

        Scene menuScene = new Scene(menu, 400, 300);
        primaryStage.setScene(menuScene);
        primaryStage.setTitle("TypeSpeed - Menu");
        primaryStage.show();
    }

    private void openGameWindow() {
        // New Window
        Stage gameStage = new Stage();

        Label textLabel = new Label("Type this text...");
        Button backButton = new Button("Back to Menu");
        backButton.setOnAction(e -> gameStage.close());

        VBox gameLayout = new VBox(20, textLabel, backButton);
        gameLayout.setAlignment(Pos.CENTER);

        Scene gameScene = new Scene(gameLayout, 800, 600);
        gameStage.setScene(gameScene);
        gameStage.setTitle("TypeSpeed - Game");
        gameStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
