<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Errore - Car-Zone</title>
<link rel="stylesheet" href = "images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/font.css">

<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
</style>
</head>
<body>
<%@ include file = "navbar.jsp" %>

		<div style="background-color: #ebe9eb">
	<br>
	<h1>Messaggio</h1>
	
	<br>
	</div>
	<br>
	
	<div style="color:firebrick"><h2>Qualcosa è andato storto.</h2>
    <h3>Prova a usare un nome diverso</h3>
    <h3>oppure</h3>
    <h3>Prova a usare un ID email diverso.</h3>
</div>




<br>
	<footer text-align: center;
  padding: 3px;
  background-color: DarkSalmon;
  color: white;>
  
	<%@ include file = "footer.jsp" %>
</footer>
</body>
</html>