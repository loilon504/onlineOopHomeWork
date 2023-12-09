module com.example.onlinehomework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.onlinehomework to javafx.fxml;
    exports com.example.onlinehomework;
}