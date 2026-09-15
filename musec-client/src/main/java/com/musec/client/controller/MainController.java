package com.musec.client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private VBox sidebar;
    
    @FXML
    private Label nowPlayingTitle;
    
    @FXML
    private Label nowPlayingArtist;
    
    @FXML
    private Slider progressSlider;
    
    @FXML
    private Slider volumeSlider;

    @FXML
    public void initialize() {
        // Initialization logic for UI components goes here
        nowPlayingTitle.setText("No Track Selected");
        nowPlayingArtist.setText("");
    }

    @FXML
    public void handlePlayPause() {
        System.out.println("Play/Pause clicked");
        // Logic to toggle play/pause state
    }

    @FXML
    public void handleNextTrack() {
        System.out.println("Next track clicked");
        // Logic for next track
    }

    @FXML
    public void handlePreviousTrack() {
        System.out.println("Previous track clicked");
        // Logic for previous track
    }
}
