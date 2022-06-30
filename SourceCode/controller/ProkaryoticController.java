package controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
public class ProkaryoticController extends GeneralController{
    @FXML
    public void back(ActionEvent e){
        super.switchScene("view/MainScreen.fxml", e);
    }
    public void switchAmitosis(ActionEvent e) {
		super.switchScene("view/Amitosis.fxml", e);
	}
}
