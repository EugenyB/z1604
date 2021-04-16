package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import logic.WierszTrojkataPascala;

public class Controller {

    @FXML
    private TextArea textArea;
    @FXML
    private TextField numOfRowField;

    public void calculate() {
        textArea.clear();
        try {
            int n = Integer.parseInt(numOfRowField.getText());
            if (n<0) {
                textArea.setText("Nieprawidlowy numer wiersza");
            } else {
                for (int i = 0; i <= n; i++) {
                    WierszTrojkataPascala row = new WierszTrojkataPascala(i);
                    textArea.appendText(row.toString()+"\n");
                }
            }
        } catch (NumberFormatException e) {
            textArea.setText("Nieprawidlowy numer wiersza");
        }

    }
}
