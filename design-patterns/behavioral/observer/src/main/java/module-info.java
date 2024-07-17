module com.stk.observer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stk.observer to javafx.fxml;
    exports com.stk.observer;
}