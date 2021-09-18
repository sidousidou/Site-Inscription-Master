<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Confirmation</h2>
<%System.out.println(session.getAttribute("nom")); %>
<form action="AnnulerServlet" method="Post">
<input type="submit" value="LogOut" >
</form>
</body>
</html>