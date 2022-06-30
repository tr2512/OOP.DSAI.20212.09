package controller;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;

public abstract class GeneralController {
	protected Scene scene;
	protected Stage stage;
	protected Parent root;
	protected FXMLLoader loader;
	
	@FXML
	protected AnchorPane pane;
	
	public void switchScene(String xmlDir, ActionEvent e) {
		try {
			loader = new FXMLLoader(getClass().getClassLoader().getResource(xmlDir));
			root = loader.load();
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException except) {
			except.printStackTrace();
		}
	}
}
