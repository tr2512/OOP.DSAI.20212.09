package controller;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class MainScreenController extends GeneralController{
	@FXML
	private Button quitButton;
	@FXML
	private AnchorPane scenePane;

	public void switchProkaryotic(ActionEvent e) {
		super.switchScene("view/Prokaryotic.fxml", e);
	}
	public void switchEukaryotic(ActionEvent e){
		super.switchScene("view/Eukaryotic.fxml", e);
	}
	public void quit(ActionEvent e){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Warning!!");
		alert.setHeaderText("You're about to quit");
		alert.setContentText("Are you sure to quit?");
		if(alert.showAndWait().get() == ButtonType.OK){
			stage = (Stage) scenePane.getScene().getWindow();
			stage.close();
		}


	}

}