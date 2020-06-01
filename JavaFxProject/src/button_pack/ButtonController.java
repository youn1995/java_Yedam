package button_pack;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class ButtonController implements Initializable{
	@FXML
	CheckBox chk1;
	@FXML
	CheckBox chk2;
	@FXML
	ImageView checkImageView;
	@FXML
	RadioButton rad1;
	@FXML
	RadioButton rad2;
	@FXML
	RadioButton rad3;
	@FXML
	ToggleGroup group;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
				
	}
	public void handleChkAction() {
		
	}
	
	public void handleBtnExitAction() {
		
	}

}
