package com.virtusa.entities;

import java.util.Scanner;
import com.virtusa.repository.AdminRepository;

public class Admin {
	private String adminId;
	private String password;
	
	public String getAdminId() {
		return adminId;
	}

    public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

    public String getPassword() {
		return password;
	}

    public void setPassword(String password) {
		this.password = password;
	}
    
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + "]";
	}

}
