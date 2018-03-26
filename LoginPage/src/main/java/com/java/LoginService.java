package com.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import groovy.util.logging.Log;

@RestController
@RequestMapping("/login")
public class LoginService {
	@Autowired
	DataSource od;

	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LoginData> requestMethodName(@RequestBody LoginData loginData) {
		
		try {
			String status=extractData(loginData);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<>(HttpStatus.OK);
				//ResponseEntity<LoginData>(loginData, HttpStatus.OK);
	}

	private String extractData(LoginData loginData) throws SQLException {
		System.out.println("Creating statement...");

		Connection conn= od.getConnection();
		Statement stmt = null;
		System.out.println("DB connected");
		try {
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT USERNAME, PASSWORD FROM LOGIN";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String userName = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");

				// Display values
				if (loginData.getUserName().equals(userName) && loginData.getPasswod().equals(password)) {
					System.out.print(" First: " + userName);
					System.out.println(" Last: " + password);
				return "SUCCESSFUL";
				}

				
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		return "FAIL";
	}

}
