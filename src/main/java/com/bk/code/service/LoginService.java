package com.bk.code.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginService implements ADOService {

	@Override
	public void connectDB() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb", "root", "12345");
		Statement t = con.createStatement();

	}

	@Override
	public boolean verifyLogin(String email, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addRegistation(String name, String email, String moibile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRegistation(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRegistation(String email, String phone) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllRegistations() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
