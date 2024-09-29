<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forwarded Page</title>
</head>
<body>
	Your request is forwarded to this page. <br/><br/>
	Request Param: 
	<%= request.getParameter("course") %>
</body>
</html>