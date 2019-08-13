package pl.n2god.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController {

    @FXML
    private TextArea mainTextArea;

    public TextArea getMainTextArea() {
        return mainTextArea;
    }
}
