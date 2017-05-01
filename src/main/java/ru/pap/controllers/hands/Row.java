package ru.pap.controllers.hands;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aa10a on 23.04.17.
 */
public class Row implements Initializable {
    private Logger logger = Logger.getLogger(Row.class.getName());

    private String[] cards = {"A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"};
    @FXML
    private AnchorPane handCell_0;
    @FXML
    private AnchorPane handCell_1;
    @FXML
    private AnchorPane handCell_2;
    @FXML
    private AnchorPane handCell_3;
    @FXML
    private AnchorPane handCell_4;
    @FXML
    private AnchorPane handCell_5;
    @FXML
    private AnchorPane handCell_6;
    @FXML
    private AnchorPane handCell_7;
    @FXML
    private AnchorPane handCell_8;
    @FXML
    private AnchorPane handCell_9;
    @FXML
    private AnchorPane handCell_10;
    @FXML
    private AnchorPane handCell_11;
    @FXML
    private AnchorPane handCell_12;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane[] panels = {handCell_0,
                handCell_1, handCell_2, handCell_3, handCell_4,
                handCell_5, handCell_6, handCell_7, handCell_8,
                handCell_9, handCell_10, handCell_11, handCell_12};
        for (AnchorPane panel : panels) {
            String[] num = panel.getId().split("_");
            String card = cards[Integer.valueOf(num[1])];
            ObservableList<Node> children = panel.getChildren();
            Label label = (Label) ((GridPane) children.get(0)).getChildren().get(0);
            label.setText(card);
        }
//        logger.log(Level.INFO, "initialize.. " + this.getClass().getName());
    }
}
