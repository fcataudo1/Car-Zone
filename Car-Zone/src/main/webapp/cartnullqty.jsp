<%@page import="carzone.com.entity.cart"%>
<%@page import="java.util.List"%>
<%@page import="carzone.com.conn.DBConnect"%>
<%@page import="carzone.com.dao.DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrello - Car-Zone</title>
</head>
<body>
<%
int tqty= 0;
DAO2 daocnqty = new DAO2(DBConnect.getConn());
List<cart> listq = daocnqty.getSelectedcart();
for(cart v : listq)
{
	
	tqty = tqty + v.getCarquantity();
} %>
</body>
</html>