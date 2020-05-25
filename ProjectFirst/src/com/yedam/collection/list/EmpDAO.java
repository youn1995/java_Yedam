package com.yedam.collection.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void insertEmp(Employee emp) {
		String sql = "insert into emp values(?,?,?,?)";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Employee> getEmpList() {
		List<Employee> employees = new ArrayList<>();
		
		
//		Employee[] employees = new Employee[100];
		String sql = "select * from emp";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("last_name"), rs.getInt("salary"),
						rs.getString("hire_date"));
				employees.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회완료");
		return employees;
	}

	public void updateEmp(Employee emp) {
		// 전제 급여만 변경.
		String sql = "update emp set salary = ? where employee_id = ?";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmp(int empId) {
		String sql = "delete from emp where employee_id = ?";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
