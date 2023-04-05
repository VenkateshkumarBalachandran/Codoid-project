<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
   <style>
    button
    {
    
        animation: bg 2s;
    }
    @keyframes bg 
    {
        from
        {
            transform: translateX(-1000px);
            
            

        }
        to
        {
            transform: translateX(0px);
        }
    }
     button:hover
        {
            transform: scale(1.2);
        }
   </style>
</head>
<%String msg3 = "Already signup click login or click sign up"; %>
<%String msg4 = "To order the cake click Buy cakes"; %>


    <body     style="background-image: url(cake1.JPG); background-repeat: no-repeat; background-attachment: fixed; background-size: 100%;">           
              
        <div>
            <h3><%= msg4  %></h3>
            <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 1000px; background-color: black;"><h3><a href="user.jsp" style="text-decoration: none;font-size: 18px;color: white;">Buy Cakes</a></button>
                                                                                                                                                                                               
            <h3><%= msg3  %></h3><button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="loginusercontroller" style="text-decoration: none;font-size: 18px;color: white;">Login</a></button>
            
            <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="register.jsp" style="text-decoration: none;font-size: 18px;color: white;">SignUp</a></button>
            
             <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="index.jsp" style="text-decoration: none;font-size: 18px;color: white;">Admin Login</a></button>
         <!--   <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="displayControllerorder" style="text-decoration: none;font-size: 18px;color: white;">Display Orders</a></button>-->
<button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="ShowOrder.jsp" style="text-decoration: none;font-size: 18px;color: white;">Show Orders</a></button>
        </div>
</body>
</html>
</body>
</html>