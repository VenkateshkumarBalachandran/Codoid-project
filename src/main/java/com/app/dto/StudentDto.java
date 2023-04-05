package com.app.dto;

public class StudentDto {
   private int sid;
   private String sname;
   private double sperc;
   public StudentDto()
   {
	   
   }
public StudentDto(int sid, String sname, double sperc) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sperc = sperc;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public double getSperc() {
	return sperc;
}
public void setSperc(double sperc) {
	this.sperc = sperc;
}
   
   
}
