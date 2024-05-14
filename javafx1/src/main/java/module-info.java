module org.example.javafx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx1 to javafx.fxml;
    opens org.example.javafx1.gui to javafx.fxml;

    exports org.example.javafx1;
    exports org.example.javafx1.gui to javafx.fxml;
}