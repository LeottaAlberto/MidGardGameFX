module com.midgardgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.midgardgame to javafx.fxml;
    exports com.midgardgame;
}
