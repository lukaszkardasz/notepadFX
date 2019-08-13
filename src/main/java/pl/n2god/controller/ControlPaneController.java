package pl.n2god.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlPaneController {

    @FXML
    private Button clearButton;

    public Button getClearButton() {
        return clearButton;
    }
}
