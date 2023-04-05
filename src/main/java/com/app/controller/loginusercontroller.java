package com.app.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.app.dao.UserDAO;
/**
 * Servlet implementation class loginusercontroller
 */
@WebServlet("/loginusercontroller")
public class loginusercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO dao=new UserDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginusercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd1=request.getRequestDispatcher("first.jsp");
		RequestDispatcher rd2=request.getRequestDispatcher("login.jsp");
		String msg="";
		String msg1="";
		HttpSession session=null;
		
		String uemail=request.getParameter("uemail");
		String upassword=request.getParameter("upassword");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logic","root","kumar$2406");
			PreparedStatement pstmt=con.prepareStatement("select uname from user where uemail=?");
			pstmt.setString(1, uemail);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				
				msg=rs.getString(1);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		String uname=request.getParameter("uname");
		if(dao.login(uemail,upassword))
		{
			//session=request.getSession();
			session=request.getSession(true);
			System.out.println(uemail+"-------->"+session.getId()+"logged in "+msg);			
			session.setAttribute("un", uemail);
			session.setMaxInactiveInterval(5);
			request.setAttribute("msg", msg);
			rd2.forward(request, response);
			
			msg1=msg;
			
		
		}
		else {
			msg1="Invalid Credentials";
			request.setAttribute("msg1", msg);
			rd1.forward(request, response);
		}
	}

}
