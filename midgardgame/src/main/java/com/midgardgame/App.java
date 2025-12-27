package com.midgardgame;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("hub"), 1600, 1200);
        
        String css = this.getClass().getResource("styles/baseStyle.css").toExternalForm();
        String hubCSS = this.getClass().getResource("styles/hubStyle.css").toExternalForm();
        scene.getStylesheets().add(css);
        scene.getStylesheets().add(hubCSS);
        
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
        // try {

        // } catch (final Exception e) {
        //     // Questo ti mostra la causa reale (es. "Button non trovato")
        //     e.getCause().printStackTrace(); 
        //     // Oppure, se la causa ha un'altra causa:
        //     Throwable t = e.getCause();
        //     while (t.getCause() != null) t = t.getCause();
        //     System.err.println("ERRORE REALE: " + t.getMessage());
        // }
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}