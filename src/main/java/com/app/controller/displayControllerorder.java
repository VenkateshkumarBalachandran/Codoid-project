package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import com.app.dao.*;
import com.app.dto.*;

/**
 * Servlet implementation class displayControllerorder
 */
@WebServlet("/displayControllerorder")
public class displayControllerorder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO dao = new UserDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayControllerorder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        List<User> student;
        try {
			 student = dao.diplayStudent();
			 
			 if (student.size() == 0) {
				pw.println("No Student Database...........<a href ='home.jsp'></a>");
				
			}
			 else {
                    pw.println("<style>\r\n"
                    		+ "body { \r\n"
                    		+ "  background-image:  url(https://img.freepik.com/free-photo/frame-food-ingredients-baking-gently-pink-pastel-background-cooking-flat-lay-with-copy-space-top-view-baking-concept-flat-lay_127032-2200.jpg?w=1060&t=st=1679210154~exp=1679210754~hmac=06531acfeb78cac743de3817b8358f581ec0bd779be94845ce68fdb880f1bb9cs);\r\n"
                    		+"<a  href ='home.jsp'>Home</a>"+ "  background-repeat: no-repeat;\r\n"
                    		+ "  background-attachment: fixed;\r\n"
                    		+ "  background-position: center; \r\n"
                    		+ "}\r\n"
                    		+ "</style>");
                    
                    pw.println("<style>\r\n"
                    		+ "table, th, td {\r\n"
                    		+ "  border: 1px solid black;\r\n"
                    		+ "  border-collapse: collapse;\r\n"
                    		+ "}\r\n"
                    		+ "\r\n"
                    		+ "table.center {\r\n"
                    		+ "  margin-left: auto; \r\n"
                    		+ "  margin-right: auto;\r\n"
                    		+ "}\r\n"
                    		+ "</style>");
					pw.println("<table class = 'center'>");
					pw.println("<tr><th>UID</th> <th>UNAME</th>  <th>Uemail</th> <th>Upassword</th></tr>");
					for (User dto : student) {
						pw.println("<tr>");
						pw.println("<td>" + dto.getUid() + "</td>" + "<td>" + dto.getUname() + "</td>" + "<td>" + dto.getUemail() + "</td>"+ "<td>" + dto.getUpassword() + "</td>");
						pw.println("</tr>");
					}
					//pw.println("<a href ='home.jsp'>Home</a>");
					pw.println("<button style=\"height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;\"><a href=\"home.jsp\" style=\"text-decoration: none;font-size: 18px;color: white;\">Home</a></button>\r\n"
							+ "        ");
                    pw.println("<button style=\"height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;\"><a href=\"ShowOrder.jsp\" style=\"text-decoration: none;font-size: 18px;color: white;\">Show Orders</a></button>\r\n"
                    		+ "        ");
			}
			 
		} catch (Exception e) {
          e.printStackTrace();
		}
	}

	}


