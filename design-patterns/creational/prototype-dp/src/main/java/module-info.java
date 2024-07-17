module com.stk.prototypedp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stk.prototypedp to javafx.fxml;
    exports com.stk.prototypedp;
}