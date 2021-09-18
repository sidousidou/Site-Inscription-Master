<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">

<p>Au revoir ${nom} ${prenom} </p>
<%
HttpSession session1 = request.getSession();
session1.invalidate();
%>
<li>
                  <a href="espace_candidat.html"> Retour a Index</a>
</li>  
</body>
</html>