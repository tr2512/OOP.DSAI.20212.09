package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class EukaryoticController {

    @FXML
    private Label objectField;

    @FXML
    private Text descriptionField;

    @FXML
    private ImageView myImage;

    @FXML
    private Label recEndo;

    @FXML
    private Label recNu;

    @FXML
    private Label recChro;

    @FXML
    private Label recCytop;

    @FXML
    private Label recCytos;

    @FXML
    private Label recRibo;

    @FXML
    private Label recMito;

    @FXML
    private Label recLyso;

    @FXML
    private Label recGolgi;

    @FXML
    void blurChro(MouseEvent event) {

    }

    @FXML
    void blurCytop(MouseEvent event) {

    }

    @FXML
    void blurCytos(MouseEvent event) {

    }

    @FXML
    void blurEndo(MouseEvent event) {

    }

    @FXML
    void blurGolgi(MouseEvent event) {

    }

    @FXML
    void blurLyso(MouseEvent event) {

    }

    @FXML
    void blurMito(MouseEvent event) {

    }

    @FXML
    void blurNu(MouseEvent event) {

    }

    @FXML
    void blurRibo(MouseEvent event) {

    }

    @FXML
    void highlightChro(MouseEvent event) {

    }

    @FXML
    void highlightCytop(MouseEvent event) {

    }

    @FXML
    void highlightCytos(MouseEvent event) {

    }

    @FXML
    void highlightEndo(MouseEvent event) {

    }

    @FXML
    void highlightGolgi(MouseEvent event) {

    }

    @FXML
    void highlightLyso(MouseEvent event) {

    }

    @FXML
    void highlightMito(MouseEvent event) {

    }

    @FXML
    void highlightNu(MouseEvent event) {

    }

    @FXML
    void highlightRibo(MouseEvent event) {

    }

    @FXML
    void infoChro(MouseEvent event) {

    }

    @FXML
    void infoCytop(MouseEvent event) {

    }

    @FXML
    void infoCytos(MouseEvent event) {

    }

    @FXML
    void infoEndo(MouseEvent event) {

    }

    @FXML
    void infoGolgi(MouseEvent event) {

    }

    @FXML
    void infoLyso(MouseEvent event) {

    }

    @FXML
    void infoMito(MouseEvent event) {

    }

    @FXML
    void infoNu(MouseEvent event) {

    }

    @FXML
    void infoRibo(MouseEvent event) {

    }

    @FXML
    void switchHelpEukaryoticCell(ActionEvent event) {

    }

    @FXML
    void switchMeiosis(ActionEvent event) {
        super.switchScene("view/Meiosis.fxml", e);
    }

    @FXML
    void switchMitosis(ActionEvent event) {
        super.switchScene("view/Mitosis.fxml", e);
    }

    @FXML
    void switchHome(ActionEvent e) {
        super.switchScene("view/MainScreen.fxml", e);
    }

}
