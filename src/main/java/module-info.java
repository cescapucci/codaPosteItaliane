module com.example.posteitaliane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.posteitaliane to javafx.fxml;
    exports com.example.posteitaliane;
}