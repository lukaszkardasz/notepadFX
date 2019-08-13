package pl.n2god.controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        controlPaneController.getClearButton().setOnAction(x ->
                contentPaneController.getMainTextArea().clear());
    }
}
