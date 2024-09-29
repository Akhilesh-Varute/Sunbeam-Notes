<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Election Result</title>
</head>
<body>
	Hello, ${lb.user.firstName} ${lb.user.lastName} <hr/>
	<jsp:useBean id="rb" class="com.sunbeam.beans.ResultBean"/>
	${rb.fetchResult()}
	<div style="text-align: center; width: 600px">
	<c:forEach var="c" items="${rb.candList}">
		<div style="border: 1px solid black; width: 400px">
			Candidate ID: ${c.id} <br/>
			Name: ${c.name} <br/>
			Party: ${c.party} <br/>
			Votes: ${c.votes} <br/>
			<a href="ctl?page=editcand&id=${c.id}">Edit</a>
			<a href="ctl?page=delcand&id=${c.id}">Delete</a>
		</div>
		<br/>
	</c:forEach>
	</div>			
	<br/>
	${cdb.message}
	${param.ucbMessage}
	<br/><br/>
	<a href="ctl?page=announcement">Announcement</a>
	<br/><br/>
	<a href="ctl?page=logout">Sign Out</a>
</body>
</html>







