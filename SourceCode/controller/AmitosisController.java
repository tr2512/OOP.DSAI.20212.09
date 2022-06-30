package controller;

import javafx.event.ActionEvent;

public class AmitosisController extends ProkaryoticController {
    @Override
    public void back(ActionEvent e){
        super.switchScene("view/Prokaryotic.fxml", e);
    }
}
