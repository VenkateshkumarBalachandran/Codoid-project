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
<h1>Searched Student</h1>
<%
 String msg = (String)request.getAttribute("msg");
 if(msg!=null)
 {
  %>
	  <h2><font color = "red"><%=msg %></font></h2>
		 
	 <%}
	 %>
	 


<form action="SearchController">
<pre>
  SID:   <input type="text" name="sid">
      
                 <input type="submit" value="search-student">
</pre>
</form>
	
</body>
</html>                
                
                
                