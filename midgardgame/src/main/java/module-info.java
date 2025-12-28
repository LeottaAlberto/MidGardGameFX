module com.midgardgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.midgardgame to javafx.fxml;
    exports com.midgardgame;
}
