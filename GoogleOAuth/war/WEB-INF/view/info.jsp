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
		out.println("<p> UserName:");
		out.println(userName);
		out.println("</p>");
		
		String userMail = request.getParameter("mail");
		String gender = request.getParameter("gender");
		String image=request.getParameter("image");
		out.println("<p> Gender:");
		out.println(gender);
		out.println("</p>");
		out.println("<p> Profile Pic:");
		out.println("<img src="+image+">");
		out.println("</p>");
		String userMailCopy = userMail;
		char[] tempVariable = userMailCopy.toCharArray();
		char[] userMailCharArray = new char[tempVariable.length - 2];
		for (int i = 0; i <= userMailCharArray.length - 2; i++) {
			userMailCharArray[i] = tempVariable[i];
		}
		char[] userMailCharArray1 = new char[userMailCharArray.length - 1];
		for (int i = 0; i < userMailCharArray.length - 2; i++) {
			userMailCharArray1[i] = userMailCharArray[i];
		}
		out.println("<p> UserMail:");
		out.println(userMailCharArray1);
		out.println("</p>");
		%>
	</div>
</body>
</html>