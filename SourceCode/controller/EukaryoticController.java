package controller;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class EukaryoticController extends CellController {

    private final String EUKARYOTE_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic.txt";
    private final String CHROMOSOME_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/chromosome.txt";
    private final String CYTOPLASM_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/cytoplasm.txt";
    private final String CYTOSKELETON_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/cytoskeleton.txt";
    private final String ENDOPLASMIC_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/endoplasmic.txt";
    private final String GOLGI_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/golgi.txt";
    private final String LYSOSOME_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/lysosome.txt";
    private final String MITOCHONDRION_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/mitochondrion.txt";
    private final String NUCLEUS_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/nucleus.txt";
    private final String RIBOSOME_DESCRIPTION_FILE = "/SourceCode/resources/text/eukaryotic/ribosome.txt";

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
        super.blur(recChro);
    }

    @FXML
    void blurCytop(MouseEvent event) {
        super.blur(recCytop);
    }

    @FXML
    void blurCytos(MouseEvent event) {
        super.blur(recCytos);
    }

    @FXML
    void blurEndo(MouseEvent event) {
        super.blur(recEndo);
    }

    @FXML
    void blurGolgi(MouseEvent event) {
        super.blur(recGolgi);
    }

    @FXML
    void blurLyso(MouseEvent event) {
        super.blur(recLyso);
    }

    @FXML
    void blurMito(MouseEvent event) {
        super.blur(recMito);
    }

    @FXML
    void blurNu(MouseEvent event) {
        super.blur(recNu);
    }

    @FXML
    void blurRibo(MouseEvent event) {
        super.blur(recRibo);
    }

    @FXML
    void highlightChro(MouseEvent event) {
        super.highlight(recChro);
    }

    @FXML
    void highlightCytop(MouseEvent event) {
        super.highlight(recCytop);
    }

    @FXML
    void highlightCytos(MouseEvent event) {
        super.highlight(recCytos);
    }

    @FXML
    void highlightEndo(MouseEvent event) {
        super.highlight(recEndo);
    }

    @FXML
    void highlightGolgi(MouseEvent event) {
        super.highlight(recGolgi);
    }

    @FXML
    void highlightLyso(MouseEvent event) {
        super.highlight(recLyso);
    }

    @FXML
    void highlightMito(MouseEvent event) {
        super.highlight(recMito);
    }

    @FXML
    void highlightNu(MouseEvent event) {
        super.highlight(recNu);
    }

    @FXML
    void highlightRibo(MouseEvent event) {
        super.highlight(recRibo);
    }

    @FXML
    void infoChro(MouseEvent event) {
        try {
            super.componentInformation("Chromosome", CHROMOSOME_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoCytop(MouseEvent event) {
        try {
            super.componentInformation("Cyptoplasm", CYTOPLASM_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoCytos(MouseEvent event) {
        try {
            super.componentInformation("Cytoskeleton", CYTOSKELETON_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoEndo(MouseEvent event) {
        try {
            super.componentInformation("Endoplasmic", ENDOPLASMIC_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoGolgi(MouseEvent event) {
        try {
            super.componentInformation("Golgi body", GOLGI_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoLyso(MouseEvent event) {
        try {
            super.componentInformation("Lysosome", LYSOSOME_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoMito(MouseEvent event) {
        try {
            super.componentInformation("Mitochondrion", MITOCHONDRION_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoNu(MouseEvent event) {
        try {
            super.componentInformation("Nucleus", NUCLEUS_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void infoRibo(MouseEvent event) {
        try {
            super.componentInformation("Ribosome", RIBOSOME_DESCRIPTION_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void aboutCell(ActionEvent e) {
        try {
            super.componentInformation("Eukaryotic cell", EUKARYOTE_DESCRIPTION_FILE);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    void switchMeiosis(ActionEvent e) {
        super.switchScene("view/EukaryoticDivision.fxml", new EukaDivisionController("Meiosis"), e);
    }

    @FXML
    void switchMitosis(ActionEvent e) {
        super.switchScene("view/EukaryoticDivision.fxml", new EukaDivisionController("Mitosis"), e);
    }

    @FXML
    void switchHome(ActionEvent e) {
        super.switchScene("view/MainScreen.fxml", new MainScreenController(), e);
    }

    // @FXML
    // public void initialize() {
    //     try {
    //         super.componentInformation("Eukaryotic cell", EUKARYOTE_DESCRIPTION_FILE);
    //     } catch (FileNotFoundException e1) {
    //         e1.printStackTrace();
    //     }
    // }

}
