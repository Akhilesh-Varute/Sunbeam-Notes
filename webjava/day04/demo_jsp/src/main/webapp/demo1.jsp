<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo 01</title>
</head>
<body>
	<!-- This is HTML comment (Client side) -->
	<%-- This is JSP comment (Server side) --%>
	<h2>First JSP Page</h2>
	<%!
	// fields
	private int count = 0;
	// methods
	public void jspInit() {
		System.out.println("demo1.jsp -- jspInit() called.");
	}	
	public void jspDestroy() {
		System.out.println("demo1.jsp -- jspDestroy() called.");
	}
	%>
	<%
	System.out.println("demo1.jsp -- jspService() called.");
	out.println("Server time: " + new Date().toString());
	%>
	<br/><br/>
	<% count++; %>
	Count: <%= count %> <br/>
	<% if(count % 2 == 0) {  %>
		<h4>Even Count</h4>
	<% } else { %>
		<h4>Odd Count</h4>
	<% } %>
</body>
</html>
