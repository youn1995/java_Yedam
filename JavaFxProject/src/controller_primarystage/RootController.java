package controller_primarystage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class RootController implements Initializable {
	@FXML
	Button btnPopup;
	@FXML
	Button btnCustom;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	private Stage primaryStage;

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public void handleOpenFileChooser(ActionEvent e) {
		FileChooser fileChosser = new FileChooser();
		fileChosser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt")
				);
	}

	public void handleSaveFileChooser(ActionEvent e) {

	}

	public void handleDirectoryChooser(ActionEvent e) {

	}

	public void handlePopup(ActionEvent e) {

	}

	public void handleCustom(ActionEvent e) {

	}
}
