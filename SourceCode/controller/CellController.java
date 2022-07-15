package controller;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CellController extends GeneralController {
    
    @FXML
    protected Label objectField;

    @FXML
    protected Text descriptionField;

    public void highlight(Label rec) {
        rec.setTextFill(Color.BLUE);
    }

    public void blur(Label rec) {
        rec.setTextFill(Color.BLACK);
    }

    public void componentInformation(String objectText, String Dir) throws FileNotFoundException {
        
		String data = "";

		String Path = System.getProperty("user.dir");
		File file = new File(Path + Dir);
		try (Scanner scan = new Scanner(file)) {
			while(scan.hasNextLine()){
			data = data.concat(scan.nextLine() + "\n");
			}
		}

		objectField.setText(objectText);
		descriptionField.setText(data);

	}


}
