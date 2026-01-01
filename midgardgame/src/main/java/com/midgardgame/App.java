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
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        scene = new Scene(loadFXML("hub"), 1200, 800);
        
        String css = this.getClass().getResource("styles/baseStyle.css").toExternalForm();
        String hubCSS = this.getClass().getResource("styles/hubStyle.css").toExternalForm();
        String choserCSS = this.getClass().getResource("styles/playerChoserStyle.css").toExternalForm();
        scene.getStylesheets().add(css);
        scene.getStylesheets().add(hubCSS);
        scene.getStylesheets().add(choserCSS);
        
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
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