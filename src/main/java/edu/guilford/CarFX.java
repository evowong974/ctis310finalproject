package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class CarFX extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiate a VBox root node
        VBox root = new VBox();
        // Add a label to the root node
        // root.getChildren().add(new Label("Hello World!"));

        ArrayList<Car> cars = new ArrayList<Car>();
        // Build a loop that fills the Cars Array with new objects
        for (int i = 0; i < 10; i++) {
           cars.add(new Car());
        

        }

        // Instantiate an IndividualPane object and add it to the root node
        root.getChildren().add(new CarPane(cars));
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}