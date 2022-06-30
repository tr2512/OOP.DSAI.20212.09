package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.Animation;

import model.CellContext;

public class EukaryoticController {

	private CellContext cell;
	private ParallelTransition pt;
    @FXML
    private SVGPath l1;
    @FXML
    private SVGPath l2;
    @FXML
    private SVGPath l3;
    @FXML
    private SVGPath l4;
    @FXML
    private Circle membrane;
    @FXML
    private Button nextButton;
    @FXML
    private Rectangle outer;
    @FXML
    private AnchorPane pane1;
    @FXML
    private Button prevButton;
    @FXML
    private SVGPath r1;
    @FXML
    private SVGPath r2;
    @FXML
    private SVGPath r3;
    @FXML
    private SVGPath r4;
    private SVGPath[] chromos;

    @FXML
    void next(ActionEvent event) {
    	cell.nextState();
    	draw(2000);
    }

    @FXML
    void prev(ActionEvent event) {
    	cell.prevState();
    	draw(2000);
    }
    
    public void initialize() {
    	cell = new CellContext();
    	chromos = new SVGPath[] {l1, l2, l3, l4, r1, r2, r3, r4};
    	draw(1);
    }
    
    public void draw(int timer) {
    	for (int i = 0; i < 4; i ++) {
    		chromos[i + 4].setVisible(cell.getState().isVisible());
    	}
    	pt = new ParallelTransition();
    	for (int i = 0; i < chromos.length; i++) {
    		pt.getChildren().add(Transition(chromos[i], cell.getState().getChromoX()[i + 2], cell.getState().getChromoY()[i + 2], cell.getState().getChromoRotate()[i + 2], timer));
    	}
    	pt.getChildren().add(Transition(outer, cell.getState().getChromoX()[0], cell.getState().getChromoY()[0], cell.getState().getChromoRotate()[0], timer));
    	pt.getChildren().add(Transition(membrane, cell.getState().getChromoX()[1], cell.getState().getChromoY()[1], cell.getState().getChromoRotate()[1], timer));
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
}