module com.os.factorydp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.os.factorydp to javafx.fxml;
    exports com.os.factorydp;
}