package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DivisionController extends GeneralController {
    
    @FXML
    protected AnchorPane animationField;

    @FXML
    protected Label objectField;

    @FXML
    protected Text descriptionField;

    @FXML
    protected ProgressBar progressBar;

    @FXML
    protected Button back;

    @FXML
    protected Button playPauseButton;

    @FXML
    protected ImageView playPauseImageView;

    @FXML
    protected Button next;

    @FXML
    protected Button restart;

    @FXML
    protected void backClicked(ActionEvent e) {

    }

    @FXML
    protected void nextClicked(ActionEvent e) {

    }

    @FXML
    protected void restartClicked(ActionEvent e) {

    }

    @FXML
    protected void switchHome(ActionEvent e) {
        super.switchScene("view/MainScreen.fxml", e);
    }

    @FXML
    protected void playClicked(ActionEvent e) {

    }

    @FXML
    protected void pauseClicked(ActionEvent e) {
    
    }

    @FXML
    public void initialize() {

    }

}
