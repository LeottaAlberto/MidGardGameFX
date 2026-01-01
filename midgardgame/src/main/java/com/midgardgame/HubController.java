package com.midgardgame;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class HubController implements Initializable {
    @FXML
    private Button exitButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button playButton;

    @FXML
    private VBox hubContainer;


    @FXML
    private ImageView hubTitle;

    @SuppressWarnings("unused")
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image logo = new Image(getClass().getResourceAsStream("/com/midgardgame/images/HubImage/titleDef.png"));
        
        if (logo != null) {
            hubTitle.setImage(logo);
        } else {
            System.err.println("Errore: Immagine non trovata al percorso specificato!");
        }
    }

    @FXML
    private void switchToPlayerChoser() throws IOException {
        App.setRoot("playerChoser");
    }
    @FXML
    private void switchToSettings() throws IOException {
        App.setRoot("settings");
    }
    @FXML
    private void closeApp() throws IOException {
        Platform.exit();
        System.exit(0);
    }
}
