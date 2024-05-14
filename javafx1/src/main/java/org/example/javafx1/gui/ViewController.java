package org.example.javafx1.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.javafx1.gui.util.Alerts;
import javafx.scene.control.Alert.AlertType;
import org.example.javafx1.gui.util.Constraints;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


public class ViewController implements Initializable {
    // O Initializable é uma interface que será chamada quando a tela for carregada

    @FXML
    private TextField txtNumber1;
    @FXML
    private TextField txtNumber2;
    @FXML
    private Label labelResult;
    @FXML
    private Button btSum;

    @FXML
    public void onBtSumAction() {
        //Alerts.showAlert("Alert Title", "Alert header", "Hello!", AlertType.CONFIRMATION);
        try {
            Locale.setDefault(Locale.US);
            double numer1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double sum = numer1 + number2;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Formato inválido", e.getMessage(), AlertType.ERROR);
        }
        }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldDouble(txtNumber2);
        Constraints.setTextFieldMaxLength(txtNumber1, 4);
        Constraints.setTextFieldMaxLength(txtNumber2, 4);
    }
}
