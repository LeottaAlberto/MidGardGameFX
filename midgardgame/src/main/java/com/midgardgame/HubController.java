package com.midgardgame;

import java.io.IOException;

import javafx.fxml.FXML;

public class HubController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
