package controller;



import java.io.FileNotFoundException;
import java.nio.file.Files;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class EukaryoticController extends GeneralController{



    @FXML
    private ImageView myImage;
     @FXML
     private Rectangle recCytop;
     @FXML
     private Rectangle recCytos;
     @FXML
     private Rectangle recEndo;
     @FXML
     private Rectangle recGolgi;
     @FXML
     private Rectangle recMito;
     @FXML
     private Rectangle recNu;
     @FXML
     private Rectangle recRibo;
     @FXML
     private Rectangle recLyso;
     @FXML
     private Rectangle recChro;

    @FXML
    public void back(ActionEvent e){
        super.switchScene("view/MainScreen.fxml", e);
    }
    public void switchMitosis(ActionEvent e){
        super.switchScene("view/Mitosis.fxml", e);
    }
    public void switchMeiosis(ActionEvent e){
        super.switchScene("view/Meiosis.fxml", e);
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
    void blurChro(MouseEvent event){
        super.blur(recChro);
    }
    @FXML
    void highlightChro(MouseEvent event){
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
     void highlightRibo(MouseEvent event){
         super.highlight(recRibo);
     }
     @FXML
     void highlightNu(MouseEvent event) {
         super.highlight(recNu);
     }

     @FXML
     void infoEndo(MouseEvent event) {
         try {
            super.componentInformation("endoplasmic reticulum", "/SourceCode/text/eukaryotic/eu_Endoplasmic.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @FXML
     void infoNu(MouseEvent event) {
         try {
            super.componentInformation("Nucleus", "/SourceCode/text/eukaryotic/eu_Nucleus.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @FXML
     void infoChro(MouseEvent event) {
         try {
            super.componentInformation("Chromosome", "/SourceCode/text/eukaryotic/eu_Chromosome.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @FXML
     void infoCytop(MouseEvent event) {
        try {
            super.componentInformation("Cytoplasm", "/SourceCode/text/eukaryotic/eu_Cytoplasm.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     @FXML
     void infoCytos(MouseEvent event) {
        try {
            super.componentInformation("Cytoskeleton", "/SourceCode/text/eukaryotic/eu_Cytoskeleton.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
     @FXML
     void infoRibo(MouseEvent event) {
        try {
            super.componentInformation("Ribosome", "/SourceCode/text/eukaryotic/eu_Ribosome.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
     @FXML
     void infoMito(MouseEvent event) {
        try {
            super.componentInformation("Mitochondrion", "/SourceCode/text/eukaryotic/eu_Mitochondrion.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
     @FXML
     void infoLyso(MouseEvent event) {
        try {
            super.componentInformation("Lysosome", "/SourceCode/text/eukaryotic/eu_Lysosome.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
     @FXML
     void infoGolgi(MouseEvent event) {
        try {
            super.componentInformation("Golgi body", "/SourceCode/text/eukaryotic/eu_Golgi.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }


     public void initialize(){
        myImage.setVisible(true);
    }

    
     



    
}





