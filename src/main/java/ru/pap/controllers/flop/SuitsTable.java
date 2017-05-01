package ru.pap.controllers.flop;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Labeled;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by aa10a on 01.05.17.
 */
public class SuitsTable implements Initializable {
    private Logger logger = Logger.getLogger(SuitsTable.class.getName());
    private String[] cards = {"A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"};
    @FXML
    private AnchorPane suitCol_0;
    @FXML
    private AnchorPane suitCol_1;
    @FXML
    private AnchorPane suitCol_2;
    @FXML
    private AnchorPane suitCol_3;
    @FXML
    private AnchorPane suitCol_4;
    @FXML
    private AnchorPane suitCol_5;
    @FXML
    private AnchorPane suitCol_6;
    @FXML
    private AnchorPane suitCol_7;
    @FXML
    private AnchorPane suitCol_8;
    @FXML
    private AnchorPane suitCol_9;
    @FXML
    private AnchorPane suitCol_10;
    @FXML
    private AnchorPane suitCol_11;
    @FXML
    private AnchorPane suitCol_12;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane[] panels = {suitCol_0,
                suitCol_1, suitCol_2, suitCol_3, suitCol_4,
                suitCol_5, suitCol_6, suitCol_7, suitCol_8,
                suitCol_9, suitCol_10, suitCol_11, suitCol_12};
        for (AnchorPane panel : panels) {
            String[] split = panel.getId().split("_");
            Integer num = Integer.valueOf(split[1]);
            String card = cards[num];
            ObservableList<Node> children = ((GridPane)panel.getChildren().get(0)).getChildren();
            for (Node child : children) {
                if(child instanceof AnchorPane) {
                    AnchorPane panel2 = (AnchorPane)child;
                    String[] split2 = panel2.getId().split("_");
                    Integer num2 = Integer.valueOf(split2[1]);
                    ObservableList<Node> children2 = panel2.getChildren();
                    Labeled label = (Labeled) ((GridPane) children2.get(0)).getChildren().get(0);
                    String text = label.getText();
                    label.setText(card + text);
                }
            }
        }

    }
}
