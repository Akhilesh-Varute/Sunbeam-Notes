<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	Some error occured. Please contact your vendor. <br/><br/>
	Error: <%= exception.getClass().getName() %> <br/>
	Message: <%= exception.getMessage() %>
	<br/><br/>
	Nilesh Ghule - nilesh@sunbeaminfo.com
</body>
</html>