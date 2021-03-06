package ru.pap.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aa10a on 22.04.17.
 */
public class MainApp implements Initializable {
    private Logger logger = Logger.getLogger(MainApp.class.getName());

    @FXML
    private BetGrid controller;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        logger.log(Level.INFO, "initialize.. " + this.getClass().getName());
    }
}
