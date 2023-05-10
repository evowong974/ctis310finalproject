package edu.guilford;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CarPane extends GridPane {

	private ArrayList<Car> cars;

    // private int currentUser = 0;
    

    // GUI attributes
        private Label userNameLabel;
        private Label carTypeLabel;
        private ChoiceBox <String> carTypeChoiceBox;

        private Button submitButton;
        private Button nextButton;
        private Button previousButton;
        private Button editButton; 

        private ImageView avatarView1;
        private ImageView avatarView2;
        
        public CarPane(ArrayList<Car> cars) {
    
        this.cars = cars;
        // Instantiate GUI attributes
        userNameLabel = new Label("User: ");
        carTypeLabel = new Label("Car Type: ");
        carTypeChoiceBox.getItems().add("Gasoline based");
        carTypeChoiceBox.getItems().add("Electric based");
        submitButton = new Button("Submit");
        nextButton = new Button("Next");
        previousButton = new Button("Previous");
        editButton = new Button("Edit");

        new ImageView();
        File avatar1 = new File(this.getClass().getResource("electric_fueled_tesla")
                .getPath());
        System.out.println("file:" + avatar1.getPath());

        File avatar2 = new File(this.getClass().getResource("gasoline_fueled_tesla")
                .getPath());
        System.out.println("file:" + avatar2.getPath());

       avatarView1 = new ImageView(avatar2.toURI().toString());

        // Add GUI attributes to the pane
        this.add(userNameLabel, 0, 0);
        this.add(carTypeLabel, 0, 1);
        this.add(carTypeChoiceBox, 1, 1);
        this.add(submitButton, 0, 2);
        this.add(nextButton, 0, 3);
        this.add(previousButton, 1, 3);
        this.add(editButton, 0, 4);
    
        this.add(avatarView1, 0, 5);
        this.add(avatarView2, 1, 5);

       

        }
        
    
        



    
}
