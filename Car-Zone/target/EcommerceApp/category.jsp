<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modelli Auto - Car_Zone</title>
<link rel="stylesheet" href="images/bootstrap.css">

<link rel="stylesheet" href="Css/w3.css">
<link rel="stylesheet" href="Css/font.css">

<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>


</head>

<body>

	<%@ include file="navbar.jsp"%>
	<div style="background-color: #ebe9eb">
		<br>
		<h1>Modelli Auto</h1>
		<br>
	</div>
	<br>

	<div class="container border" style="background-color:">

		<center>
			<div class="container">
				<center>
					<div class="row">
						<%String suv = "suv";
				%>

						<div class="col-1 "">
							<center></center>
						</div>

						<div
							class="col-xxl-5 col-xl-5 col-lg-5 col-md-5 col-sm-12 col-xs-12 "">
							<center>
								<table>
									<tr><th>
										<a href="suv.jsp"><img src="images/Volkswagen-Taigo.jpg" alt="Suv" height="200px"></a>
									</th></tr><br>
									<tr style='background-color: #ebe9eb'><th style='border: 1px solid; text-align: center'>
											<a href="suv.jsp?suv=suv">SUV</a>
									</th></tr>
								</table>
							</center>
						</div>



						<div
							class="col-xxl-5 col-xl-5 col-lg-5 col-md-5 col-sm-12 col-xs-12 ">
							<center>
								<%String berline = "berline";
				%>
								<table>
									<tr><th>
										<a href="berlina.jsp"><img src="images/fiatPanda.jpg" alt="Suv" height="200px"></a>
									</th></tr>
									<br>
									<tr style='background-color: #ebe9eb'><th style='border: 1px solid; text-align: center'>
										<a href="berlina.jsp">Berline</a>
									</th></tr>
								</table>
							</center>
						</div>

						<div class="col-1 "">
							<center></center>
						</div>

						<div class="col-1 "">
							<center></center>
						</div>


						<div
							class="col-xxl-5 col-xl-5 col-lg-5 col-md-5 col-sm-12 col-xs-12 ">
							<center>
								<%String elettriche = "elettriche";
				%>
								<table>
									<tr><th>
										<a href="elettrica.jsp"><img src="images/teslaRoadster.jpg" alt="Suv" height="200px"></a>
									</th></tr><br>
									<tr style='background-color: #ebe9eb'><th style='border: 1px solid; text-align: center'>
										<a href="elettrica.jsp">Auto Elettriche</a>
									</th></tr>
								</table>	
							</center>
						</div>


						<div
							class="col-xxl-5 col-xl-5 col-lg-5 col-md-5 col-sm-12 col-xs-12 ">
							<center>
								<%String dilusso = "dilusso";
				%>
				
								<table>
									<tr><th>
										<a href="dilusso.jsp"><img src="images/ferrarif8.jpg" alt="Suv" height="200px"></a>
									</th></tr><br> 
									<tr style='background-color: #ebe9eb'><th style='border: 1px solid; text-align: center'>
										<a href="dilusso.jsp">Auto di Lusso</a>
									</th></tr>	
								</table>
							</center>
						</div>

						<div class="col-1 "">
							<center></center>
						</div>

					</div>
				</center>
			</div>
		</center>
	</div>

	</div>

	<br>
	<footer text-align: center;
  padding: 3px;
  background-color:
		DarkSalmon;
  color:white;>

		<%@ include file="footer.jsp"%>
	</footer>


</body>
</html>