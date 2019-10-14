package com.virtusa.helper;

import com.virtusa.dao.AdminDao;
import com.virtusa.dao.AdminDAOImpl;
import com.virtusa.services.AdminService;
import com.virtusa.services.AdminServiceImpl;

public class AdminFactory {
	public static AdminDao createAdminDao() {
		AdminDao adminDao=new AdminDAOImpl();
		return adminDao;
	}
	public static AdminService createAdminService() {
		AdminService adminService=new AdminServiceImpl();
		return adminService;
	}
}
