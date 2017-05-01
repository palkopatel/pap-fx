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
public class Table implements Initializable {
    private Logger logger = Logger.getLogger(Table.class.getName());

    private String[] cards = {"A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"};
    @FXML
    private AnchorPane handRow_0;
    @FXML
    private AnchorPane handRow_1;
    @FXML
    private AnchorPane handRow_2;
    @FXML
    private AnchorPane handRow_3;
    @FXML
    private AnchorPane handRow_4;
    @FXML
    private AnchorPane handRow_5;
    @FXML
    private AnchorPane handRow_6;
    @FXML
    private AnchorPane handRow_7;
    @FXML
    private AnchorPane handRow_8;
    @FXML
    private AnchorPane handRow_9;
    @FXML
    private AnchorPane handRow_10;
    @FXML
    private AnchorPane handRow_11;
    @FXML
    private AnchorPane handRow_12;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane[] panels = {handRow_0,
                handRow_1, handRow_2, handRow_3, handRow_4,
                handRow_5, handRow_6, handRow_7, handRow_8,
                handRow_9, handRow_10, handRow_11, handRow_12};
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
                    Label label = (Label) ((GridPane) children2.get(0)).getChildren().get(0);
                    String text = label.getText();
                    String newTest = num < num2 ? card + text + "s": (text + card + (num != num2 ? "o" : ""));
                    label.setText(newTest);
                }
            }
        }
        logger.log(Level.INFO, "initialize.. " + this.getClass().getName());
    }
}
