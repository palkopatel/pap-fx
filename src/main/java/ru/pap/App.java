package ru.pap;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import ru.pap.controllers.BetGrid;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * http://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
 * http://docs.oracle.com/javase/8/javafx/graphics-tutorial/canvas.htm
 * http://docs.oracle.com/javase/8/javafx/graphics-tutorial/image_ops.htm
 * <p>
 * http://docs.oracle.com/javase/8/javafx/interoperability-tutorial/concurrency.htm
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        Scene scene = new Scene(root, 1350, 800);

        primaryStage.setTitle("PAP Application");
        primaryStage.setScene(scene);
        primaryStage.show();
//        primaryStage.setTitle("PAP Application");
//        Button btn = new Button("OK");
//        Pane root = new TilePane();
//        root.getChildren().add(btn);
//        primaryStage.setScene(new Scene(root, 300, 250));
//        primaryStage.show();
    }

}
