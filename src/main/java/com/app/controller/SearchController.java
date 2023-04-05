package com.app.controller;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.StudentDao;
import com.app.dto.StudentDto;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.List;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentDao dao = new StudentDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
      response.setContentType("text/html");
      RequestDispatcher rd = request.getRequestDispatcher("searchstudent.jsp");
      PrintWriter pw = response.getWriter();
      String id = request.getParameter("sid");
      int sid = Integer.parseInt(id);
      String msg ="";
      
      StudentDto  dto = dao.searchStudent(sid);
      
      if (dto != null) {
    	    msg = "Sid : "+dto.getSid()+",Sname : "+dto.getSname()+",Sperc : "+dto.getSperc();
    	 	//pw.println(msg);
	}
      else {
    	  msg = "<h2><font color = 'red'>Something went wrong........<a href = 'index.html'>Home</a></font></h2>";
    	  //pw.println(msg);
    	  
	}
      request.setAttribute("msg",msg);
	  rd.forward(request,response);
	}


}
