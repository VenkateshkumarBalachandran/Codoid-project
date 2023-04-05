package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.StudentDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.List;

import com.app.dao.StudentDao;
import com.app.dto.StudentDto;
import com.app.dto.User;

@WebServlet("/AddStudentControlleer")
public class AddStudentControlleer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDao dao = new StudentDao();
	
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   			throws ServletException, IOException 
   	{
   		response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("buychocolate.jsp");
        System.out.println("welcome enter to add student controleer");
        PrintWriter pw = response.getWriter();
        String id = request.getParameter("uid");
        String uname= request.getParameter("uname");
        String uemail= request.getParameter("uemail");
        String upassword = request.getParameter("upassword");
        String msg = "";
        
        int uid = Integer.parseInt(id);
        //double sperc = Double.parseDouble(perc);
        
        User dto = new User(uid,uname,uemail,upassword);
        System.out.println("rrr");
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logic","root","kumar$2406");
			PreparedStatement pstmt=con.prepareStatement("insert into member1 value(?,?,?,?)");
			 pstmt.setInt(1, uid);
		  	   pstmt.setString(2, uname);
		  	 pstmt.setString(3, uemail);
		  	   pstmt.setString(4, upassword);
		  	   
		  	   
		  	   int nori = pstmt.executeUpdate();
		  	   
		  	   if (nori != 1) {
					boolean res = false;
					msg = "<h2>Something Went Wrong ........<a href = 'home.jsp'>Home</a></h2>";
					//pw.println(msg);
				}
		  	 if (nori == 1) {
					boolean res = true;
					msg ="<h2>cake Added Successfully ........<a href = 'home.jsp'>Home</a></h2>\"";
					//pw.println(msg);
				}
				
				
        	//if (dao.addStudent(dto)) {
        		//msg = "<h2>cake Added Successfully ........<a href = 'index.html'>Home</a></h2>";
				//pw.println(msg);
			//}
        	//else {
        	//	msg = "<h2>Something Went Wrong ........<a href = 'index.html'>Home</a></h2>";
        		//pw.println(msg);
			//}
        	request.setAttribute("msg",msg);
      	    rd.forward(request,response);
		} catch (Exception e) {
          e.printStackTrace();
		}
	

  

}


}
