package com.harsha;

public class SignUpBean {

	private String userName;
	private String password;
	private String email;
	
	/*public SignUpBean() {
		// TODO Auto-generated constructor stub
	}
	
	public SignUpBean(String userName, String password) {
		// TODO Auto-generated constructor stub
		this.userName=userName;
		this.password=password;
	}*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
