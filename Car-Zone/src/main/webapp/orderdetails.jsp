<%@page import="carzone.com.entity.order_details"%>
<%@page import="carzone.com.entity.orders"%>
<%@page import="carzone.com.conn.DBConnect"%>
<%@page import="carzone.com.dao.DAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dettagli Ordini - Car-Zone</title>

<link rel="stylesheet" href = "images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/font.css">

<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
</style>
</head>
<body>

<form method = "post" action = "payprocess.jsp">
	<%@ include file = "customer_navbar.jsp" %>



<center>
<div style="background-color: #ebe9eb">	
	<br>
	<h1>Dettagli Ordini</h1>
	<br>
	</div>

	<br>
	



		
				<table border = '1' cellspacing=5 cellpadding=5 align='center'>
							
							
										<% 
			
			String d = request.getParameter("id");
				
			DAO3 dao = new DAO3(DBConnect.getConn());
			List<orders> listv = dao.getOrdersbydate(d);
			for(orders v : listv)
			
			{
			%>
							<tr>
								<th>Nome Cliente: </th>
								<th><%=v.getCustomer_Name() %></th>
							</tr>
							
							<tr>
								<th>Città: </th>
								<th><%=v.getCustomer_City() %></th>
							</tr>
							
							<tr>
								<th>Data: </th>
								<th><%=v.getDate() %></th>
							</tr>
						
							<tr>
								<th>Prezzo Totale: </th>
								<th><%=v.getTotal_Price() %></th>
							</tr>
					
							<tr>
								<th>Stato: </th>
								<th><%=v.getStatus() %></th>
							</tr>

		
						
						
<% }%>
		</table>
	
	<br>
	<div class = "table-responsive">
	<table border>
	<thead>
		<tr style='background-color:#ebe9eb'>
			<th style='border: 1px solid ; text-align: center'>Data</th>
			<th style='border: 1px solid ; text-align: center'>Nome</th>
			<th style='border: 1px solid ; text-align: center'>Marca</th>
			<th style='border: 1px solid ; text-align: center'>Modello</th>
			<th style='border: 1px solid ; text-align: center'>Nome Prodotto</th>
			<th style='border: 1px solid ; text-align: center'>Prezzo</th>
			<th style='border: 1px solid ; text-align: center'>Quantità</th>
			<th style='border: 1px solid ; text-align: center'>Immagine Prodotto</th>
			
		</tr>
	</thead>
	
	
	
	<tbody>
	<% 
	int Total = 0;
	
List<order_details> listd = dao.getOrderdetails(d);
for(order_details v : listd)
	{%>
	
	<tr>
				<td style='border: 1px solid ; text-align: center'><%=v.getDate() %></td>
				
				<td style='border: 1px solid ; text-align: center'><%=v.getName() %></td>
				
				<td style='border: 1px solid ; text-align: center'><%=v.getBname() %></td>
				
				<td style='border: 1px solid ; text-align: center'><%=v.getCname() %></td>
				
				<td style='border: 1px solid ; text-align: center'><%=v.getCarname() %></td>
				
				<td style='border: 1px solid ; text-align: center'>€ <%=v.getCarprice() %></td>
				
				<td style='border: 1px solid ; text-align: center'><%=v.getCarquantity() %></td>
				
				<td style='border: 1px solid ; text-align: center'><img src='images/<%=v.getCarimage()%>' height= 100px weight = 100px></td>
						

	
		<tr>
		<% Total = Total + v.getCarprice()* v.getCarquantity() ;
		} %>
		<tr>
		<td></td>
		<td></td>
		<td></td>
		<td><h5>Prezzo Totale:</h5></td>
		<td><h5 style='color: firebrick'>€ <%= Total %></h5></td>
		<td></td>
		<td></td>
		
	</tr>
	</tbody>
	</table>
	</div>


</center>
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