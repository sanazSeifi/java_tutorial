module com.example.java_tutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_tutorial to javafx.fxml;
    exports com.example.java_tutorial;
}