package ru.pap.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aa10a on 23.04.17.
 */
public class Square implements Initializable {
    private Logger logger = Logger.getLogger(Square.class.getName());

    @FXML
    private Label cellId;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        logger.log(Level.INFO, "initialize.. " + this.getClass().getName());
    }
}
