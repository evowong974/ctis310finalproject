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
       // instantiate the choice box
        carTypeChoiceBox = new ChoiceBox<String>();
        carTypeChoiceBox.getItems().add("Gasoline");
        carTypeChoiceBox.getItems().add("Electric");
        submitButton = new Button("Submit");
        nextButton = new Button("Next");
        previousButton = new Button("Previous");
        editButton = new Button("Edit");

        new ImageView();
        File avatar1 = new File(this.getClass().getResource("/electric_fueled_tesla.jpg")
                .getPath());
        System.out.println("file:" + avatar1.getPath());
        this.avatarView1 = new ImageView("file:" + avatar1.getPath());
        File avatar2 = new File(this.getClass().getResource("/gas_fueled_audi.jpg")
                .getPath());
        System.out.println("file:" + avatar2.getPath());
        this.avatarView2 = new ImageView("file:" + avatar2.getPath());
    //    avatarView1 = new ImageView(avatar1.toURI().toString());
    //     avatarView2 = new ImageView(avatar2.toURI().toString());
        // Add GUI attributes to the pane
        this.add(userNameLabel, 0, 0);
        this.add(carTypeLabel, 0, 1);
        this.add(carTypeChoiceBox, 1, 1);

        this.add(submitButton, 0, 2);
        this.add(nextButton, 0, 3);
        this.add(previousButton, 1, 3);
        this.add(editButton, 0, 4);

      // put the avatarView1 on bottom left side of the panel
        this.add(avatarView1, 0, 5);
        // put the avatarView2 on bottom right side of the panel
        this.add(avatarView2, 4, 5);

        // Resize the images
        avatarView1.setFitHeight(200);
        avatarView1.setFitWidth(300);

        avatarView2.setFitHeight(200);
        avatarView2.setFitWidth(300);




        

       

        }
        
    
        



    
}
