package button_pack;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ButtonController implements Initializable {
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
	@FXML
	ImageView radioImageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(
						getClass().getResource("/images/" + newValue.getUserData().toString() + ".png").toString());
				radioImageView.setImage(image);
			}
		});
		
		chk2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				handleChkAction(event); //이렇게해도 되고 fxml에서 onaction을 해서 직접해도됨
				
			}
		});
	}

	public void handleChkAction(ActionEvent e) {
		String imageName = "";
		if (chk1.isSelected() && chk2.isSelected()) {
//			checkImageView.setImage(new Image(getClass().getResource("/images/geek-glasses-hair.gif").toString()));
			imageName = "geek-glasses-hair.gif";
			
		} else if (chk1.isSelected()) {
//			checkImageView.setImage(new Image(getClass().getResource("/images/geek-glasses.gif").toString()));
			imageName = "geek-glasses.gif";

		} else if (chk2.isSelected()) {
//			checkImageView.setImage(new Image(getClass().getResource("/images/geek-hair.gif").toString()));
			imageName = "geek-hair.gif";

		} else {
//			checkImageView.setImage(new Image(getClass().getResource("/images/geek.gif").toString()));
			imageName = "geek.gif";

		}
		checkImageView.setImage(new Image("/images/"+imageName));
	}

	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}

	
}
