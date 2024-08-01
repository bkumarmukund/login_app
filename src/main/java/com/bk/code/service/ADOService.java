package com.bk.code.service;

import java.sql.SQLException;

public interface ADOService {
	
	public void connectDB() throws SQLException;
	public boolean verifyLogin(String email, String Password);
	public void addRegistation(String name,String email,String moibile);
	public void deleteRegistation(String email);
	public void updateRegistation(String email,String phone);
	public void getAllRegistations();
   //no  
	public void getData();
	
}
