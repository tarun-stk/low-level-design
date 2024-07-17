module com.stk.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stk.tictactoe to javafx.fxml;
    exports com.stk.tictactoe;
}