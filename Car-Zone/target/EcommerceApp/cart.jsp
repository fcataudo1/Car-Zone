<%@page import="carzone.com.entity.cart"%>
<%@page import="carzone.com.conn.DBConnect"%>
<%@page import="carzone.com.dao.DAO2"%>
<%@page import="java.sql.*,java.io.*,java.text.*,java.util.*" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrello - Car-Zone</title>
<link rel="stylesheet" href = "images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/font.css">
<link rel="stylesheet" href="Css/cart.css">
<link rel="stylesheet" href="Css/whitespace.css">

 <script>

        function show()
        {
            alert("Prima aggiungi qualcosa al carrello.");
        }
    </script>

<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
</style>
</head>
<body>

<%@ include file = "customer_navbar.jsp" %>
<center>
<div style="background-color: #ebe9eb">
	<br>
	<h1>Carrello</h1>
	<br>
	</div>
	<br>


<%

String msgg = null;
Cookie[] cookies = request.getCookies();

for(int i = 0; i < cookies.length; i++) 
	{
if (cookies[i].getName().equals("cart")) 
	{
        cookies[i].setMaxAge(0);
        response.addCookie(cookies[i]);
        msgg = "Product added to cart successfully....";
	}       
}

%>
<%if(msgg != null)
		out.println("<b style='color: firebrick'>" + msgg +  "</b>");%>

	<div class = "table-responsive">
	<div class = "mbd">
	<div class = "container border">
	<br>
	<%
	int Total = 0;
	String ct = N;
	DAO2 dao = new DAO2(DBConnect.getConn());
	List<cart> listv = dao.getcart(ct);
	for(cart v : listv)
	{%>
			
			
			<div class = "container bd">
			
			<div class = "row justify-content-center align-items-center">
			
			<div class = "col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2">
				<img src='images/<%=v.getCarimage() %>' height=100px weight=90px>
			</div>
		
			
			<div class = "col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2">
				<b><%=v.getBname() %><%=v.getCarname() %></b>
				<br><b><%=v.getCname()%></b>
				</div>

			<div class = "col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2">
				<b><%=v.getCarquantity() %></b>
			</div>

				<div class = "col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2">
				<b>₹ <%=v.getCarprice() %></b>
				</div>
				
				
			
				
			<div class = "col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2">		
				<a href='removecart?ie=<%=v.getCarimage()%>&id=<%=N%>'><img src = "images/delete.jpg" alt="Remove" height= 25px></a>

				</div>
				
			<% Total = Total + v.getCarprice()* v.getCarquantity() ; %>
	
		</div>
		</div>
		<br>
		<%} %>

		<div class = "tp"><h5><b>Prezzo Totale: € <%=Total %></b> </h5></div>
		<br>
		<%if(Total != 0)
			{%>
		<a href="ShippingAddress.jsp?Total=<%= Total %>"><button class = "pd"><h5 class = "ws"><b> Procedi al Checkout</b></h5></button></a>
		<%}
		else if(Total == 0)
		{%>
		<button onclick = "show()" class = "pd"><h5 class = "ws"><b> Procedi al Checkout</b></h5></button>
		<%}%>
	


<% if(Total == 0)
	{%>
	<center>
	<img src = "images/emptycart.png" height=200px>
	<h2 style="color:firebrick">IL TUO CARRELLO È VUOTO</h2>
	</center>
	<%} %>
	
	</div>
</div>
</div>
	
</center>


<br>
	<footer text-align: center;
  padding: 3px;
  background-color: DarkSalmon;
  color: white;>
  
	<%@ include file = "footer.jsp" %>
</footer>







</body>
</html>