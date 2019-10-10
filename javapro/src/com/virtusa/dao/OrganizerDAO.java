package com.virtusa.dao;

public interface OrganizerDAO {
	public boolean organizerAuth(String organizerId,String password);

	public String retrieveUserType(String organizerId);

}
