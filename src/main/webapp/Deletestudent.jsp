<%@page import="com.app.dto.StudentDto" %>
<%@page import="com.app.dao.StudentDao" %>

<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String msg = (String)request.getAttribute("msg");
 if(msg!=null)
 {
	 if(msg.contains("delete"))
	 {%>
	  <h2><font color = "green"><%=msg %></font></h2>
		 
	 <%}
	 else
	 {%>
	  <h2><font color = "red"><%=msg %></font></h2>
		 
	 <%}
	 %>
	 
      <%}

%>
<h1>Delete Student</h1>

<form action="DeleteStudentController">
<pre>
  SID: <input type="text" name = "sid">
  
         <input type="submit" value = "delete-student">
</pre>
</form>
</body>
</html>