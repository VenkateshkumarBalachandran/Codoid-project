package com.app.controller;


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

@WebServlet("/DeleteStudentController")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDao dao = new StudentDao();
	
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   			throws ServletException, IOException
   	{
   		response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("Deletestudent.jsp");

        PrintWriter pw = response.getWriter();
        String id = request.getParameter("sid");
        int sid = Integer.parseInt(id);
        String msg = "";
        
        try {
			if (dao.deleteStudent(sid)) {
				msg = "<h2>Student Deleted Successfully ........<a href = 'index.html'>Home</a></h2>";
				//pw.println(msg);
			}
			else {
				msg = "<h2>Something Went Wrong ........<a href = 'index.html'>Home</a></h2>";
				//pw.println(msg);
			}
			request.setAttribute("msg",msg);
	    	rd.forward(request,response);
		} catch (Exception e) {
       e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
