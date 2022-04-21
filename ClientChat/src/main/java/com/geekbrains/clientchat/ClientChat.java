package com.geekbrains.clientchat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientChat extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientChat.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("!ChatMe!");
        stage.setScene(scene);
        ClientController controller = fxmlLoader.getController();
        controller.userList.getItems().addAll("Павел", "Иван", "Виктор Борисович");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}