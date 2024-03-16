package com.mimi.fr.contract.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Tu m'as cliqué dessus !");
        label.setText("Hello World!");
    }

    public void initialize() {
        // TODO
    }
}