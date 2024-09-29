<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h3>Application Level Events</h3>
	<ul>
		<li>Application Start</li>
		<li>Application Stop/End</li>
		<li>User -- Session Start</li>
		<li>User -- Session End</li>
		<li>Request Start</li>
		<li>Request End</li>
		<li>Add attribute into request/session/application</li>
		<li>Remove attribute from request/session/application</li>
	</ul>
	
	<p> In Java, listener is standard method of handling the events. They are interfaces.
	</p>
	<p>
		Define a class that implements one/more listener interfaces and register that class using 
		@WebListener or "listener" tag in web.xml.
	</p>
	
	<br/><br/>
	<a href="logout.jsp">Sign Out</a>
</body>
</html>