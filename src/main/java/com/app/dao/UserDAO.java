package com.app.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dto.*;
import java.util.*;
import com.qsp.util.*;
public class UserDAO {
	public boolean register(int uid, String uname, String uemail, String upassword) {
		boolean res = false;
		PreparedStatement pstmt = null;
		Connection con = DButility.getConnection();
		try {
			pstmt = con.prepareStatement("insert into user values(?,?,?,?)");
			pstmt.setInt(1, uid);
			pstmt.setString(2, uname);
			pstmt.setString(3, uemail);
			pstmt.setString(4, upassword);
			int nori = pstmt.executeUpdate();
			if (nori == 1) {
				res = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public boolean login(String uemail, String upassword) 
	{
		boolean res = false;
		PreparedStatement pstmt = null;
		Connection con = DButility.getConnection();
		try {
			pstmt = con.prepareStatement("select * from user where uemail=? and upassword=?");
			pstmt.setString(1, uemail);
			pstmt.setString(2, upassword);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				res = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	 public boolean addStudent(User dto) throws SQLException {
  	   boolean res = true;
  	   
  	   Connection con = DButility.getConnection();
  	   PreparedStatement pstmt = con.prepareStatement("insert into member value(?,?)");
  	   
  	   pstmt.setString(1, dto.getUemail());
  	   pstmt.setString(2, dto.getUpassword());
  	   
  	   
  	   int nori = pstmt.executeUpdate();
  	   
  	   if (nori != 1) {
			res = false;
		}
		return res;
	}
	 public List<User> diplayStudent() {
			List<User> student = new ArrayList<User>();
			
			 Connection con = DButility.getConnection();
			 
			 try {
				 PreparedStatement pstmt = con.prepareStatement("select * from member1");
				 
				 ResultSet rs = pstmt.executeQuery();
				 
				   
	  	 	   while (rs.next()) {
					User dto = new User();
				    dto.setUid(rs.getInt(1));
					dto.setUname(rs.getString(2));
				     dto.setUemail(rs.getString(3));
					dto.setUpassword(rs.getString(4));
				    student.add(dto);
				    
				}
				   
			} catch (Exception e) {
	          e.printStackTrace();
			}
			 
			
			return student;
		}
	 public List<User> diplayStudent1() {
			List<User> student = new ArrayList<User>();
			
			 Connection con = DButility.getConnection();
			 
			 try {
				 PreparedStatement pstmt = con.prepareStatement("select * from memberWhite");
				 
				 ResultSet rs = pstmt.executeQuery();
				 
				   
	  	 	   while (rs.next()) {
					User dto = new User();
				    dto.setUid(rs.getInt(1));
					dto.setUname(rs.getString(2));
				     dto.setUemail(rs.getString(3));
					dto.setUpassword(rs.getString(4));
				    student.add(dto);
				    
				}
				   
			} catch (Exception e) {
	          e.printStackTrace();
			}
			 
			
			return student;
		}
	 public List<User> diplayStudent2() {
			List<User> student = new ArrayList<User>();
			
			 Connection con = DButility.getConnection();
			 
			 try {
				 PreparedStatement pstmt = con.prepareStatement("select * from memberAnniversary");
				 
				 ResultSet rs = pstmt.executeQuery();
				 
				   
	  	 	   while (rs.next()) {
					User dto = new User();
				    dto.setUid(rs.getInt(1));
					dto.setUname(rs.getString(2));
				     dto.setUemail(rs.getString(3));
					dto.setUpassword(rs.getString(4));
				    student.add(dto);
				    
				}
				   
			} catch (Exception e) {
	          e.printStackTrace();
			}
			 
			
			return student;
		}
	 public List<User> diplayStudent3() {
			List<User> student = new ArrayList<User>();
			
			 Connection con = DButility.getConnection();
			 
			 try {
				 PreparedStatement pstmt = con.prepareStatement("select * from memberRedvelvet");
				 
				 ResultSet rs = pstmt.executeQuery();
				 
				   
	  	 	   while (rs.next()) {
					User dto = new User();
				    dto.setUid(rs.getInt(1));
					dto.setUname(rs.getString(2));
				     dto.setUemail(rs.getString(3));
					dto.setUpassword(rs.getString(4));
				    student.add(dto);
				    
				}
				   
			} catch (Exception e) {
	          e.printStackTrace();
			}
			 
			
			return student;
		}
}
