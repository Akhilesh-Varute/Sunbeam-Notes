<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP EL</title>
</head>
<body>
	<jsp:useBean id="now" class="java.util.Date" scope="page"/>
	<c:set var="firstName" value="Nilesh" scope="request"/>
	<c:set var="lastName" value="Ghule" scope="session"/>
	<div>
		<h3>Access Object from Different Scopes</h3>
		Page Scope: ${pageScope.now} <br/>
		Request Scope: ${requestScope.firstName} <br/>
		Session Scope: ${sessionScope.lastName} <br/><br/>
		${firstName} ${lastName} teaching on ${now} for course ${course}.
	</div>	
	<div>
		<h3>Access Fields - via Getters</h3>
		Date: ${now.date}-${now.month+1}-${1900+now.year} <br/>
	</div>
	<div>
		<h3>Access Methods</h3>
		DateTime: ${now.toString()} <br/>
		Full Name: ${firstName.concat(lastName)}
	</div>
	<div>
		<h3>Calculations</h3>
		Result: 4 + 22 div 7 - 23 mod 5 = ${4 + 22 div 7 - 23 mod 5} <br/>
		Result: 4 + 22 / 7 - 23 % 5 = ${4 + 22 / 7 - 23 % 5} 
	</div>
	<div>
		<h3>JSP Implicit Objects</h3>
		Context Param: ${initParam.appTitle} <br/>
		Request Param: ${param.wish} <br/>
		Cookie: ${cookie.userName} <br/>
		Request Header: ${header.Accept} <br/>
	</div>
</body>
</html>






