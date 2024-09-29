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
				<jsp:include page="header.jsp"></jsp:include>
			</td>
		</tr>
		<tr height="300px">
			<td>
				Main Page contents ... <br/><br/>
				include action demo
			</td>
		</tr>
		<tr>
			<td align="center">
				<jsp:include page="footer.jsp"/>
			</td>
		</tr>
	</table>
</body>
</html>