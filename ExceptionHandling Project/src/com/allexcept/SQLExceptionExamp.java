package com.allexcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExamp {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load the driver class");
		}
	}

	public static void main(String[] args) {

		Connection con = null;

		String URL = "jdbc:oracle:thin:@localhost:1521:XE";

		String username = "username";

		String password = "password";

		try {
			con = DriverManager.getConnection(URL, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
/*
 * SQLException is thrown when an application encounters with an error while
 * interacting with the database. For example, passing the wrong username or
 * password, passing the wrong URL of the database, passing invalid column name
 * or column index etc. SQLException is also a checked exception.
 */