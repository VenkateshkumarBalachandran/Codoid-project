<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<style>
        div{
            animation: divi 2s;
            animation-timing-function: linear;
            /* transition-duration: 10s; */
        }
        @keyframes divi {
            
            form{
                transform:rotateY(0deg);
            }
            to{
                transform: rotateY(360deg);
            }
        }
        .submit:hover
        {
          transform: scale(1.2);
        }
        
    </style>
</head>
<body>

<%
String msg=(String)request.getAttribute("msg");
if(msg!=null)
{
	if(msg.contains("Registered"))
	{%>
		<h2><font color="green"><%= msg %></font></h2>
	<%}
	else
	{%>
		<h2><font color="red"><%= msg %></font></h2>
	<%}
}
%>
<%String msg2 = "After signup click login"; %>

<button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="loginusercontroller" style="text-decoration: none;font-size: 18px;color: white;">LOGIN</a></button>
<h3><%= msg2  %></h3>
<div style="background-image: url(https://img.freepik.com/free-photo/frame-food-ingredients-baking-gently-pink-pastel-background-cooking-flat-lay-with-copy-space-top-view-baking-concept-flat-lay_127032-2200.jpg?w=1060&t=st=1679210154~exp=1679210754~hmac=06531acfeb78cac743de3817b8358f581ec0bd779be94845ce68fdb880f1bb9cs);background-repeat: no-repeat;background-attachment: fixed;background-size: 100%; ">

    <div style="text-align: center; margin-left: 200px; margin-top: 10px;color: rgb(200, 15, 123); display: inline-block;">
        <br>
        <br>
        <table style="color: crimson;display: inline-block;margin-bottom: 190px;">  
            <fieldset style="margin-left: 150px;border-color:rgb(200, 15, 123);height: 500px;width: 600px; border: 4px solid rgb(200, 15, 123);border-radius: 10%;">
                <legend><h2>WELCOME TO</h2></legend>
                <legend><h5 style="color:rgb(200, 15, 123); font-size: 50px;margin-top: -12px;">UNIQUE CAKE WORLD</h5></legend>
            <form action="registerusercotroller" style="margin-bottom: -50px;">
                <label for="userid">USER ID(Your Favourite Number) : </label>
                <input type="text" name="uid" id="userid" placeholder="Enter Your Id" required style="border-color: rgb(200, 15, 123);background-color: pink;color: rgb(200, 15, 123);">
                <br>
                <br>
                <br>
                <label for="username">User NAME: </label>
                <input type="text" name="uname" id="username" placeholder="Enter Your User-Name" style="border-color: rgb(200, 15, 123);background-color: pink;color: rgb(200, 15, 123);">
                <br>
                <br>
                <br>
                <label for="email">User EMAIL : </label>
                <input type="email" name="email" id="email" placeholder="Enter Your User-Mail" style="border-color: rgb(200, 15, 123);background-color: pink;color: rgb(200, 15, 123);">
                <br>
                <br>
                <br>
                <label for="password">PASSWORD : </label>
                <input type="password" id="password" name="password" placeholder="Enter Password" style="border-color: rgb(200, 15, 123);background-color: pink;color: rgb(200, 15, 123);">
               <br>
               <br>
               <br>
               <br>
               <br>
                <br>
                <br>
        
                <input class="submit" type="Submit" style="background-color: pink;border-color: rgb(200, 15, 123); height: 45px; width: 80px;border-radius: 10%;color: rgb(200, 15, 123);">
                <input class="submit" type="Reset" style="background-color: pink;height: 45px;border-color: rgb(200, 15, 123); width: 80px;border-radius: 10%;margin-left: 20px;color: rgb(200, 15, 123);">
                <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="home.jsp" style="text-decoration: none;font-size: 18px;color: white;">Home</a></button>
                
            </form>
        </fieldset>
        </table>
        </div>
        </div>

        
</body>
</html>