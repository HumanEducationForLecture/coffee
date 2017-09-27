package com.human.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final DBConnection instance;
	static {
		instance = new DBConnection();
	}

	public static DBConnection getInstance() {
		return instance;
	}

	public Connection dbconn() {
		// Ŭ���������� ����̹� �ε�
		// ��񿬰�κ�
		Connection conn = null;
		// sqlplus
		// final String url="jdbc:oracle:thin:@localhost:1521:orcl";
		// mysql
		final String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
		final String id = "root";
		final String pw = "1111";
		try {
			// ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("����̹� �ε� ����");
		}
		try {
			// ��� ����
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("db���� ����");

		} catch (SQLException e) {
			System.out.println("DB���� ����");
		}
		return conn;
	}
}
