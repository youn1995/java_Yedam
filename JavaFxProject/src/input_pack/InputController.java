package input_pack;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InputController implements Initializable {
	@FXML
	private TextField txtTitle;
	@FXML
	private PasswordField pwdTitle;
	@FXML
	private ComboBox<String> comboPublic;
	@FXML
	private DatePicker dateExit;
	@FXML
	private TextArea txtContent;
	@FXML
	private Button btnReg, btnCancel;
	BoardDAO boardDAO = new BoardDAO();
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		boardDAO.getConnect();
	}

	public void handleBtnRegAction(ActionEvent e) {
		if (txtTitle.getText() == null || txtTitle.getText().equalsIgnoreCase("")) {
			messageDialog("제목을 입력하세요");
		} else if (pwdTitle.getText() == null || pwdTitle.getText().equals("")) {
			messageDialog("비밀번호를 입력하세요");
		} else if (comboPublic.getValue() == null || comboPublic.getValue().equals("")) {
			messagePopup("공개여부를 선택하세요");
		} else if (dateExit.getValue() == null || dateExit.getValue().toString().equals("")) {
			messagePopup("날짜를 선택하세요");
		} else if (txtContent.getText() == null || txtContent.getText().equals("")) {
			messagePopup("내용을 입력하세요");
		} else {
			String title = txtTitle.getText();
			String password = pwdTitle.getText();
			String pubPriCheck = comboPublic.getValue();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			String date = dateExit.getValue().format(formatter);
			String content = txtContent.getText();
			Board board = new Board(title, password, pubPriCheck, date, content);
			
			boardDAO.insertBoard(board);
			
			title = null;
			password = null;
			pubPriCheck = "공개";
			date = null;
			content = null;
		}

	}
	
	public void messagePopup(String message) {
		//컨테이너 생성
		HBox hbox= new HBox();
		hbox.setStyle("-fx-background-color: black; -fx-background-radius: 20;");
		hbox.setAlignment(Pos.CENTER);
		
		//컨트롤 (ImageView)
		ImageView imageView = new ImageView();
		imageView.setImage(new Image("/icons/dialog-info.png"));
		imageView.setFitHeight(30);
		imageView.setFitWidth(30);
		//컨트롤( lable)
		Label label = new Label();
		label.setText(message);
		label.setStyle("-fx-text-fill: white");
		HBox.setMargin(label, new Insets(0,5,0,5));
		//컨테이너에 컨트롤담기
		hbox.getChildren().add(imageView);
		hbox.getChildren().add(label);
		//팝업생성. 컨태이너 담아서 팝업호출
		Popup popup = new Popup();
		popup.getContent().add(hbox);
		popup.setAutoHide(true);
		popup.show(btnReg.getScene().getWindow()); //버튼이소속된 씬과 윈도우를 가져옴
	}
	
	public void messageDialog(String message) {
		Stage customStage = new Stage(StageStyle.UTILITY);
		customStage.initModality(Modality.WINDOW_MODAL);
		customStage.initOwner(btnReg.getScene().getWindow());
		customStage.setTitle("확인");
		
		AnchorPane ap = new AnchorPane();
		ap.setPrefSize(400, 150);
		
		ImageView imageView = new ImageView();
		imageView.setImage(new Image("/icons/dialog-info.png"));
		imageView.setFitHeight(50);
		imageView.setPreserveRatio(true);
		imageView.setLayoutX(15);
		imageView.setLayoutY(15);
		
		Button button = new Button("확인");
		button.setLayoutX(336);
		button.setLayoutY(104);
		button.setOnAction(e -> customStage.close());
		
		Label label = new Label(message);
		label.setLayoutX(87);
		label.setLayoutY(33);
		label.setPrefHeight(15);
		label.setPrefWidth(290);
		
		ap.getChildren().add(imageView);
		ap.getChildren().add(button);
		ap.getChildren().add(label);
		
		Scene scene = new Scene(ap);
		customStage.setScene(scene);
		customStage.show();
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}

}
