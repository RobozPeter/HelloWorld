package hu.petrik.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Optional;

public class HelloController {

    @FXML
    private Label koszontoSzoveg;
    @FXML
    private TextField nevMezo;

    @FXML
    public void koszontes(ActionEvent actionEvent) {
        String nev = nevMezo.getText().trim();
        if (nev.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setTitle("Hiba!");
            alert.setContentText("Nem adott meg nevet!");
            alert.getButtonTypes().add(ButtonType.OK);
            ButtonType optbuttontype = alert.showAndWait().orElse(ButtonType.CLOSE);
            System.out.println("Nem adott meg nevet!"+optbuttontype);
        } else {
            koszontoSzoveg.setText("Hello, " + nev + "!");
        }
    }
}
