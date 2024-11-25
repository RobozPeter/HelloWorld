module hu.petrik.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.helloworld to javafx.fxml;
    exports hu.petrik.helloworld;
}