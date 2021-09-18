<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%if(session.getAttribute("mat")==null){
    	response.sendRedirect("logout.jsp");
    }else{System.out.println("bienvenue "+session.getAttribute("mat"));} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<h1>profil condidat</h1>
<form action="AnnulerServlet" method="Post">
<input type="submit" value="LogOut" >
</form>
</body>
</html>