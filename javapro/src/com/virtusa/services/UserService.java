package com.virtusa.services;

import java.sql.SQLException;

import com.virtusa.model.AdminModel;

public interface AdminService {
 public String adminAuthenticationService(AdminModel adminModel) throws ClassNotFoundException, SQLException;
}
