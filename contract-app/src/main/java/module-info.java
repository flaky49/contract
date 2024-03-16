module com.mimi.fr.contract.app {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    opens com.mimi.fr.contract.app to javafx.fxml;

    exports com.mimi.fr.contract.app;

}