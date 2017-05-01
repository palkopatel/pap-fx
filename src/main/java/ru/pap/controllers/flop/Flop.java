package ru.pap.controllers.flop;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import ru.pap.App;

import java.net.URL;
import java.util.*;

/**
 * Created by aa10a on 01.05.17.
 */
public class Flop implements Initializable {
    private List<String> cards = new ArrayList<>();
    private List<Card> buttons = new ArrayList<>();
    @FXML
    private Labeled boardId;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        App.register(Flop.class, this);
        boardId.setText("Board: ");
    }

    public void updateFlop(String card, Card flopButtonId) {
        if (cards.contains(card)) {
            return;
        }
        if (cards.size() >= 3) {
            cards.remove(0);
            buttons.remove(0).reset();
        }
        cards.add(card);
        buttons.add(flopButtonId);
        boardId.setText("Board: " + String.join(" ", cards));
    }
}
