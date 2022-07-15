import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import java.io.IOException;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
	try {	
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/Prokaryotic.fxml"));
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