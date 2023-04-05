package com.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.dao.UserDAO;
/**
 * Servlet implementation class registerusercotroller
 */
@WebServlet("/registerusercotroller")
public class registerusercotroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO dao = new UserDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerusercotroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd2 = request.getRequestDispatcher("register.jsp");
		String msg = "";

		String id = request.getParameter("uid");
		String uname = request.getParameter("uname");
		String uemail = request.getParameter("email");
		String upassword = request.getParameter("password");
       
		int uid =  Integer.parseInt(id);
	
		if (dao.register(uid, uname, uemail, upassword)) {
			msg = "Registered Successfully.......... ";
		} else {
			msg = "Something went wrong";
		}
		request.setAttribute("msg", msg);
		rd2.forward(request, response);
	}

}
