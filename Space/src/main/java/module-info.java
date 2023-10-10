module se233.space {
    requires javafx.controls;
    requires javafx.fxml;


    opens se233.space to javafx.fxml;
    exports se233.space;
}