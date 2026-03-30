package org.example.baitaplon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

class Bidder {

}

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
