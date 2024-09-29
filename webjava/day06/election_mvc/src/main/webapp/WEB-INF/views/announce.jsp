<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<jsp:useBean id="ab" class="com.sunbeam.beans.AnnouncementBean" scope="application"/>
	<jsp:setProperty name="ab" property="*" />

	<jsp:forward page="/ctl?page=result"/>
</body>
</html>