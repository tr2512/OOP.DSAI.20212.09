import controller.MainScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/view/MainScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        fxmlLoader.setController(new MainScreenController());
        Parent root = fxmlLoader.load();
        stage.setTitle("Cell Division");
        stage.setScene(new Scene(root));
		stage.setResizable(false);
        stage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}	
}