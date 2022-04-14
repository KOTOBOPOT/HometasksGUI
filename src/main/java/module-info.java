module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens thatsFun to javafx.fxml;
    exports thatsFun;
}