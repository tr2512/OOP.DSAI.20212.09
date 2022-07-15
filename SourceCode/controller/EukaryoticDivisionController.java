package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EukaryoticDivisionController extends DivisionController {

    @FXML
    private Label processLabel;

    @FXML
    void switchEukaryoticCell(ActionEvent e) {
        super.switchScene("view/Eukaryotic.fxml", new EukaryoticController(), e);
    }

    public EukaryoticDivisionController(String process) {
        initialize(process);
    }

    @FXML
    public void initialize(String process) {
        processLabel.setText(process);
    }

}
