module com.time {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.time to javafx.fxml;
    exports com.time;
}
