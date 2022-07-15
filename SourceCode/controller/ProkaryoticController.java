package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class ProkaryoticController extends GeneralController {

    @FXML
    private Label objectField;

    @FXML
    private Text descriptionField;

    @FXML
    private ImageView myImage;

    @FXML
    private Label recChro;

    @FXML
    private Label recNu;

    @FXML
    private Label recPlas;

    @FXML
    void blurChro(MouseEvent e) {

    }

    @FXML
    void blurNu(MouseEvent e) {

    }

    @FXML
    void blurPlas(MouseEvent e) {

    }

    @FXML
    void highlightChro(MouseEvent e) {

    }

    @FXML
    void highlightNu(MouseEvent e) {

    }

    @FXML
    void highlightPlas(MouseEvent e) {

    }

    @FXML
    void infoChro(MouseEvent e) {

    }

    @FXML
    void infoNu(MouseEvent e) {

    }

    @FXML
    void infoPlas(MouseEvent e) {

    }

    @FXML
    void switchHelpEukaryoticCell(ActionEvent e) {

    }

    @FXML
    void switchBinaryFission(ActionEvent e) {
        super.switchScene("view/BinaryFission.fxml", e);
    }

    @FXML
    void switchHome(ActionEvent e) {
        super.switchScene("view/MainScreen.fxml", e);
    }

}
