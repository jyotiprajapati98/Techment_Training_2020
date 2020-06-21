<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- this is java code -->
<%
String name=request.getParameter("name");
String email=request.getParameter("email");

out.println("Your Name -->"+name+"<br>");
out.println("Your Email -->"+email);
%>
</body>
</html>