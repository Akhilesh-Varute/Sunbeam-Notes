<%@page import="com.sunbeam.beans.LoginBean"%>
<%@page import="com.sunbeam.pojos.User"%>
<%@page import="com.sunbeam.daos.UserDaoImpl"%>
<%@page import="com.sunbeam.daos.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication</title>
</head>
<body>
	<%--
	boolean status = false;
	String email = request.getParameter("email");
	String password = request.getParameter("passwd");
	try(UserDao userDao = new UserDaoImpl()) {
		User user = userDao.findByEmail(email);
		if(user != null && user.getPassword().equals(password))
			status = true;
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	--%>
	<%--
	LoginBean lb = new LoginBean();
	lb.setEmail(request.getParameter("email"));
	lb.setPassword(request.getParameter("passwd"));
	lb.authenticate();
	--%>
	<jsp:useBean id="lb" class="com.sunbeam.beans.LoginBean"/>
	<jsp:setProperty name="lb" property="email" param="email" />
	<jsp:setProperty name="lb" property="password" param="passwd" />
	<jsp:setProperty name="lb" property="status" value="false" />
	<% lb.authenticate(); %>
	Login Status: <jsp:getProperty name="lb" property="status" /> <br/><br/>
	<%
		if(lb.getStatus()) //if(status)
			out.println("Welcome, User!");
		else
			out.println("Invalid Login!");
	%>
</body>
</html>













