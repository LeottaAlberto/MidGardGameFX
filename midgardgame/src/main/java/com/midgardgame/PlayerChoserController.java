package com.midgardgame;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PlayerChoserController implements Initializable{
    
    @FXML
    private ImageView heroImageView;

    @SuppressWarnings("unused")
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image logo = new Image(getClass().getResourceAsStream("/com/midgardgame/images/HeroImage/gollum_pl.png"));
        
        System.out.println("\n\n\n\nLOGO" + logo + "\n\n\n");

        if (logo != null) {
            heroImageView.setImage(logo);
        } else {
            System.err.println("Errore: Immagine non trovata al percorso specificato!");
        }
    }

    @FXML
    private void switchToHub() throws IOException {
        App.setRoot("hub");
    }
}
