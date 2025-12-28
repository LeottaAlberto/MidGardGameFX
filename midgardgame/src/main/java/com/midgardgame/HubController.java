package com.midgardgame;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HubController implements Initializable {

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
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
