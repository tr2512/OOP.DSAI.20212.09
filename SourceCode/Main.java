import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import java.io.IOException;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
	try {	
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/MainScreen.fxml"));
		Scene scene = new Scene(root, Color.BLACK);
		
		stage.setTitle("Application");
		stage.setScene(scene);
		stage.show();

		stage.setOnCloseRequest(event -> quit(stage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void quit(Stage stage){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Warning!!");
		alert.setHeaderText("You're about to quit");
		alert.setContentText("Are you sure to quit?");
		if(alert.showAndWait().get() == ButtonType.OK){
			stage.close();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}	
}