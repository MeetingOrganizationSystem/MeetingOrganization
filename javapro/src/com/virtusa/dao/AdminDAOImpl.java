
	package com.virtusa.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

	import com.virtusa.entities.Admin;
	import com.virtusa.repository.AdminRepository;

	public class AdminDAOImpl implements AdminDao {
		private List<Admin> adminList=null;
		 
	    public AdminDAOImpl()
	    {
	    	this.adminList=AdminRepository.getAdminRepository();
	    }

		@Override
		public boolean adminAuth(String adminId, String password) {
			
		// TODO Auto-generated method stub
		try(	 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
				
		{ 
			PreparedStatement st=con.prepareStatement("select admin_Id,password from Admin where admin_Id=? and password=?");
		   st.setString(1,adminId);
		   st.setString(2,password);
		   ResultSet result=st.executeQuery();
		   if(result.next())
			   System.out.println("login succesful");
		   else
			   System.out.println("incorrect adminId or password");	   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return false;
		}

		@Override
		public String retrieveUserType(String adminId) {
			// TODO Auto-generated method stub
			return null;
		}
		
	


}
