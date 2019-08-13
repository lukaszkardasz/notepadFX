/**
 * @project Notepad
 * @author n2god on 13/08/2019
 */module Notepad {

    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.n2god.main;
    opens pl.n2god.controller to javafx.fxml;
}