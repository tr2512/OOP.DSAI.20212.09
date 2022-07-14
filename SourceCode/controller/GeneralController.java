package controller;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javafx.event.ActionEvent;


public abstract class GeneralController {
	protected Scene scene;
	protected Stage stage;
	protected Parent root;
	protected FXMLLoader loader;
	
	public void switchScene(String xmlDir, ActionEvent e) {
		try {
			loader = new FXMLLoader(getClass().getClassLoader().getResource(xmlDir));
			root = loader.load();
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException except) {
			except.printStackTrace();
		}
	}

    public void highlight (Rectangle rec){
		rec.setStroke(Color.GREEN);
		rec.setStrokeWidth(5.0);
	}
    public void blur(Rectangle rec){
        rec.setStroke(Color.web("#ffffff00"));
        rec.setStrokeWidth(5.0);
    }



	public void componentInformation(String headerText, String Dir) throws FileNotFoundException {
		
			String data = "";

			String Path = System.getProperty("user.dir");
        	File file = new File(Path + Dir);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()){
			data = data.concat(scan.nextLine() + "\n");
			}
		
			Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Detail Information");
    		alert.setHeaderText(headerText);
			alert.setContentText(data);
			alert.showAndWait();
	}

}
