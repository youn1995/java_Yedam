package view_pack2;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback; //util에 callback

public class BoardController implements Initializable {
	Connection conn;
	@FXML
	TableView<Board> tableView;
	@FXML
	TextField txtTitle, txtExitDate;
	@FXML
	TextArea txtAreaContent;
	@FXML
	ComboBox<String> comboProperty;

	@FXML
	Button btnNext, btnPre, btnUpdate;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
//		ObservableList<Board> boardList = FXCollections.observableArrayList(); //observableArrayList() 정적메소드
//		boardList.add(new Board("5", "4", "3", "2","1"));
		ObservableList<Board> boardList = getBoardList();

		TableColumn<Board, String> tcTitle = new TableColumn<Board, String>();
		tcTitle.setCellValueFactory(new Callback<CellDataFeatures<Board, String>, ObservableValue<String>>() { // callback은
																												// 인터페이스
			@Override
			public ObservableValue<String> call(CellDataFeatures<Board, String> param) {
				return param.getValue().titleProperty(); // PropertyValueFactory를 쓰면 더 짧게 쓸수있음.
			}
		});
		TableColumn<Board, String> tcExitDate = new TableColumn<>();
		tcExitDate.setCellValueFactory(new PropertyValueFactory<Board, String>("exitDate")); // 이렇게 한거랑 위에 한거랑 같음

		tcTitle.setText("제목");
		tcExitDate.setText("종료일자");
		tableView.getColumns().add(tcTitle);
		tableView.getColumns().add(tcExitDate);
		tableView.setItems(boardList);

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Board>() {

			@Override
			public void changed(ObservableValue<? extends Board> observable, Board oldValue, Board newValue) {
				txtTitle.setText(newValue.getTitle());
				txtExitDate.setText(newValue.getExitDate().substring(0, 10));
				comboProperty.setValue(newValue.getPublicity());
				txtAreaContent.setText(newValue.getContent());
			}
		});

		btnPre.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int rowIndex = tableView.getSelectionModel().getSelectedIndex();
				if (rowIndex > 0) {
					tableView.getSelectionModel().select(rowIndex - 1);
				}

			}
		});
		btnNext.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				tableView.getSelectionModel().selectNext();

			}
		});
		btnUpdate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String newContent = txtAreaContent.getText();
				Board newBoa = tableView.getSelectionModel().getSelectedItem();
				newBoa.setContent(newContent);
				updateBoard(newBoa);
				tableView.refresh();
			}
		});

	}

	public ObservableList<Board> getBoardList() {
		ObservableList<Board> list = FXCollections.observableArrayList();
		String sql = "select title, publicity, exit_date, content from board_java";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getString("title"), null, rs.getString("publicity"),
						rs.getString("exit_date"), rs.getString("content"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public void updateBoard(Board board) {
		String sql = String.format("update board_java set content = '%s' where title = '%s'", board.getContent(),
				board.getTitle());
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
