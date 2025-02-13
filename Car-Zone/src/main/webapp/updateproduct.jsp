<%@page import="java.util.List"%>
<%@page import="carzone.com.entity.Product"%>
<%@page import="carzone.com.dao.DAO"%>
<%@page import="carzone.com.conn.DBConnect"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Aggiorna Auto - Car-Zone</title>
    <link rel="stylesheet" href="images/bootstrap.css">
    <link rel="stylesheet" href="Css/w3.css">
    <link rel="stylesheet" href="Css/font.css">
    <link rel="stylesheet" href="Css/abc.css">
    <style>
        .w3-sidebar a {font-family: "Roboto", sans-serif}
        body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
        .a { margin-right: 225px; }
        .b { margin-right: 190px; }
        .e { margin-right: 205px; }
        .d { margin-right: 215px; }
        .f { margin-right: 265px; }
        .g { margin-right: 195px; }
        .j { margin-left: 17px; }
       
    </style>
</head>
<body>
    <%@ include file="admin_navbar.jsp" %>

    <div style="background-color: #ebe9eb; padding: 20px;">
        <h1 class="j">Aggiorna Auto</h1>
    </div>

    <div class="container">
        <div class="form-container">
            <h4>Aggiorna Nome Auto</h4>
            <form method="post" action="updateproductname">
                <select name="carid">
                    <% 
                        DAO dao = new DAO(DBConnect.getConn());
                        List<Product> productList = dao.getAllProducts();
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="carname">Nuovo Nome Auto:</label><br>
                <input type="text" id="carname" name="carname" required>
                <br><br>
                <input type="submit" value="Aggiorna Nome">
            </form>
        </div>

        <div class="form-container">
            <h4>Aggiorna Descrizione</h4>
            <form method="post" action="updateproductdescription">
                <select name="carid">
                    <% 
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="description">Nuova Descrizione:</label><br>
                <textarea id="description" name="description" rows="4" cols="50" required></textarea>
                <br><br>
                <input type="submit" value="Aggiorna Descrizione">
            </form>
        </div>

        <div class="form-container">
            <h4>Aggiorna Prezzo</h4>
            <form method="post" action="updateproductprice">
                <select name="carid">
                    <% 
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="carprice">Nuovo Prezzo:</label><br>
                <input type="number" id="carprice" name="carprice" required>
                <br><br>
                <input type="submit" value="Aggiorna Prezzo">
            </form>
        </div>

        <div class="form-container">
            <h4>Aggiorna Quantità</h4>
            <form method="post" action="updateproductquantity">
                <select name="carid">
                    <% 
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="carquantity">Nuova Quantità:</label><br>
                <input type="number" id="carquantity" name="carquantity" required>
                <br><br>
                <input type="submit" value="Aggiorna Quantità">
            </form>
        </div>

        <div class="form-container">
            <h4>Aggiorna URL Immagine</h4>
            <form method="post" action="updateproductimage">
                <select name="carid">
                    <% 
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="pimage">Nuovo URL Immagine:</label><br>
                <input type="text" id="carimage" name="carimage" required>
                <br><br>
                <input type="submit" value="Aggiorna URL Immagine">
            </form>
        </div>

        <div class="form-container">
            <h4>Aggiorna Marca</h4>
            <form method="post" action="updateproductbrandid">
                <select name="carid">
                    <% 
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="bid">Nuova Marca:</label><br>
                <input type="number" id="bid" name="bid" required>
                <br><br>
                <input type="submit" value="Aggiorna ID Marca">
            </form>
        </div>

        <div class="form-container">
            <h4>Aggiorna Modello</h4>
            <form method="post" action="updateproductcategoryid">
                <select name="carid">
                    <% 
                        for (Product product : productList) {
                    %>
                    <option value="<%= product.getCarid() %>"><%= product.getCarid() %> - <%= product.getCarname() %></option>
                    <% } %>
                </select>
                <br><br>
                <label for="cid">Nuovo Modello:</label><br>
                <input type="number" id="cid" name="cid" required>
                <br><br>
                <input type="submit" value="Aggiorna ID Modello">
                
                
            </form>
        </div>
    </div>

    <footer>
        <%@ include file="footer.jsp" %>
    </footer>
</body>
</html>