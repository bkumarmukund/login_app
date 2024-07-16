package com.bk.code.service;

public interface ADOService {
	
	public void connectDB();
	public boolean verifyLogin(String email, String Password);
	public void addRegistation(String name,String email,String moibile);
	public void deleteRegistation(String email);
	public void updateRegistation(String email,String phone);
	public void getAllRegistations();
	//

	
}
