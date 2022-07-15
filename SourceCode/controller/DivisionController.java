package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.ParallelTransition;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import model.DivisionProcess;
import model.EndState;

public abstract class DivisionController extends GeneralController {
	
	protected DivisionProcess cell;
	protected ParallelTransition pt;
	@FXML
    protected Label objectField;
    @FXML
    protected Text descriptionField;
	@FXML
    protected ImageView playPauseImageView;
	@FXML
	protected Button replay;
	@FXML
    protected Button stop;
    @FXML
    protected Button play;
    @FXML
    protected Button nextButton;
    @FXML
    protected Button prevButton;
    @FXML
    protected ProgressBar progressbar;
    @FXML
    protected double progress = 0;
	protected Timeline running;
	
	@FXML
	abstract void next(ActionEvent e);
	abstract void initialize();
	protected void initPlay() {
		running = new Timeline(new KeyFrame(Duration.seconds(5), e -> next(e)));
    	KeyFrame kf = new KeyFrame(Duration.seconds(0), e -> {
    		if (cell.getState() instanceof EndState) {
    			stopPressed(e);
    		}
    	});
    	running.getKeyFrames().add(kf);
    	// playPressed(new ActionEvent());
	}
    
    protected Animation Transition(Shape shape, float x, float y, float rotated, int timer) {
    	ParallelTransition parallel = new ParallelTransition();
    	TranslateTransition translate = new TranslateTransition(Duration.millis(timer), shape);
    	translate.setToX(x);
    	translate.setToY(y);
    	RotateTransition rotate = new RotateTransition(Duration.millis(timer), shape);
    	rotate.setByAngle(rotated - shape.getRotate());
    	parallel.getChildren().addAll(translate, rotate);
    	return parallel;
    }
    
    protected void increaseProgress(double percentage){
        if(progress < 1){
            progress += percentage;
            progressbar.setProgress(progress);
        }
    }

    protected void decreaseProgress(double percentage){
        if(progress > 0){
        progress -= percentage;
        progressbar.setProgress(progress);
        }
    }

    @FXML
    void playPressed(ActionEvent e) {
    	running.setCycleCount(Timeline.INDEFINITE);
    	running.play();
    }
    
    @FXML
    void restartClicked(ActionEvent e) {
    	initialize();
    }
    
    @FXML
    void stopPressed(ActionEvent e) {
    	running.stop();
    }
    
    @FXML
    void switchHome(ActionEvent e) {
    	super.switchScene("view/MainScreen.fxml", new MainScreenController(), e);
    }
}
