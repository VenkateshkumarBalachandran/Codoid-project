<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<body>
     

<%
String uemail="admin@gmail.com"; 
String upassword="admin1";
String msg="Admin Login Successfully";
String msg1="Invalid Credentials";

     
      String email =  request.getParameter("uemail");
      String password = request.getParameter("upassword");

	if(uemail.equals(email) && upassword.equals(password))
	{
     
     %>
     
	<button
		style="margin-left: 1350px; height: 60px; background-color: crimson; color: white; border-radius: 10%; font-size: 20px; width: 90px;">
		<a href="logoutController"
			style="text-decoration: none; color: white;">Logout</a>
	</button>
	<h1 style="font-family: sans-serif;">Welcome to Admin Page</h1>
	<div
		style="display: grid; grid-template-columns: 200px 200px 200px; margin-left: 300px">

		<!-- <div>
			<button
				style="height: 200px; background-color: crimson; color: white; font-size: 20px; width: 230px;">
				<a href="addcake.jsp" style="text-decoration: none;">Add Cake</a>
			</button>
		</div>
		<div>
			<button
				style="height: 200px; background-color: crimson; color: white; font-size: 20px; width: 230px;">
				<a href="deletecake.jsp" style="text-decoration: none;">Delete
					Cake</a>
			</button>
		</div>
		<div>
			<button
				style="height: 200px; background-color: crimson; color: white; font-size: 20px; width: 230px;">
				<a href="updatecake.jsp" style="text-decoration: none;">Update
					Cake</a>
			</button>
		</div>
		<div>
			<button
				style="height: 200px; background-color: crimson; color: white; font-size: 20px; width: 230px;">
				<a href="searchcakecontroller" style="text-decoration: none;">Search
					Cake</a>
			</button>
		</div>
		 -->
		<div>
			<button
				style="height: 200px; background-color: crimson; color: white; font-size: 20px; width: 230px;">
				<a href="DisplayController" style="text-decoration: none;">DisplayAll
					Cake</a>
			</button>
		</div>
		
       <div>
			<button
				style="height: 200px; background-color: crimson; color: white; font-size: 20px; width: 230px;">
				<a href="ShowOrder.jsp" style="text-decoration: none;">DisplayOrders</a>
			</button>
			
		
		</div>
		
	</div>
	
  <%} else { %>
      	<h2><font color="red"><%= msg1 %></font></h2>
      
  <%} %>
                   <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="home.jsp" style="text-decoration: none;font-size: 18px;color: white;">Home</a></button>
   
</body>
</html>