package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;


public class AdminRepository {
	
	private static List<Admin> adminRepository=new ArrayList();
	{
	
	Admin admin=new Admin();
	admin.setAdminId("Team@3");
	admin.setPassword("Team3@v.com");


	}
	public static List<Admin> getAdminRepository()
	{
		return adminRepository;
	}
}