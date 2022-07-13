package controller;
import javafx.animation.*;
import javafx.scene.shape.*;
import javafx.fxml.FXML;
import javafx.util.Duration;
import javafx.event.ActionEvent;

public class TestController {
	@FXML
	private SVGPath path;
	
	private TranslateTransition rotation;
	@FXML
	private void clicked(ActionEvent e) {
		System.out.println(path.getTranslateX());
		System.out.println(path.getLayoutY());
		rotation = new TranslateTransition(Duration.millis(200), path);
		rotation.setByX(200);
		rotation.play();
	}
}
