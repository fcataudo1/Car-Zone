	<%@ include file="validatelogina.jsp" %>
	
	<%@ include file="cartnullqty.jsp" %>
	
	<div style='margin-left:40% '>
	
	<b style='color: firebrick'>Benvenuto  <%= A%> </b> 
	
<b>	<a href="cartnulla.jsp" class="w3-bar-item w3-button" ><img src = images/cart.png height=40px alt="Il tuo carello"></a>

	<b style="position: relative;
  top: 16px;
  right: 37px;"><span style="height: 25px;
  width: 25px;
  background-color: red;
  border-radius: 50%;
  display: inline-block"><b style="color:white"><center><%=tqty %></center></b></span></b>
	</b>	
	
	<a href="addproduct.jsp" class="w3-bar-item w3-button"  ><b>Aggiungi Auto</b></a>
	
	<a href = "managecustomers.jsp" class="w3-bar-item w3-button" ><b>Gestisci Clienti</b></a>
	
	<a href = "managetables.jsp" class="w3-bar-item w3-button" ><b>Gestisci Altro</b></a>
	
	
	<a href="adminlogin.jsp" class="w3-bar-item w3-button"  ><b>Logout Admin</b></a>
	
	</div>
	<center>
	<b class="w3-wide" style="width:250px"> <h3><b>Car - Zone</b></h3></b>
	
	<div class=" w3-large w3-text-grey" style="font-weight:bold">
	
	<a href="adminhome.jsp" class="w3-bar-item w3-button"  >Home Admin</a>
	
	<a href="categorya.jsp" class="w3-bar-item w3-button"  >Modelli</a>
	
	<a href="suva.jsp" class="w3-bar-item w3-button">SUV</a>
	<a href="berlinaa.jsp" class="w3-bar-item w3-button">Berline</a>
	<a href="elettricaa.jsp" class="w3-bar-item w3-button">Auto Elettriche</a>
	<a href="dilussoa.jsp" class="w3-bar-item w3-button"> Auto di Lusso</a>
	
	<a href="viewproducta.jsp" class="w3-bar-item w3-button"  >Tutte le Auto</a>
	
	<a href="aboutusa.jsp" class="w3-bar-item w3-button"  >Chi Siamo</a>
	
	</div>
	<hr>

	