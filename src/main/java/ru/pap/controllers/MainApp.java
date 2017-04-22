package ru.pap.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by aa10a on 22.04.17.
 */
public class MainApp implements Initializable {

    @FXML
    private BetGrid controller;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initialize.. " + this.getClass().getName());
    }
}
