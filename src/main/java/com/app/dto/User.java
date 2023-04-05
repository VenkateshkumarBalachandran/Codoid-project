package com.app.dto;

public class User {

	private int uid;
	private String uname;
	private String uemail;
	private String upassword;
	
	
	public User(){}


	public User(int uid, String uname, String uemail, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upassword = upassword;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUemail() {
		return uemail;
	}


	public void setUemail(String uemail) {
		this.uemail = uemail;
	}


	public String getUpassword() {
		return upassword;
	}


	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + "]";
	}

	
}
