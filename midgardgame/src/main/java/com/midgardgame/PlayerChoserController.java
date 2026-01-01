package com.midgardgame;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class PlayerChoserController implements Initializable{
    
    @FXML private ImageView heroImageView;
    @FXML private VBox characterBox;


    @SuppressWarnings("unused")
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // heroImageView.fitWidthProperty().bind(characterBox.widthProperty().subtract(20));
        // heroImageView.fitHeightProperty().bind(characterBox.heightProperty().subtract(20));
        Image logo = new Image(getClass().getResourceAsStream("/com/midgardgame/images/HeroImage/gollum.png"));

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
