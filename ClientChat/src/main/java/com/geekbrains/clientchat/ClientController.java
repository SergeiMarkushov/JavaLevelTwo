package com.geekbrains.clientchat;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.util.Date;

public class ClientController {

    @FXML
    public TextField massageField;
    @FXML
    public Button sendMassageButton;
    @FXML
    public TextArea massageTextArea;
    @FXML
    public ListView userList;

    public void appendMassageToChat(ActionEvent actionEvent) {
        if(!massageField.getText().isEmpty()) {
            massageTextArea.appendText(DateFormat.getDateTimeInstance().format(new Date()));
            massageTextArea.appendText(System.lineSeparator());
            if (!userList.getSelectionModel().isEmpty()){
                String sender = userList.getSelectionModel().getSelectedItem().toString();
                massageTextArea.appendText("To " + sender + ":");
                massageTextArea.appendText(System.lineSeparator());
            }else{
                massageTextArea.appendText("Me: ");
            }
            massageTextArea.appendText(massageField.getText().trim());
            massageTextArea.appendText(System.lineSeparator());
            massageTextArea.appendText(System.lineSeparator());
            requestFocus();
            massageField.clear();
        }
    }

    private void requestFocus(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                massageField.requestFocus();
            }
        });
    }
}