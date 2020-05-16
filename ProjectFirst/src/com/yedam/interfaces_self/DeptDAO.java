package com.yedam.interfaces_self;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void insertDept(Dept dept) {
		String sql = String.format("insert into dept values(%d,initcap('%s'),%d,%d)", dept.getDepartmentId(),
				dept.getDepartmentName(), dept.getManagerId(), dept.getLocationId());
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + " Row has been insert");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Dept[] getDeptList() {
		Dept[] depts = new Dept[100];
		String sql = "select * from dept";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Dept dept = new Dept(rs.getInt("department_id"), rs.getString("department_name"),
						rs.getInt("manager_id"), rs.getInt("location_id"));
				depts[i++] = dept;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Check completed");
		return depts;
	}

	public void updateDept(Dept dept) {
		String sql = String.format("update dept set department_name = initcap('%s') where department_id = %d",
				dept.getDepartmentName(), dept.getDepartmentId());
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + " Row has been updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteDept(int deptId) {
		String sql = String.format("delete from dept where department_id = %d", deptId);
		conn = getConnect();

		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + " Row has been deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
