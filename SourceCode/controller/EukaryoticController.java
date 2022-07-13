package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.ParallelTransition;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import model.Anaphase;
import model.CellContext;
import model.DivideState;
import model.EndState;
import model.GeneralState;
import model.Interphase;
import model.Metaphase;
import model.Prophase;
import model.Telophase;

public class EukaryoticController {
	
	private String process;
    private AnchorPane[] panes = new AnchorPane[4];
	private CellContext cell;
	private SVGPath[] chromos = new SVGPath[8];;	
	private ParallelTransition pt;
    private Line[] lines = new Line[8];
	@FXML
	private GridPane box;
    @FXML
    private Button nextButton;
    @FXML
    private Button prevButton;

    @FXML
    void next(ActionEvent event) {
    	if (cell.getState() instanceof Telophase) {
    		box.getChildren().clear();
        	GeneralState.setSize(300, 400);
        	for (int i = 0; i < 8; i++) {
    			chromos[i].setScaleX(0.5);
    			chromos[i].setScaleY(0.5);
    		}
        	if (!process.equals("meiosis2")) {
        		panes[1] = new AnchorPane();
        		panes[0] = new AnchorPane();
        		createGUI(panes[0], 400, 300);
        		createGUI(panes[1], 400, 300);
            	panes[0].getChildren().addAll(chromos[0], chromos[1], chromos[4], chromos[5], lines[0], lines[1], lines[4], lines[5]);
            	panes[1].getChildren().addAll(chromos[2], chromos[3], chromos[6], chromos[7], lines[2], lines[3], lines[6], lines[7]);
        		box.add(panes[0], 0, 0);
        		box.add(panes[1], 1, 0);
        		if (process.equals("meiosis")) {
        			cell.setState(new Prophase("meiosis2"));
        			process = "meiosis2";
        		} else {
        			cell.nextState();
        		}
        		componentVisible(panes[0]);
        		componentVisible(panes[1]);
        		for (int i = 0; i < 8; i++) {

        		}
    			draw(2000);
        	}  else {
        		for (int i = 0; i < panes.length; i++) {
        			panes[i] = new AnchorPane();
        			panes[i].setPrefSize(200, 300);
        			createGUI(panes[i], 200, 300);
        		}
            	panes[0].getChildren().addAll(chromos[0], chromos[4]);
            	panes[1].getChildren().addAll(chromos[2], chromos[6]);
            	panes[2].getChildren().addAll(chromos[1], chromos[5]);
            	panes[3].getChildren().addAll(chromos[3], chromos[7]);
        		box.add(panes[0], 0, 0);
        		box.add(panes[1], 1, 0);
        		box.add(panes[2], 0, 1);
        		box.add(panes[3], 1, 1);
        		cell.nextState();
        		for (int i = 0; i < panes.length; i++) {
        			componentVisible(panes[i]);
        		}
    			draw(2000);
        	}
    		} else {
    			cell.nextState();
    			for (AnchorPane pane:panes) {
    				if (pane != null) {
    					componentVisible(pane);
    					draw(2000);
	    		}
			}
    	}
    }

    @FXML
    void prev(ActionEvent event) {
    	if (!((cell.getState() instanceof EndState) | (cell.getState() instanceof Prophase & process.equals("meiosis2")))) {
    		cell.prevState();
	    	for (AnchorPane pane:panes) {
	    		if (pane != null) {
	    			componentVisible(pane);
	        		draw(2000);
	    		}
	    	}
    		System.out.println(cell.getState().printState());
    	} else if (cell.getState() instanceof EndState & process.equals("meiosis2")) {
    		GeneralState.setSize(300, 400);
    		box.getChildren().clear();
    		panes[3] = null;
    		panes[2] = null;
    		panes[1] = new AnchorPane();
    		panes[0] = new AnchorPane();
    		createGUI(panes[0], 400, 300);
    		createGUI(panes[1], 400, 300);
    		cell.setState(new Telophase(process));
        	panes[0].getChildren().addAll(chromos[0], chromos[1], chromos[4], chromos[5], lines[0], lines[1], lines[4], lines[5]);
        	panes[1].getChildren().addAll(chromos[2], chromos[3], chromos[6], chromos[7], lines[2], lines[3], lines[6], lines[7]);
    		box.add(panes[0], 0, 0);
    		box.add(panes[1], 1, 0);
    		componentVisible(panes[0]);
    		componentVisible(panes[1]);
    		draw(2000);
    		} else {
    	
    			GeneralState.setSize(600, 400);
        		box.getChildren().clear();
        		panes[1] = null;
        		panes[0] = new AnchorPane();
        		if (process.equals("meiosis2")) {
        			process = "meiosis";
        		} 
        		cell.setState(new Telophase(process));
        		createGUI(panes[0], 400, 600);
        		for (int i = 0; i < 8; i++) {
        			chromos[i].setScaleX(1);
        			chromos[i].setScaleY(1);
        			panes[0].getChildren().addAll(lines[i], chromos[i]);
        		}
        		box.add(panes[0], 0, 0);
        		componentVisible(panes[0]);
        		draw(2000);
        		}
    		}    		

    
    private void createGUI(AnchorPane pane1, float height, float width) {
    	GeneralState.width = width;
    	GeneralState.height = height;
    	pane1.setPrefSize(width, height);
    	Circle membrane = new Circle(width*53/600, Color.YELLOW);
    	Circle newmembrane1 = new Circle(width*53/600, Color.YELLOW);
    	Circle newmembrane2 = new Circle(width*53/600, Color.YELLOW);
    	Rectangle outer = new Rectangle(width*255/600, pane1.getPrefWidth()*255/600, Color.BLUE);
    	SVGPath centroid1 = new SVGPath();
    	SVGPath centroid2 = new SVGPath();
    	centroid1.setContent("M 0 0 Q -4 -8 -7 -6 C -7 -4 -4 -5 -3 0 C -4 5 -7 4 -7 6 Q -4 8 0 0");
    	centroid2.setContent("M 0 0 Q -4 -8 -7 -6 C -7 -4 -4 -5 -3 0 C -4 5 -7 4 -7 6 Q -4 8 0 0");
    	centroid1.setTranslateX(width*190/600);
    	centroid2.setTranslateX(width*419.5/600);
    	centroid1.setTranslateY(width*200/600);
    	centroid2.setTranslateY(width*200/600);
    	centroid2.setRotate(180);
    	centroid1.setVisible(false);
    	centroid2.setVisible(false);
    	newmembrane1.setTranslateX(width*226/600);
    	newmembrane1.setTranslateY(width*203/600);
    	newmembrane2.setTranslateX(width*374/600);
    	newmembrane2.setTranslateY(width*203/600);
    	membrane.setTranslateX(width*300/600);
    	membrane.setTranslateY(width*200/600);
    	outer.setTranslateX(width*172.5/600);
    	outer.setTranslateY(width*72.5/600);
    	for (int i = 0; i < 4; i++) {
			lines[2*i] = new Line(width*180.5/600, width*200/600, width*180.5/600, width*200/600);
			lines[2*i + 1] = new Line(width*419.5/600, width*200/600, width*419.5/600, width*200/600);
		}
    	pane1.getChildren().addAll(outer, membrane, newmembrane1, newmembrane2, centroid1, centroid2);
    }
    
    public void initialize() {
    	panes[0] = new AnchorPane();
    	createGUI(panes[0], 400, 600);
    	box.add(panes[0], 0, 0);
    	cell = new CellContext(process);
    	for (int i = 0; i < 8; i++) {
    		SVGPath path = new SVGPath(); 
    		path.setContent("M 0 0 Q -4 -25 -12 -25 C -11 -17 -7 -11 -5 -1 C -8 8 -11 15 -11 23 Q -7 22 0 0");
    		chromos[i] = path;
    		panes[0].getChildren().add(path);
    	}
    	for (int i = 0; i < 4; i++) {
			lines[2*i] = new Line(panes[0].getPrefWidth()*180.5/600, panes[0].getPrefWidth()*200/600, panes[0].getPrefWidth()*180.5/600, panes[0].getPrefWidth()*200/600);
			lines[2*i + 1] = new Line(panes[0].getPrefWidth()*419.5/600, panes[0].getPrefWidth()*200/600, panes[0].getPrefWidth()*419.5/600, panes[0].getPrefWidth()*200/600);
			panes[0].getChildren().addAll(lines[2*i], lines[2*i + 1]);
    	}
    	componentVisible(panes[0]);
    	draw(1);
    }
    
    private void componentVisible(AnchorPane pane) {
    	for (int i = 0; i < 4; i ++) {
    		chromos[i].setVisible(cell.getState().isVisible()[0]);
    	}
    	pane.getChildren().get(4).setVisible(cell.getState().isVisible()[0]);
    	pane.getChildren().get(5).setVisible(cell.getState().isVisible()[0]);
    	pane.getChildren().get(1).setVisible(cell.getState().isVisible()[1]);
    	pane.getChildren().get(2).setVisible(cell.getState().isVisible()[2]);
    	pane.getChildren().get(3).setVisible(cell.getState().isVisible()[2]);
    }
    
    public void draw(int timer) {
    	pt = new ParallelTransition();
    	for (int i = 0; i < chromos.length; i++) {
    		pt.getChildren().add(Transition(chromos[i], cell.getState().getChromoX()[i], cell.getState().getChromoY()[i], cell.getState().getChromoRotate()[i], timer));
    	}
    	if (cell.getState() instanceof Metaphase | cell.getState() instanceof Anaphase) {
    		for (int i = 0; i < 4; i++) {
    				lines[2*i].setVisible(true);
    				lines[2*i + 1].setVisible(true);
    			if (!process.equals("meiosis")) {
    				Timeline animation1 = new Timeline(
        		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i].endXProperty(), cell.getState().getChromoX()[2*i]))    
        		        );
        			Timeline animation2 = new Timeline(
        		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i].endYProperty(), cell.getState().getChromoY()[2*i]))    
        		        );
        			Timeline animation3 = new Timeline(
        		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i + 1].endXProperty(), cell.getState().getChromoX()[2*i + 1] - panes[0].getPrefWidth()/100) 
        		        ));
        			Timeline animation4 = new Timeline(
        		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i + 1].endYProperty(), cell.getState().getChromoY()[2*i + 1]))    
        		        );
        			pt.getChildren().addAll(animation1, animation2, animation3, animation4);
    			} else {
    				if (i % 2 == 0) {
    					Timeline animation1 = new Timeline(
            		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i].endXProperty(), cell.getState().getChromoX()[2*i]))    
            		        );
            			Timeline animation2 = new Timeline(
            		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i].endYProperty(), cell.getState().getChromoY()[2*i]))    
            		        );
            			pt.getChildren().addAll(animation1, animation2);
    				} else {
    					Timeline animation3 = new Timeline(
            		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i + 1].endXProperty(), cell.getState().getChromoX()[2*i + 1] - panes[0].getPrefWidth()/100) 
            		        ));
            			Timeline animation4 = new Timeline(
            		            new KeyFrame(Duration.millis(2000), new KeyValue(lines[2*i + 1].endYProperty(), cell.getState().getChromoY()[2*i + 1]))    
            		        );
            			pt.getChildren().addAll(animation3, animation4);
    				}
    			}
    		}
    	} else {
    		for (int i = 0; i < 4; i++) {
    			lines[2*i].setVisible(false);
    			lines[2*i + 1].setVisible(false);
    			lines[2*i].setEndX(lines[2*i].getStartX());
    			lines[2*i].setEndY(lines[2*i].getStartY());
    			lines[2*i + 1].setEndX(lines[2*i + 1].getStartX());
    			lines[2*i + 1].setEndY(lines[2*i + 1].getStartY());
    			}
    		}
    	pt.play();
    }
    
    public Animation Transition(Shape shape, float x, float y, float rotated, int timer) {
    	ParallelTransition parallel = new ParallelTransition();
    	TranslateTransition translate = new TranslateTransition(Duration.millis(timer), shape);
    	translate.setToX(x);
    	translate.setToY(y);
    	RotateTransition rotate = new RotateTransition(Duration.millis(timer), shape);
    	rotate.setToAngle(rotated);
    	parallel.getChildren().addAll(translate, rotate);
    	return parallel;
    }

	public EukaryoticController(String process) {
		this.process = process;
	}
}