package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.helper.AdminFactory;
import com.virtusa.model.AdminModel;
import com.virtusa.services.AdminService;
import com.virtusa.view.AdminView;
import com.virtusa.view.OrganizerView;

public class UserController {

	
		private AdminService adminService;
		public UserController() {
			this.adminService=AdminFactory.createAdminService();
		}
			public void adminAuthentication(String adminId,String password) {
				
				AdminModel adminModel=new AdminModel();
				adminModel.setAdminID(adminId);
				adminModel.setPassword(password);
				
					
					try {
						String userType = adminService.adminAuthenticationService(adminModel);
					
					 if(userType.equals("Admin")) {
						 AdminView adminView=new AdminView();
						 adminView.mainAdminView();
					 }
					 else if(userType.equals("organizer")) {
						 OrganizerView organizerView=new OrganizerView();
						 organizerView.mainOrganizerView();
					 }
					}catch(ClassNotFoundException e) {
						e.printStackTrace();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				
		}

}
