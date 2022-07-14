package controller;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.event.ActionEvent;

public abstract class GeneralController {
	protected Scene scene;
	protected Stage stage;
	protected Parent root;
	protected FXMLLoader loader;
	
	public void switchScene(String xmlDir, String title, ActionEvent e) {
		try {
			loader = new FXMLLoader(getClass().getClassLoader().getResource(xmlDir));
			root = loader.load();

			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			stage.setTitle(title);
			stage.show(); 
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
