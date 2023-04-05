<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cake Shop</title>
<style>

        #submit:hover
        {
           transform: scale(1.2);
           
        }
    </style>


</head>
                <button style="height: 50px; width: 150px;border-radius: 8%;margin-left: 20px;background-color: black;"><a href="home.jsp" style="text-decoration: none;font-size: 18px;color: white;">Home</a></button>

<body style="background-image: url(https://media.bakingo.com/sq-round-shaped-vanilla-cake-4-cake904vani-AA.jpg?tr=w-320,h-320,q-70);background-repeat: no-repeat;background-attachment: fixed;background-size: 100%; ">

		<div style="text-align: center; margin-left: 200px; margin-top: 10px; display: inline-block;">
     <br>
     <h1 style="color: crimson;font-size: 50px;margin-top: -12px;">WELCOME TO UNIQUE CAKE WORLD</h1>
     <br>
     <br>
     <fieldset style="height: 455px; width: 725px; margin-left: 80px;margin-top: -50px; border: 3px solid crimson ; border-radius: 8%;background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSp_sbSlTvbaEi2cak2Yh_1UvFTSuSHU0azCw&usqp=CAU);background-repeat: no-repeat;background-size: 100%;">
         <table style="color: crimson;display: inline-block;margin-left: -60px;margin-bottom: 190px;">  
       
             <form action="admin.jsp">
             <tr><td><h2><label for="email">EMAIL-ID  :</label></h2></td>
             <td><input type="email" style="border-radius: 8%; height: 30px; border-color: tomato;" id="email" name="uemail" required maxlength="20" placeholder="Enter your valid Email ID"> (max 20 char a-z and A-Z)</td></tr>
             <tr><td><br></td></tr>
             
            
             <tr><td><h2><label for="password">PASSWORD :</label></h2></td>
             <td><input type="password" style="border-radius: 8%; height: 30px;border-color: tomato;" id="password" name="upassword" required maxlength="10" placeholder="Enter your valid password"> (max 10 char a-z and A-Z)</td></tr>
             <tr><td></td><br></tr>     
 <tr><td><br></td></tr>
 <tr><td><br></td></tr>
 <tr><td><input style="margin-left: 100px; margin-right: -300px; background-color: crimson;color: white;font-size: 15px; height: 50px; width: 90px; border-radius: 10%;" type="submit" id="login" value="Login" ></td></tr>
 <tr><td></td><br></tr> 
 <tr><td></td><br></tr> 
</table>
</fieldset>
<table style="display: inline-block; margin-top: -1000px;">
 <tr><td><hr style="display: inline-block;width: 180px; align-items: center;margin-left: 20px;">
     <p id="p1" style="display: inline-block;margin-bottom: 1px;">or</p>
     <hr style="display: inline-block;width:180px;margin-right: 40px;"></td></tr>
     <tr><td></td><br></tr> 
     <tr><td></td><br></tr> 
     <tr><td><input id="submit" type="submit" value="Sign Up" style="border-radius: 10%; background-color: crimson; color: white;margin-right: 20px; margin-bottom: 100px;height: 50px; width: 90px;"></td></tr>           
         </form>
     </table>
     </div>
</body>
</html>
</html>