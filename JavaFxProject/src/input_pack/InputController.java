package input_pack;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
			System.out.println("제목을 입력하세요");
		} else if (pwdTitle.getText() == null || pwdTitle.getText().equals("")) {
			System.out.println("비밀번호를 입력하세요");
		} else if (comboPublic.getValue() == null || comboPublic.getValue().equals("")) {
			System.out.println("공개여부를 선택하세요");
		} else if (dateExit.getValue() == null || dateExit.getValue().toString().equals("")) {
			System.out.println("날짜를 선택하세요");
		} else if (txtContent.getText() == null || txtContent.getText().equals("")) {
			System.out.println("내용을 입력하세요");
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

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}

}
