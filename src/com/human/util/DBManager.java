package com.human.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	private static String url = "jdbc:mysql://localhost:3306/coffee";
	private static String uid = "root";
	private static String pwd = "apmsetup";

	// 카넥션 얻어오기
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uid, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rset) {
		if (rset != null) {
			try {
				rset.close();
			} catch (SQLException e) {
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public static void close(Connection conn, PreparedStatement pstmt) {

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
}

