package view_pack;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;

public class BoardController implements Initializable {
	@FXML
	ComboBox<String> comboBox;
	@FXML
	TextField txtField, txtField2, txtField3;
	@FXML
	TableView<Board> tableView;
	@FXML
	TextArea txtArea;
//	@FXML
//	String open;
//	@FXML
//	String close;
	
	
	BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		boardDAO.getConnect();
		List<Board> list = boardDAO.listBoard();
//		for(Board board : list) {
		
		ObservableList<Board> test = FXCollections.observableArrayList();
		
		for(Board board : list) {
		test.add(board);
		}
		
		tableView.setItems(test);
		
		TableColumn<Board, ?> tcTitle = tableView.getColumns().get(0);
		tcTitle.setCellValueFactory(new PropertyValueFactory("title"));
//		TableColumn<Board, ?> tcPassword = tableView.getColumns().get(1);
//		tcPassword.setCellValueFactory(new PropertyValueFactory("password"));
		TableColumn<Board, ?> tcPublicity = tableView.getColumns().get(1);
		tcPublicity.setCellValueFactory(new PropertyValueFactory("publicity"));
		TableColumn<Board, ?> tcExitDate = tableView.getColumns().get(2);
		tcExitDate.setCellValueFactory(new PropertyValueFactory("exitDate"));
		TableColumn<Board, ?> tcContent = tableView.getColumns().get(3);
		tcContent.setCellValueFactory(new PropertyValueFactory("content"));
//		}
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Board>() {
			@Override
			public void changed(ObservableValue<? extends Board> observable, Board oldValue, Board newValue) {
				txtField.setText(newValue.getTitle());
				txtField2.setText(newValue.getExitDate());
//				comboBox.getSelectionModel().select(newValue.getPublicity());
				txtField3.setText(newValue.getPublicity());
				txtArea.setText(newValue.getContent());
			}
		});
		
	}

}
