<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header Footer Demo</title>
</head>
<body>
	<table border="1" width="100%">
		<tr>
			<td align="center">
				<%@ include file="header.jsp" %>
			</td>
		</tr>
		<tr height="300px">
			<td>
				Main Page contents ... <br/><br/>
				%@ include directive demo
			</td>
		</tr>
		<tr>
			<td align="center">
				<%@ include file="footer.jsp" %>
			</td>
		</tr>
	</table>
</body>
</html>