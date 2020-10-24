module main {
    exports ml.ovcorp.javafx.template;
    opens ml.ovcorp.javafx.template to javafx.graphics;

    requires javafx.fxml;
    requires javafx.controls;
}