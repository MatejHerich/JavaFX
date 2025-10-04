package com.example.guessthenumber;

import javafx.fxml.FXML;
import java.util.Random;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label answer;

    @FXML
    private TextField textIn;

    private Random random = new Random();
    private int number;

    @FXML
    public void initialize() {
        number = random.nextInt(101);
        answer.setText("Guess a number in the range 0-100");
    }

    @FXML
    public void submit() {
        String attempt = textIn.getText();
        if (Integer.parseInt(attempt) > number)
            answer.setText("Too big");
        else if (Integer.parseInt(attempt) < number)
            answer.setText("Too small");
        else
            answer.setText("Correct");
    }
    @FXML
    public void reset() {
        number = random.nextInt(101);
        answer.setText("Guess a number in the range 0-100");
    }


}