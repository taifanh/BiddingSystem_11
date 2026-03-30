module org.example.baitaplon {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.baitaplon to javafx.fxml;
    exports org.example.baitaplon;
}