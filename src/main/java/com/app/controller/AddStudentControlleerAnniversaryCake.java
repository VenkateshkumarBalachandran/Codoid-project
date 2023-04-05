package com.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.app.dto.User;

/**
 * Servlet implementation class AddStudentControlleerAnniversaryCake
 */
@WebServlet("/AddStudentControlleerAnniversaryCake")
public class AddStudentControlleerAnniversaryCake extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentControlleerAnniversaryCake() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("buyAnniversaryCake.jsp");
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
			PreparedStatement pstmt=con.prepareStatement("insert into memberAnniversary value(?,?,?,?)");
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


