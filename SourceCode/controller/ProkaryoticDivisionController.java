package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ProkaryoticDivisionController extends DivisionController {

    @FXML
    void switchProkaryoticCell(ActionEvent e) {
        super.switchScene("view/Prokaryotic.fxml", e);
    }

}
