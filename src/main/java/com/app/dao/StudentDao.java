package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dto.StudentDto;
import com.qsp.util.StudentUtility;

public class StudentDao {
       public boolean addStudent(StudentDto dto) throws SQLException {
    	   boolean res = true;
    	   
    	   Connection con = StudentUtility.getConnection();
    	   PreparedStatement pstmt = con.prepareStatement("insert into student value(?,?,?)");
    	   
    	   pstmt.setInt(1, dto.getSid());
    	   pstmt.setString(2, dto.getSname());
    	   pstmt.setDouble(3, dto.getSperc());
    	   
    	   int nori = pstmt.executeUpdate();
    	   
    	   if (nori != 1) {
			res = false;
		}
		return res;
	}
       public boolean  deleteStudent(int sid) throws SQLException{
		boolean res = true;
	   Connection con = StudentUtility.getConnection();
 	   PreparedStatement pstmt = con.prepareStatement("delete from student where sid =?");
 	   pstmt.setInt(1, sid);
 	   
 	   int nord = pstmt.executeUpdate();
 	   
 	   if (nord != 1) {
		return false;
	}
 	   return res;
	}
       public StudentDto searchStudent(int sid) {
    	   
    	   StudentDto dto = null;
    	   try {
    		   Connection con = StudentUtility.getConnection();
    	 	   PreparedStatement pstmt = con.prepareStatement("select * from student where sid =?");
    	 	   pstmt.setInt(1, sid);
    	 	   
    	 	   ResultSet rs = pstmt.executeQuery();
    	 	   
    	 	   if (rs.next()) {
				dto = new StudentDto();
				
		        dto.setSid(rs.getInt(1));
			    dto.setSname(rs.getString(2));
			    dto.setSperc(rs.getDouble(3));
				
			}
		} catch (Exception e) {
            e.printStackTrace();
		}
    	   
		return dto;
	}
       public List<StudentDto> diplayStudent() {
		List<StudentDto> student = new ArrayList<StudentDto>();
		
		 Connection con = StudentUtility.getConnection();
		 
		 try {
			 PreparedStatement pstmt = con.prepareStatement("select * from student");
			 
			 ResultSet rs = pstmt.executeQuery();
			 
			   
  	 	   while (rs.next()) {
				StudentDto dto = new StudentDto();
			    dto.setSid(rs.getInt(1));
			    dto.setSname(rs.getString(2));
			    dto.setSperc(rs.getDouble(3));
			    student.add(dto);
			    
			}
			   
		} catch (Exception e) {
          e.printStackTrace();
		}
		 
		
		return student;
	}
}
