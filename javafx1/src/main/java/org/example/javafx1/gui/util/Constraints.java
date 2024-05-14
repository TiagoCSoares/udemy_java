package org.example.javafx1.gui.util;

import javafx.scene.control.TextField;

public class Constraints {

    public static void setTextFieldInteger(TextField txt) {
        // Listener para verificar se o valor digitado é um número inteiro
        // Sempre que o valor do campo txt mudar, o listener será chamado
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && !newValue.matches("\\d*")) {
                txt.setText(oldValue); //"\\d*" é uma expressão regular que significa "um ou mais dígitos"
            }
        });
    }

    public static void setTextFieldMaxLength(TextField txt, int max) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && newValue.length() > max) {
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldDouble(TextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
                txt.setText(oldValue);
            }
        });
    }
}
