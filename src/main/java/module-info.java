module com.sistemamos.leticia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens com.sistemamos.leticia to javafx.fxml;
    exports com.sistemamos.leticia;
    exports com.sistemamos.leticia.controller;
    opens com.sistemamos.leticia.controller to javafx.fxml;
}