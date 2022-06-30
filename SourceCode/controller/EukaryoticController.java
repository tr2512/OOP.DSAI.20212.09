package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class EukaryoticController extends GeneralController{
    @FXML
    public void back(ActionEvent e){
        super.switchScene("view/MainScreen.fxml", e);
    }
    public void switchMitosis(ActionEvent e){
        super.switchScene("view/Mitosis.fxml", e);
    }
    public void switchMeiosis(ActionEvent e){
        super.switchScene("view/Meiosis.fxml", e);
    }
}

