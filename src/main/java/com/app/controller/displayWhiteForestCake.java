package com.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.app.dto.User;
import com.app.dao.UserDAO;
/**
 * Servlet implementation class displayWhiteForestCake
 */
@WebServlet("/displayWhiteForestCake")
public class displayWhiteForestCake extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO dao = new UserDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayWhiteForestCake() {
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
			 student = dao.diplayStudent1();
			 
			 if (student.size() == 0) {
				pw.println("No Student Database...........<a href ='index.html'></a>");
				
			}
			 else {
				   pw.println("<style>\r\n"
                   		+ "body { \r\n"
                   		+"background-color:powder green;\r\n"
                   		+"<a  href ='home.jsp'>Home</a>"+ "  background-repeat: no-repeat;\r\n"
                   		+ "  background-attachment: fixed;\r\n"
                   		+ "  background-position: center; \r\n"
                   		+ "}\r\n"
                   		+ "</style>");
                   
                   pw.println("<style>\r\n"
                   		+ "table, th, td {\r\n"
                   		+ "  border: 1px solid red;\r\n"
                   		+"bordercolor = 'red'"+ "  border-collapse: collapse;\r\n"
                   		+ "}\r\n"
                   		+ "\r\n"
                   		+ "table.center {\r\n"
                   		+ "  margin-left: auto; \r\n"
                   		+ "  margin-right: auto;\r\n"
                   		+ "}\r\n"
                   		+ "</style>");
					pw.println("<table class = 'center'>");
					//pw.println("<table border = '5' bordercolor = 'red'>");
					pw.println("<tr><th>UID</th> <th>UNAME</th>  <th>Uemail</th> <th>Upassword</th></tr>");
					for (User dto : student) {
						pw.println("<tr>");
						pw.println("<td>" + dto.getUid() + "</td>" + "<td>" + dto.getUname() + "</td>" + "<td>" + dto.getUemail() + "</td>"+ "<td>" + dto.getUpassword() + "</td>");
						pw.println("</tr>");
					}
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
