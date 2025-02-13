	<% String Total2 = request.getParameter("Total"); %>
	
	<input type = "hidden" name = "Total" value =<%=Total2 %> >
	
	<% String CusName2 = request.getParameter("CusName"); %>
	
	<input type = "hidden" name = "CusName" value =<%=CusName2 %> >
	
	
	

	<%@ include file="validateloginc.jsp" %>

	<div style='margin-left:40% '>
	
	<b style='color: firebrick'>Benvenuto <%= N%> </b> 
	
	<b>
	<a href="cart.jsp" class="w3-bar-item w3-button" ><img src = images/cart.png height=40px alt=Cart></a>
	<b style="position: relative;
  top: 16px;
  right: 37px;"><span style="height: 25px;
  width: 25px;
  background-color: red;
  border-radius: 50%;
  display: inline-block"><b style="color:white"><center><%=tcqty %></center></b></span></b>
	</b>
	<a href="orders.jsp" class="w3-bar-item w3-button" ><b> Visualizza Ordini</b></a>
	
	<a href="customerlogin.jsp" class="w3-bar-item w3-button" ><b>Logout</b></a>
	
	<a href="contactusc.jsp" class="w3-bar-item w3-button" ><b>Contattaci</b></a>
	
	</div>
	<center>
	<b class="w3-wide" style="width:250px"> <h3><b>Car - Zone</b></h3></b>
	
	<div class=" w3-large w3-text-grey" style="font-weight:bold">
	
	<a href="customerhome.jsp" class="w3-bar-item w3-button" >Home</a>
	
	<a href="categoryc.jsp" class="w3-bar-item w3-button" >Modelli</a>
	
	<a href="suv.jsp" class="w3-bar-item w3-button">SUV</a>
	<a href="berlinac.jsp" class="w3-bar-item w3-button">Berline</a>
	<a href="elettricac.jsp" class="w3-bar-item w3-button">Auto Elettriche</a>
	<a href="dilussoc.jsp" class="w3-bar-item w3-button">Auto di Lusso</a>
	
	<a href="viewproductc.jsp" class="w3-bar-item w3-button" >Tutte le auto</a>
	
	<a href="aboutusc.jsp" class="w3-bar-item w3-button" >Chi Siamo</a>
	
	</div>
	<hr>
	
	