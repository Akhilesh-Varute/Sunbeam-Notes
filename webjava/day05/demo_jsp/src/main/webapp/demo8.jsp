<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context</title>
</head>
<body>
	<p>
		JspContext object is created for each JSP execution 
		and it holds all objects required for execution of the JSP 
		like request, response, session, config, application, out, etc. 
	</p>
	<p>
		JspContext is inherited from PageContext. It can also be used to store 
		page level attributes. These page attributes are valid only for current request
		to current page.
	</p>
	<% pageContext.setAttribute("now", new Date());  %>
	
	<% Date date = (Date)pageContext.getAttribute("now"); %>
	
	Server Time: <%= date %>
</body>
</html>
