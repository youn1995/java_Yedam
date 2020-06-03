package view_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	public void getConnect() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public List<Board> listBoard() {
		List<Board> boards = new ArrayList<>();
		String sql = "select title, publicity, exit_date, content from board_java";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board boa = new Board(rs.getString("title"), rs.getString("publicity"), rs.getString("exit_date"),
						rs.getString("content"));
				boards.add(boa);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boards;
		
	}

//	public void insertBoard(Board board) {
//		String sql = String.format("insert into board_java values(BOARDJAVA_ID_SEQ.nextVal,'%s','%s','%s','%s','%s')",
//				board.getTitle(), board.getPassword(), board.getPublicity(), board.getExitDate(), board.getContent());
//		try {
//			pstmt = conn.prepareStatement(sql);
//			int r = pstmt.executeUpdate();
//			System.out.println(r + " Row has been insert");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
}
