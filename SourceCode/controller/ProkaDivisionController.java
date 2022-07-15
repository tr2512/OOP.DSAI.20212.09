package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.SVGPath;
import javafx.animation.ParallelTransition;

import model.DivisionProcess;
public class ProkaDivisionController extends DivisionController {

    @FXML
    private SVGPath l1;
    @FXML
    private SVGPath l2;
    @FXML
    private Ellipse outer1;
    @FXML
    private Ellipse outer2;
    @FXML
    private AnchorPane pane1;
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
    void next(ActionEvent event) {
    	cell.nextState();
    	super.increaseProgress(1.0f/3);
        draw(2000);
        descriptionField.setText(cell.printCurrentState());

    }

    @FXML
    void prev(ActionEvent event) {
    	cell.prevState();
        super.decreaseProgress(1.0f/3);
    	draw(2000);
        descriptionField.setText(cell.printCurrentState());
    }

    
    public void initialize() {
    	cell = new DivisionProcess("binaryFission");
    	chromos = new SVGPath[] {l1, l2, r1, r2};
    	draw(2);
    	descriptionField.setText(cell.printCurrentState());
        progress = 0;
        objectField.setText("Binary fission");
        super.initPlay();
    }
    
    public void draw(int timer) {
    	if (pt != null) {
    		pt.stop();
    	}
     	chromos[2].setVisible(cell.getState().isVisible()[0]);
    	chromos[3].setVisible(cell.getState().isVisible()[0]);

    	pt = new ParallelTransition();
    	for (int i = 0; i < chromos.length; i++) {
    		pt.getChildren().add(super.Transition(chromos[i], cell.getState().getChromoX()[i + 2], cell.getState().getChromoY()[i + 2], cell.getState().getChromoRotate()[i + 2], timer));
    	}
        if(cell.getState().isVisible()[2]){
        pt.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                line.setVisible(cell.getState().isVisible()[2]);
            }
        });}
        else{
            line.setVisible(cell.getState().isVisible()[1]);
        }
        
    	pt.getChildren().add(Transition(outer1, cell.getState().getChromoX()[0], cell.getState().getChromoY()[0], cell.getState().getChromoRotate()[0], timer));
    	pt.getChildren().add(Transition(outer2, cell.getState().getChromoX()[1], cell.getState().getChromoY()[1], cell.getState().getChromoRotate()[1], timer));
    	pt.play();
    }
    
    @FXML
    void switchProkaryoticCell(ActionEvent e) {
    	super.switchScene("view/Prokaryotic.fxml", new ProkaryoticController(), e);
    }
}
