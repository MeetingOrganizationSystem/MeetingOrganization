package com.virtusa.services;

import java.sql.SQLException;

import com.virtusa.dao.AdminDao;
import com.virtusa.helper.AdminFactory;
import com.virtusa.model.AdminModel;
import com.virtusa.view.AdminView;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDAO=null;
	
	public AdminServiceImpl() {
		this.adminDAO=AdminFactory.createAdminDao();
	}

	@Override
	public String adminAuthenticationService(AdminModel adminModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		boolean userValid=adminDAO.adminAuth(adminModel.getAdminId(), adminModel.getPassword());
		String userType=null;
		if(userValid) {
			userType=adminDAO.retrieveUserType(adminModel.getAdminId());	
		}
		else {
		System.out.println("Invalid username or password");
		}

		return userType;
	}

	
	
	

}
