module com.example.builderdp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.builderdp to javafx.fxml;
    exports com.example.builderdp;
}