package edu.guilford;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CarPane extends GridPane {

	private ArrayList<Car> cars;

    // private int currentUser = 0;
    

    // GUI attributes
        private Label userLabel;
        private TextField userTextField;
        private Label Question1;
        private Label followupLabel;
        private ChoiceBox <String> carTypeChoiceBox;
        private Button submitButton;
        private Button nextButton;
        private Button previousButton;
        private Button editButton; 
        private Slider slider1;
        private Slider invisibleSlider;
        private Slider colorSlider;

        private ImageView avatarView1;
        private ImageView avatarView2;
        
        public CarPane(ArrayList<Car> cars) {
    
        this.cars = cars;
        // Instantiate GUI attributes
        userLabel = new Label("User: ");
        userTextField = new TextField();
        Question1 = new Label("What is your preferable car type? ");
        followupLabel = new Label("Out of 10, how important is fuel efficiency to you?");
  
        

         // set the followup label to be disabled
         followupLabel.setDisable(true);


        // slider from 1 - 10 and add that to the pane with tickmarks 
            slider1 = new Slider(1, 10, 1);
            slider1.setShowTickMarks(true);
            slider1.setShowTickLabels(true);
            slider1.setMajorTickUnit(1);
            slider1.setBlockIncrement(1);
            slider1.setSnapToTicks(true);
            slider1.setMinorTickCount(0);

            // invisible slider 
            invisibleSlider = new Slider(0, 255, 100);
            invisibleSlider.setShowTickMarks(true);
            invisibleSlider.setShowTickLabels(true);
            invisibleSlider.setMajorTickUnit(50);
            invisibleSlider.setBlockIncrement(10);
            invisibleSlider.setSnapToTicks(true);
            invisibleSlider.setMinorTickCount(0);

            // color slider
            colorSlider = new Slider(0, 255, 100);
            colorSlider.setShowTickMarks(true);
            colorSlider.setShowTickLabels(true);
            colorSlider.setMajorTickUnit(50);
            colorSlider.setBlockIncrement(10);
            colorSlider.setSnapToTicks(true);
            colorSlider.setMinorTickCount(0);
            


       // instantiate the choice box
        carTypeChoiceBox = new ChoiceBox<String>();
        carTypeChoiceBox.getItems().add("Gasoline");
        carTypeChoiceBox.getItems().add("Electric");

        // instantiate the buttons
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
        this.add(userLabel, 0, 0);
        this.add(userTextField, 1, 0);
        this.add(Question1, 0, 1);
        this.add(carTypeChoiceBox, 1, 1);
        this.add(followupLabel, 0, 2);
        this.add(slider1, 0, 4);
      // put the avatarView1 on bottom left side of the panel
        this.add(avatarView1, 0, 10);
        // put the avatarView2 on bottom right side of the panel
        this.add(avatarView2, 4, 10);
            this.add(invisibleSlider, 0, 11);
    // set the color slider to the right of the pane
            this.add(colorSlider, 4, 11);
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
                    followupLabel.setDisable(true);
    
                } else if (newValue.equals("Electric")) {
                    followupLabel.setDisable(false);
                    followupLabel.setText("Out of 10, how important you is battery range to you?");

                }
            });

            // Add a listener for the invisible slider
            invisibleSlider.valueProperty().addListener((v, oldValue, newValue) -> {
                // invisible mode
                avatarView1.setOpacity(newValue.doubleValue() / 255);
                avatarView2.setOpacity(newValue.doubleValue() / 255);
                
            });

            // Add a listener for the color slider in rainbow mode using hsb color
            colorSlider.valueProperty().addListener((v, oldValue, newValue) -> {
                // rainbow mode
                double value = colorSlider.getValue();
                // Set the background color of the pane to the value of the slider using the hsb
                // color model
                this.setStyle("-fx-background-color: hsb(" + value + ", 100%, 100%)");
                // change the color of the label text so it's visible when the background is
            
                // do the same for the slider text
                colorSlider.setStyle("-fx-text-fill: hsb(" + (value + 180) % 360 + ", 100%, 100%)");

        });
        
    
        



    
}
}