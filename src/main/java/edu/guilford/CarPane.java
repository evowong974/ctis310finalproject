package edu.guilford;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CarPane extends GridPane {

	private ArrayList<Car> cars;

    // private int currentUser = 0;
    

    // GUI attributes
        private Label Question1;
        private Label followupLabel;
        private TextField followupText;
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
        Question1 = new Label("What is your preferable car type? ");
        followupLabel = new Label("Out of 10, how important is fuel efficiency to you?");
        followupText = new TextField();

         // set the followup label and text to be disabled
         followupLabel.setDisable(true);
        followupText.setDisable(true);


       // instantiate the choice box
        carTypeChoiceBox = new ChoiceBox<String>();
        carTypeChoiceBox.getItems().add("Gasoline");
        carTypeChoiceBox.getItems().add("Electric");
        submitButton = new Button("Submit");
        nextButton = new Button("Next");
        previousButton = new Button("Previous");
        editButton = new Button("Edit");

        // set the next button and the previous button to be disabled
        previousButton = new Button("Previous");
        nextButton = new Button ("Next");
        previousButton.setDisable(true);
        nextButton.setDisable(false);

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
        this.add(Question1, 0, 1);
        this.add(carTypeChoiceBox, 1, 1);
        this.add(followupLabel, 0, 2);
        this.add(followupText, 1, 2);
        this.add(submitButton, 0, 3);
        this.add(previousButton, 0, 4);
        this.add(nextButton, 1, 4);
        this.add(editButton, 2, 4);

      // put the avatarView1 on bottom left side of the panel
        this.add(avatarView1, 0, 10);
        // put the avatarView2 on bottom right side of the panel
        this.add(avatarView2, 4, 10);

        // Resize the images
        avatarView1.setFitHeight(200);
        avatarView1.setFitWidth(300);

        avatarView2.setFitHeight(200);
        avatarView2.setFitWidth(300);

            // Pane border
            this.setStyle("-fx-border-color: black; -fx-padding: 10px;");
            // Thicker border
            this.setStyle("-fx-border-width: 3px; -fx-border-color: black; -fx-padding: 10px;");
            // Pane background color
            this.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");
            // Pane spacing
            this.setHgap(10);
            this.setVgap(10);

            // Event listeners
            // add a listener to the choice box
            carTypeChoiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
                if (newValue.equals("Gasoline")) {
                    followupLabel.setDisable(false);
                    followupText.setDisable(false);
                } else if (newValue.equals("Electric")) {
                    followupLabel.setDisable(true);
                    followupText.setDisable(true);
                }
            });


        

       

        }
        
    
        



    
}
