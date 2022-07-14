package controller;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;
public class ProkaryoticController extends GeneralController{
    
    @FXML
    private Rectangle recChro;
    @FXML
    private Rectangle recPlas;
    @FXML
    private Rectangle recNu;
    
    @FXML
    private ImageView myImage;

    @FXML
    public void back(ActionEvent e){
        super.switchScene("view/MainScreen.fxml", e);
    }
    public void switchAmitosis(ActionEvent e) {
		super.switchScene("view/Amitosis.fxml", e);
	}
    //blur
    @FXML
    void blurChro(MouseEvent event) {
         super.blur(recChro);
    }
     @FXML
     void blurPlas(MouseEvent event) {
         super.blur(recPlas);
     }
     @FXML
     void blurNu(MouseEvent event) {
         super.blur(recNu);
    }
    //highlight
    @FXML
    void highlightChro(MouseEvent event) {
        super.highlight(recChro);
   }
    @FXML
    void highlightPlas(MouseEvent event) {
        super.highlight(recPlas);
   }
    @FXML
    void highlightNu(MouseEvent event) {
        super.highlight(recNu);
   }

   //show detailed information
   @FXML
   void infoPlas(MouseEvent event){
       super.componentInformation("Plasmid", "contentText");
  }
  @FXML
   void infoNu(MouseEvent event){
       super.componentInformation("Nucleus", "contentText");
  }
  @FXML
   void infoChro(MouseEvent event){
       super.componentInformation("Chromosome", "contentText");
   }


    public void initialize(){
        myImage.setVisible(true);
    }
     
}
