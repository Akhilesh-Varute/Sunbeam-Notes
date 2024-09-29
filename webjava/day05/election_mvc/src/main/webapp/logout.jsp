<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
	<% session.invalidate(); %>
	Thank you for voting. <br/><br/>
	<a href="ctl?page=index">Login Again</a>
</body>
</html>
