package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.Animation;

import model.CellContext;

public class ProkaryoticController {

	private CellContext cell;
	private ParallelTransition pt;
    @FXML
    private SVGPath l1;
    @FXML
    private SVGPath l2;
    @FXML
    private Circle outer1;
    @FXML
    private Button nextButton;
    @FXML
    private Circle outer2;
    @FXML
    private AnchorPane pane1;
    @FXML
    private Button prevButton;
    @FXML
    private SVGPath r1;
    @FXML
    private SVGPath r2;
    private SVGPath[] chromos;
    @FXML
    private Line line;
    @FXML
    private ProgressBar progressbar;
    @FXML
    private Text text;
    private double progress;


    @FXML
    void next(ActionEvent event) {
    	cell.nextState();
    	increaseProgress();
        draw(2000);

    }

    @FXML
    void prev(ActionEvent event) {
    	cell.prevState();
        decreaseProgress();
    	draw(2000);
    }

    
    public void initialize() {
    	cell = new CellContext();
    	chromos = new SVGPath[] {l1, l2, r1, r2};
    	draw(2);
        progressbar.setStyle("-fx-accent: #00F00;");
        text.setText("0 %");
    }
    
    public void draw(int timer) {
        nextButton.setVisible(cell.getState().isNextBtnVisible());
        prevButton.setVisible(cell.getState().isPrevBtnVisible());
        
    	for (int i = 0; i < 2; i ++) {
    		chromos[i + 2].setVisible(cell.getState().isVisible());
    	}
        // line.setVisible(cell.getState().isRiboVisible());

    	pt = new ParallelTransition();
    	for (int i = 0; i < chromos.length; i++) {
    		pt.getChildren().add(Transition(chromos[i], cell.getState().getChromoX()[i + 2], cell.getState().getChromoY()[i + 2], cell.getState().getChromoRotate()[i + 2], timer));
    	}
        if(cell.getState().isPeptidoglycanLast()){
        pt.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                line.setVisible(cell.getState().isPeptidoglycanLast());
                
            }
        
            
        });}
        else{
            line.setVisible(cell.getState().isPeptidoglycanFirst());
        }


    	pt.getChildren().add(Transition(outer1, cell.getState().getChromoX()[0], cell.getState().getChromoY()[0], cell.getState().getChromoRotate()[0], timer));
    	pt.getChildren().add(Transition(outer2, cell.getState().getChromoX()[1], cell.getState().getChromoY()[1], cell.getState().getChromoRotate()[1], timer));
    	pt.play();
    }
    
    public Animation Transition(Shape shape, int x, int y, float rotated, int timer) {
    	ParallelTransition parallel = new ParallelTransition();
    	TranslateTransition translate = new TranslateTransition(Duration.millis(timer), shape);
    	translate.setByX(x - shape.getTranslateX());
    	translate.setByY(y - shape.getTranslateY());
    	RotateTransition rotate = new RotateTransition(Duration.millis(timer), shape);
    	rotate.setByAngle(rotated - shape.getRotate());
    	parallel.getChildren().addAll(translate, rotate);
    	return parallel;
    }
    public void increaseProgress(){
        if(progress < 1){
            progress += 0.33333;
            progressbar.setProgress(progress);
            text.setText(Integer.toString((int)Math.round(progress * 100)) + "%");}
    }

    public void decreaseProgress(){
        if(progress >0){
        progress -= 0.33333;
        progressbar.setProgress(progress);
        text.setText(Integer.toString((int)Math.round(progress * 100)) + "%");
        }
    }


}