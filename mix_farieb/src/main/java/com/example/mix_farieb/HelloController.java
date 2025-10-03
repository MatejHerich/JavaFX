package com.example.mix_farieb;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Rectangle colorBox;
    private int red = 0,green = 0,blue = 0;
    private Color color;
    @FXML
    private Label redlabel, greenlabel, bluelabel;

    private void updateColor() {
        colorBox.setFill(Color.rgb(red, green, blue));
    }

    @FXML
    public void initialize() {
        color = Color.rgb(red,green,blue);
        colorBox.setFill(color);
    }

    @FXML
    public void redplus() {
        red += 5;
        red = Math.min(255, Math.max(0, red));
        updateColor();
        redlabel.setText("RED: " + red);
    }
    @FXML
    public void redminus() {
        red -= 5;
        red = Math.min(255, Math.max(0, red));
        updateColor();
        redlabel.setText("RED: " + red);
    }
    @FXML
    public void greenplus() {
        green += 5;
        green = Math.min(255, Math.max(0, green));
        updateColor();
        greenlabel.setText("GREEN: " + green);
    }
    @FXML
    public void greenminus() {
        green -= 5;
        green = Math.min(255, Math.max(0, green));
        updateColor();
        greenlabel.setText("GREEN: " + green);
    }
    @FXML
    public void blueplus() {
        blue += 5;
        blue = Math.min(255, Math.max(0, blue));
        updateColor();
        bluelabel.setText("BLUE: " + blue);
    }
    @FXML
    public void blueminus() {
        blue -= 5;
        blue = Math.min(255, Math.max(0, blue));
        updateColor();
        bluelabel.setText("BLUE: " + blue);
    }

}