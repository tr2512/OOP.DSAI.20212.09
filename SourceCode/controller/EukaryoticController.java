package controller;



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
     void infoEndo(MouseEvent event){
         super.componentInformation("endoplasmic reticulum", "contentText");
    }
    @FXML
     void infoNu(MouseEvent event){
         super.componentInformation("Nucleus", "contentText");
    }
    @FXML
     void infoChro(MouseEvent event){
         super.componentInformation("Chromosome", "contentText");
    }
    @FXML
     void infoCytop(MouseEvent event){
         super.componentInformation("Cytoplasm", "contentText");
     }
     @FXML
     void infoCytos(MouseEvent event){
         super.componentInformation("Cytoskeleton", "contentText");
     }
     @FXML
     void infoRibo(MouseEvent event){
         super.componentInformation("Ribosomes", "contentText");
     }
     @FXML
     void infoMito(MouseEvent event){
         super.componentInformation("mitochondrion", "contentText");
     }
     @FXML
     void infoLyso(MouseEvent event){
         super.componentInformation("Lysosome", "contentText");
     }
     @FXML
     void infoGolgi(MouseEvent event){
         super.componentInformation("Golgi body", "contentText");
     }

     public void initialize(){
        myImage.setVisible(true);
    }
     



    
}





