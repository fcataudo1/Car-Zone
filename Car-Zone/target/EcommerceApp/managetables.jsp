<%@page import="carzone.com.dao.DAO3"%>
<%@page import="carzone.com.entity.berlina"%>
<%@page import="java.util.List"%>
<%@page import="carzone.com.conn.DBConnect"%>
<%@page import="java.sql.*,java.io.*,java.text.*,java.util.*" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Gestione Altro - Car-Zone</title>
<link rel="stylesheet" href = "images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/font.css">
<link rel="stylesheet" href="Css/customizebutton.css">



<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}

.a{
	margin-right: 50px ;
	
	}
    
    .b{
	margin-right: 25px;
	
	}
	
	.e{
	margin-left: 40px ;
	
	}
    
    .d{
	margin-left: 18px ;
	
	}
	


</style>
</head>

<body>
<form action = "" method = "post">

<%@ include file = "admin_navbar.jsp" %>


	<div style="background-color: #ebe9eb">
	<br>
	<h1>Gestione Altro</h1>
	<br>
	</div>
	<br>

	<div class ="container border">
	<br>
	
	<h4><a href = "table_cart.jsp"  class="bu a"  ><b>Carrello</b></a> <br><br>
	
	<a href = "table_orders.jsp" class="bu b"   ><b>Ordini</b></a> <br><br>
	
	<a href = "table_order_details.jsp" class="bu e"  ><b>Dettagli Ordini</b></a><br><br>
	
	<a href = "table_contactus.jsp"  class="bu d"  ><b>Contattaci</b></a></h4><br>
	
<br>
	</div>
<br>
<br>
	<footer text-align: center;
  padding: 3px;
  background-color: DarkSalmon;
  color: white;>
  
	<%@ include file = "footer.jsp" %>
</footer>


</form>

</body>
</html>