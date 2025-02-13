<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conferma Pagamento - Car-Zone</title>
<link rel="stylesheet" href = "images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/abc.css">
<link rel="stylesheet" href="Css/font.css">
<link rel="stylesheet" href="Css/whitespace.css">

<style>
.w3-sidebar a {font-family: "Roboto", sans-serif}
body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}

.a{
	margin-right: 140px;
	
	}
    
    .b{
	margin-right: 145px;
	
	}
    
    .z{
	margin-right: 300px;
	
	}
    
    .d{
	margin-right: 235px;
	
	}
    
    .e{
	margin-right: 235px;
	
	}
    
    .f{
	margin-right: 270px;
	
	}
	
	 .g{
	margin-right: 210px;
	
	}
    


</style>



</head>
<body>
<form method = "post" action = "confirmpayment.jsp">
	<%@ include file = "customer_navbar.jsp" %>
<center>
<%
String CName = request.getParameter("CName");
String CusName = request.getParameter("CusName");
String City = request.getParameter("City");
String Total = request.getParameter("Total"); 







 

%>
<input type = "hidden" name = "CName" value ="<%=CName %>" >
<input type = "hidden" name = "City" value ="<%=City %>" >
<input type = "hidden" name = "Total" value =<%=Total %> >
<input type = "hidden" name = "CusName" value =<%=CusName %> >




<div style="background-color: #ebe9eb">	
	<br>
	<h1>Dettagli Pagamento</h1>
	<br>
	</div>

<br>

<div class = "container border" style="background-color:white">
                <br>
                
                <div class = "row" style="justify-content: center">

                        <div class = "col-xl-4 col-lg-1 col-md-1" style="background-color:white">
                            <br>
                            <center>
                                <img src="images/payimg.jpg" alt=Feedback height="400px" class= "imgh">   
                            </center><br>

                        </div>
                        <br>
                       

                        <div class = "col-xl-2 col-lg-1 col-md-1" style="background-color: white">
                            <center> 




<h3 class = "ws">Compila i dettagli sottostanti per procedere</h3>
<br>
<br>

<img src = "images/paymethod.png" height=100px width = 300px>
<br>


<h4 class = "a ws"><b>Nome sulla Carta di Credito:</b></h4>
<h2><input type ="text"  class = "c"    required> </h2>

<h4><b class = "b ws">Numero della Carta di Credito: </b></h4>
<h2> <input type ="number"  class = "c"   required></h2>

<h4><b class = "d ws">"Seleziona Carta di Credito":</b></h4>

	<select name="Credit Card Type"  class="c ws" required>
				<option value="" disabled selected>Seleziona Carta di Credito</option>
			    <option>Master Card</option>
			    <option>Visa Card</option>
			    <option>Discover</option>
			    <option>Maestro</option>
			    <option>American Express</option>
	</select> 


	<h4><b class = "e ws">Data di Scadenza</b></h4>
	<div class = "cc1">
		<div class = "row ws">
			<div class = "col-xl-6 col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<select name="Month" class="cc2" required>

							<option value="" disabled selected>Mese</option>
						    <option>Gennaio</option>
						    <option>Febbraio</option>
						    <option>Marzo</option>
						    <option>Aprile</option>
						    <option>Maggio</option>
						    <option>Giugno</option>
						    <option>Luglio</option>
						    <option>Agosto</option>
						    <option>Settembre</option>
						    <option>Ottobre</option>
						    <option>Novembre</option>
						    <option>Dicembre</option>
				</select>
			</div>
			
			<div class = "col-xl-6 col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<select name="Year" class="cc2" required>
							<option value="" disabled selected>Anno</option>
							<% for(int i = 2025; i <= 2050; i ++)
							{%>
							    <option><%= i %></option>
							    <%} %>
				</select> 
			</div>
	
		</div>
	</div>


<h4><b class ="f ws">Numero CVV: </b></h4>
<h2><input type ="number"  name = "cvvno"  class="c"  required></h2>


<h4><b class = "g ws">Importo Pagato</b></h4>
<h2><input type ="text"  value= "€ <%=Total %>" class="c" disabled selected required></h2>








<br>
<br>
<br>
<h5><b class = "ws"><button style='border: solid 1px '><a href = "customerhome.jsp" style='text-decoration: none'>Annulla Pagamento</a></button> 
<input type = "submit" value= "Procedi" name = "online"> </b></h5>


 </center> 
                            <br>
                            <br>                        
                        </div>
                    
                </div>    
                <br>
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