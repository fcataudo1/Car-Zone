<%@ page import="carzone.com.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="carzone.com.conn.DBConnect" %>
<%@ page import="carzone.com.dao.DAO" %>
<%@ page import="java.sql.*" %>
<%@page import="carzone.com.entity.category"%>
<%@page import="carzone.com.entity.brand"%>
<%@page import="java.util.List"%>
<%@page import="carzone.com.conn.DBConnect"%>
<%@page import="carzone.com.dao.DAO"%>
<%@page import="java.sql.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminare Auto- Car-Zone</title>
<link rel="stylesheet" href = "images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/font.css">
<link rel="stylesheet" href="Css/abc.css">
<!-- Add jQuery library -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}


.a{
	margin-right: 225px;
	
	}
    
    .b{
	margin-right: 190px;
	
	}
	
	.e{
	margin-right: 205px;
	
	}
    
    .d{
	margin-right: 215px;
	
	}
	
	.f{
	margin-right: 265px;
	
	}
	
	.g{
	margin-right: 195px;
	
	}
	
	.j{
	margin-left: 17px;
	
	}


</style>
</head>
<body>
 <form method="post" action="deleteProduct">
 <%@ include file = "admin_navbar.jsp" %>
	
		<div style="background-color: #ebe9eb">
	<br>
	<h1>Elimina Auto</h1>
	<br>
	</div>
	<br>
	
	 <div class="container border">
  	<h4><b>Seleziona auto da eliminare:</b></h4>
        <select name="carid">
            <% 
                DAO dao = new DAO(DBConnect.getConn());
                List<Product> productList = dao.getAllProducts();
                for(Product product : productList) {
                	 %>
                     <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                     <% } %>
        </select>
        <input type="submit" value="Elimina Auto">
        
        
        
        <br>
		</div>
		
		<br>
		
	<footer >
  
	<%@ include file = "footer.jsp" %>
</footer>
        
    </form>
    
    


</body>
</html>
