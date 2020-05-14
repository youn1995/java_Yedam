package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// 사원등록 Emp 테이블
	public void insertEmp(Emp emp) { // Emp클래스의 emp인스턴스
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String str;
		//str.format("insert into emp values(%d,%s,%s,%s)", args)
		String sql = "insert into emp values(" + emp.getEmployeeId() + ",'" + emp.getLastName() + "'," + emp.getSalary()
				+ ",'" + emp.getHireDate() + "')";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); //sql구문을 실행하기 위해 담는 class
			int r = pstmt.executeUpdate(); //executeUpdate로 sql문 입력해주고 몇건입력되었는지 리턴해줌 그걸 r에 담음(dml) 
			System.out.println(r+"건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}// end of insertEmp

	// employees 테이블데이터 조회결과
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[100];
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //조회할때 사용
//			while (rs.next()) { // 가져올 다음데이터가 있으면 true
//				System.out.println(rs.getInt("employee_id") + " " + rs.getString("first_name") + " "
//						+ rs.getString("last_name") + " " + rs.getString("email") + " " + rs.getString("Phone_number"));
//			}
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp;// Employee 인스턴스 저장

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회완료");

		return emps;
	}// end ofgetEmpList

}
