<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info</title>
</head>
<body>
	<div>
		<%
		
		String userName = request.getParameter("name");
		out.println(userName);
		
		String userMail = request.getParameter("mail");
		out.println(userMail);
		
		%>
	</div>
</body>
</html>