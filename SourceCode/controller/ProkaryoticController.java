package controller;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ProkaryoticController extends CellController {

    private final String PROKARYOTE_DESCRIPTION_FILE = "/SourceCode/resources/text/prokaryotic.txt";
    private final String CHROMOSOME_DESCRIPTION_FILE = "/SourceCode/resources/text/prokaryotic/chromosome.txt";
    private final String NUCLEOID_DESCRIPTION_FILE = "/SourceCode/resources/text/prokaryotic/nucleoid.txt";
    private final String PLASMID_DESCRIPTION_FILE = "/SourceCode/resources/text/prokaryotic/plasmid.txt";

    // @FXML
    // private Label objectField;

    // @FXML
    // private Text descriptionField;

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
        super.blur(recChro);
    }

    @FXML
    void blurNu(MouseEvent e) {
        super.blur(recNu);
    }

    @FXML
    void blurPlas(MouseEvent e) {
        super.blur(recPlas);
    }

    @FXML
    void highlightChro(MouseEvent e) {
        super.highlight(recChro);
    }

    @FXML
    void highlightNu(MouseEvent e) {
        super.highlight(recNu);
    }

    @FXML
    void highlightPlas(MouseEvent e) {
        super.highlight(recPlas);
    }

    @FXML
    void infoChro(MouseEvent e) {
        try {
            super.componentInformation("Chromosome", CHROMOSOME_DESCRIPTION_FILE);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    void infoNu(MouseEvent e) {
        try {
            super.componentInformation("Nucleoid", NUCLEOID_DESCRIPTION_FILE);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    void infoPlas(MouseEvent e) {
        try {
            super.componentInformation("Plasmid", PLASMID_DESCRIPTION_FILE);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    void aboutCell(ActionEvent e) {
        try {
            super.componentInformation("Prokaryotic cell", PROKARYOTE_DESCRIPTION_FILE);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    void switchBinaryFission(ActionEvent e) {
        super.switchScene("view/ProkaryoticDivision.fxml", e);
    }

    @FXML
    void switchHome(ActionEvent e) {
        super.switchScene("view/MainScreen.fxml", e);
    }

    // @FXML
    // public void initialize() {
    //     try {
    //         super.componentInformation("Prokaryotic cell", PROKARYOTE_DESCRIPTION_FILE);
    //     } catch (FileNotFoundException e1) {
    //         e1.printStackTrace();
    //     }
    // }

}
