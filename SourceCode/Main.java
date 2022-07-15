import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import java.io.IOException;

import controller.EukaryoticController;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
	try {	
		FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("view/Eukaryotic.fxml"));
		loader.setController(new EukaryoticController("mitosis"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.setTitle("Application");
		stage.setScene(scene);
		stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}