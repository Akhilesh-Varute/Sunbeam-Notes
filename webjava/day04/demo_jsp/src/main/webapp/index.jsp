<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<ul>
		<li><a href="demo1.jsp">Hello JSP</a></li>
		<li><a href="demo2.jsp">include Directive</a></li>
		<li><a href="demo3.jsp">jsp:include action</a></li>
		<li><a href="demo4.jsp">jsp:forward action</a></li>
		<li>
			<a href="demo5.jsp">taglib Directive and c:redirect JSTL</a>
			<ol>
				<li>Download JSTL Jar from https://mvnrepository.com/artifact/javax.servlet/jstl/1.2</li>
				<li>Add it into your WEB-INF/lib (if not already present in Tomcat/lib)</li>
				<li>In demo5.jsp, use %@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" </li>
				<li>In demo5.jsp, use desired JSTL tags e.g. c:redirect</li>
			</ol>
		</li>
		<li><a href="demo6.jsp">Error Page</a></li>
		<li><a href="nopage.jsp">Error Page (404)</a></li>
		<li><a href="demo7.jsp">Java Beans</a></li>
	</ul>
</body>
</html>