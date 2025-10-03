package com.example.stopwatch;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class HelloController {
    private int seconds = 0;
    private String format;
    private Timeline timeline;

    private void udpateFormat(){
        format = String.format("%02d:%02d:%02d", seconds/3600,(seconds%3600)/60,seconds%60);
    }

    @FXML
    private Label watch;
    @FXML
    public void initialize() {
        timeline = new Timeline( new KeyFrame(Duration.seconds(1), e -> { seconds++; udpateFormat();watch.setText(format);}));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }
    @FXML
    public void start() {
        timeline.play();

    }
    @FXML
    public void stop() {
        timeline.stop();
    }

    @FXML
    public void reset() {
        timeline.stop();
        seconds = 0;
        udpateFormat();
        watch.setText(format);
    }

}