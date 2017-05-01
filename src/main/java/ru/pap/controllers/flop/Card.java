package ru.pap.controllers.flop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import ru.pap.App;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by aa10a on 01.05.17.
 */
public class Card implements Initializable {
    private Logger logger = Logger.getLogger(Card.class.getName());

    @FXML
    private Button flopButtonId;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void reset() {
        flopButtonId.setStyle("");
    }

    public void flopButton(MouseEvent mouseEvent) {
        logger.fine("Label : " + flopButtonId.getText() + "; event type : " + mouseEvent.getEventType());
        Flop flop = (Flop) App.getController(Flop.class);
        flop.updateFlop(flopButtonId.getText(), this);
        flopButtonId.setStyle("-fx-background-color: #888888");
    }
}
