module com.MidGardGame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.MidGardGame to javafx.fxml;
    exports com.MidGardGame;
}
