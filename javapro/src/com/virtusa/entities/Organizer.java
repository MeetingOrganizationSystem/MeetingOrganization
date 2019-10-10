package com.virtusa.entities;

public class Organizer {
  private String organizerId;
  private String password;
public String getOrganizerId() {
	return organizerId;
}
public void setOrganizerId(String organizerId) {
	this.organizerId = organizerId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Organizer [organizerId=" + organizerId + ", password=" + password + "]";
}
  
}
