module com.example.ilaxzworldz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ilaxzworldz to javafx.fxml;
    exports com.example.ilaxzworldz;
}