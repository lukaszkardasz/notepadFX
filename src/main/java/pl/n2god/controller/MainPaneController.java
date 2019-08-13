package pl.n2god.controller;


import javafx.fxml.FXML;

public class MainPaneController {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    public void initialize(){
        controlPaneController.getClearButton().setOnAction(actionEvent ->
                contentPaneController.getMainTextArea().clear());
    }

}
