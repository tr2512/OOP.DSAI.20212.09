package controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;


public class MainScreenController extends GeneralController{
	
	@FXML
	public void switchProkaryotic(ActionEvent e) {
		super.switchScene("view/Prokaryotic.fxml", e);
	}
}