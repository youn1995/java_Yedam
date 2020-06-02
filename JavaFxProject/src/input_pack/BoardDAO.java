package input_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

	public void insertBoard(Board board) {
		String sql = String.format("insert into board_java values(BOARDJAVA_ID_SEQ.nextVal,'%s','%s','%s','%s','%s')",
				board.getTitle(), board.getPassword(), board.getPublicity(), board.getExitDate(), board.getContent());
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + " Row has been insert");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
