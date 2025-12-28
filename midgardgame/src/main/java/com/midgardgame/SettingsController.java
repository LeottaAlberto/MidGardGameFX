package com.midgardgame;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SettingsController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("hub");
    }

    @FXML
    private Button playButton;
}