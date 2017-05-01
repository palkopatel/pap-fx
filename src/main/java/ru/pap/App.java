package ru.pap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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

    private static final Map<Class, Object> controllers = new ConcurrentHashMap<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("App.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 1350, 800);
        primaryStage.setTitle("PAP Application");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
        primaryStage.show();
    }


    public static void register(Class<?> className, Object controller) {
        controllers.put(className, controller);
    }

    public static Object getController(Class<?> className) {
        return controllers.get(className);
    }
}
