<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body> 
<%
	String msg1 = (String) request.getAttribute("msg");

if(msg1!=null)
{
	%>
      <h1 style="margin-left:1350px"><%=msg1 %></h1>
<%}
else
{%>
    <h1><%=msg1 %></h1> 
 <%} %>     
	
<button style="margin-left: 1350px;height: 60px; background-color: crimson;border-radius: 10%; color: white;font-size: 20px; width:90px;"><a href="logoutController" style="text-decoration: none;color: white;">Logout</a></button>  
<script src="https://kit.fontawesome.com/ba687577c5.js" crossorigin="anonymous"></script>
    <i class="fa-solid fa-cake-candles fa-3x" style="margin-left: 300px;margin-top: 5px;"></i>
    <h1 style="text-align: center; margin-top: -35px;color:crimson">Choose Your Favourite Cake in Unique Cake World</h1>
    <div style="display: grid; grid-template-columns: 200px 200px 200px;column-gap: 300px;row-gap: 50px;margin-left: 60px;">
    
    <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7Hp6WUPRtdSTUHK_1KikbxXmC7q7eSjMFBR_wJD0KUoQWkkQjdMfFQJRShmishmKliUs&usqp=CAU" alt="" style="height: 350px;width: 400px;">
    <p style="margin-left: 20px;font-size: 18px;">Cake Name    : Chocolate Cake</p>
    <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs  </p>
    <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>
            <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Chocolate.jsp" style="text-decoration: none;color: white;">BUY NOW</a></button>
         </div>
            <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGVRigJgdL5uF6faqBbtdAxoPMiy41XhBB40sQaFXCrtdkw1970f0XiCkxNNqciNyjF70&usqp=CAU" alt="" style="height: 350px;width: 400px;">
                <p style="margin-left: 20px;font-size: 18px;">Cake Name    : White Forest Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>
                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="WhiteForestCake.jsp" style="text-decoration: none;color: white;">BUY NOW</a></button>
            
            </div>
            <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeTDltmFA0HDotsqmGUHGizOwu1XjeZPcpLv6I5TzXac1hxNge27ydTtsB9-8iaBQ5USc&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Anniversary Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Anniversarycake.jsp" style="text-decoration: none;color: white;">BUY NOW</a></button>
                
        </div>
         <div style="width:400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSw24smgDvE8qm63MCNqW3AsijfYVip-j2j2g&usqp=CAU" alt="" style="height: 350px;width:400px;">
                <p style="margin-left: 20px;font-size: 18px;">Cake Name    : Red Velvet Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Red Velvet cake.jsp" style="text-decoration: none;color: white;">BUY NOW</a></button>
            
            </div> 
            <!--
            <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAbtpd3zE2N4k9cXMFzeifs_2EDTTl45dr8Q&usqp=CAU" alt="" style="height: 350px;width: 400px;">
                <p style="margin-left: 20px;font-size: 18px;">Cake Name    : Pure Chocolate Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Pure Chocolate Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
                
            </div>
            <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPSzcs76YX52dma1noUrem24lcHGkOVtlOFw&usqp=CAU" alt="" style="height: 350px;width: 400px;">
                <p style="margin-left: 20px;font-size: 18px;">Cake Name    : Birthday Chocolate Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Birthday Chocolate Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
            </div>
            <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR490UWxIayxmMEUytZFDRR5VDIfC3TgVViQ&usqp=CAU" alt="" style="height: 350px;width: 400px;">
                <p style="margin-left: 20px;font-size: 18px;">Cake Name    : Plain Chocolate Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="plain.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
               
            </div>
             
            <div style="width:400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSw24smgDvE8qm63MCNqW3AsijfYVip-j2j2g&usqp=CAU" alt="" style="height: 350px;width:400px;">
                <p style="margin-left: 20px;font-size: 18px;">Cake Name    : Red Velvet Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Red Velvet Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
            
            </div> 
            
        <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfQFjGNmgqP9pVhJRJNTJn21SSAdDHCBjYTw&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Nuts Choco Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Nuts Choco Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
        </div>
        <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlank7tWI8kNqKGIxaDxnrpdI-P2aJltR3-g&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Camera Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Camera.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
          
        </div>
        <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWIRC7IdvJ23OiZHzbenzBXwJ1LslCUr7VqQ&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Toys Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Dolls.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
                
        </div>
        
        <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRE3V4JpMPB6wJIrhun2ksO2i2xxj7Kd2BXDg&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Apple Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Apple Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
                
        </div>
        <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ0pnbWMwXvJIE3dckmmqj-jHNrECzekE7eQ&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Plain Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Plain Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
                
        </div>
         
        <div style="width: 400px;height: 550px; border-bottom:1px solid #5d5d5d;background-color: rgb(207, 220, 207)">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeTDltmFA0HDotsqmGUHGizOwu1XjeZPcpLv6I5TzXac1hxNge27ydTtsB9-8iaBQ5USc&usqp=CAU" alt="" style="height: 350px;width: 400px;">
            <p style="margin-left: 20px;font-size: 18px;">Cake Name        : Anniversary Cake</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Price   : 250.0 Rs</p>
                <p style="margin-left: 20px;font-size: 18px;">Cake Quantity: 25</p>

                <button style="background-color:  #ce3b3b;height: 50px; width: 190px;color: white;margin-left: 160px;border-radius: 6%;font-size: 19px; "><a href="Anniversary Cake.jsp" style="text-decoration: none;color: white;">Add to Cart</a></button>
                
        </div>
        
        -->
    </div>    
</body>
</html>
    