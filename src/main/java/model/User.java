package model;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String email;
	
	public User() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
	}
	
	public User(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public boolean isValid() {
		if (isAttributesNotNull() && isAttributesNotEmpty()) {
			return true;
		}
		return false;
	}
	
	private boolean isAttributesNotNull() {
		return firstName != null &&
				lastName != null &&
				email != null;
	}
	
	private boolean isAttributesNotEmpty() {
		return !firstName.isEmpty() &&
				!lastName.isEmpty() &&
				!email.isEmpty();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}