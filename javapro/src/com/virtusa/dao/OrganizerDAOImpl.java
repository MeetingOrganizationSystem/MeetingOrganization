package com.virtusa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizerDAOImpl implements OrganizerDAO {

	@Override
	public boolean organizerAuth(String organizerId, String password) {
		// TODO Auto-generated method stub
		try(	 
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
						
				{ 
					PreparedStatement st=con.prepareStatement("select organizer_Id,password from Organizer where organizer_Id=? and password=?");
				   st.setString(1,organizerId);
				   st.setString(2,password);
				   ResultSet result=st.executeQuery();
				   if(result.next())
					   System.out.println("login succesful");
				   else
					   System.out.println("incorrect organizerId or password");	   
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return false;
	}

	@Override
	public String retrieveUserType(String organizerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
