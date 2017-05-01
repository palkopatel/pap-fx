package ru.pap.controllers.flop;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by aa10a on 01.05.17.
 */
public class Suit implements Initializable {
    private Logger logger = Logger.getLogger(Suit.class.getName());
    private String[] cards = {"♣", "♦", "♥", "♠"};
    private Color[] colors = {Color.GREEN, Color.BLUE, Color.RED, Color.BLACK};
    @FXML
    private AnchorPane suitRow_0;
    @FXML
    private AnchorPane suitRow_1;
    @FXML
    private AnchorPane suitRow_2;
    @FXML
    private AnchorPane suitRow_3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane[] panels = {suitRow_0, suitRow_1, suitRow_2, suitRow_3};
        for (AnchorPane panel : panels) {
            String[] num = panel.getId().split("_");
            Integer index = Integer.valueOf(num[1]);
            String card = cards[index];
            ObservableList<Node> children = panel.getChildren();
            GridPane gridPane = (GridPane) children.get(0);
            Labeled label = (Button) gridPane.getChildren().get(0);
            label.setText(card);
            label.setTextFill(colors[index]);
            label.setPadding(new Insets(2, 2, 2, 2));
        }
        logger.fine("initialize.. " + this.getClass().getName());

    }
}
