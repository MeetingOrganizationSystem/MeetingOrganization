package com.virtusa.dao;

public interface AdminDao {

	public boolean adminAuth(String adminId,String password);

	public String retrieveUserType(String adminId);

	

		// TODO Auto-generated method stub
	
}
