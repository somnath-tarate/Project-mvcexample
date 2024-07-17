package com.example.mvcexample;

public class mvcexample {
	int Id;
	String userName;
	String Password;

	public mvcexample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public mvcexample(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}

	public mvcexample(int id, String userName, String password) {
		super();
		Id = id;
		this.userName = userName;
		Password = password;

	}

	@Override
	public String toString() {
		return "mvcexample [Id=" + Id + ", userName=" + userName + ", Password=" + Password + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
