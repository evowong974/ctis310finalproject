package edu.guilford;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ArrayList<Car> cars;

    private int currentUser = 0;
    

    // GUI attributes
        private Label userNameLabel;
        private Label carTypeLabel;
        private ChoiceBox carTypeChoiceBox1;
        private ChoiceBox carTypeChoiceBox2;
        private Button submitButton;
        private Button nextButton;
        private Button previousButton;
        private Button exitButton;
        
        // Image view attributes
        private ImageView carImageView;
        private ImageView carImageView2;


        public CarPane(ArrayList<Car> cars) {
    
        this.cars = cars;
        // Instantiate GUI attributes
        }
        
    
        



    
}
