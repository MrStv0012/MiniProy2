module com.example.miniproyecto2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.miniproyecto2 to javafx.fxml;
    exports com.example.miniproyecto2;
}