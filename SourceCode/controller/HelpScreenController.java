package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HelpScreenController extends GeneralController{

    @FXML
    private AnchorPane scenePane;

    @FXML
    void openLink(ActionEvent e) throws IOException, URISyntaxException  {
        Desktop.getDesktop().browse(new URI("https://github.com/tr2512/OOP.DSAI.20212.09"));
    }

    @FXML
    void switchHome(ActionEvent e) {
        super.switchScene("view/MainScreen.fxml", new MainScreenController(), e);
    }

}
