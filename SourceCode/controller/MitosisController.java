package controller;

import javafx.event.ActionEvent;

public class MitosisController extends EukaryoticController{
    @Override
    public void back(ActionEvent e){
        super.switchScene("view/Eukaryotic.fxml", e);
    }
}
