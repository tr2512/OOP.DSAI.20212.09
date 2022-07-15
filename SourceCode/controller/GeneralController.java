package controller;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public abstract class GeneralController {
	
	protected Scene scene;
	protected Stage stage;
	protected Parent root;
	protected FXMLLoader loader;
	
	public void switchScene(String xmlDir, GeneralController controller, ActionEvent e) {
		try {
			loader = new FXMLLoader(getClass().getClassLoader().getResource(xmlDir));
			loader.setController(controller);
			root = loader.load();

			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			stage.setTitle("Cell Division Application");
			stage.show(); 
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
