<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center" >Thanks for Registration </h2>
<table align="center" cellpadding="5">
<tr>
<td></td>
</tr>
<tr>
<td>Your Details are as follows:</td>
</tr>
<tr>
<td>User ID:${k.userId}</td>
</tr>
<tr>
<td>User Name:${k.username}</td>
</tr>
<tr>
<td>You are:${k.librarian}</td>
</tr>
</table>
<a href="index.lib">Go Back</a>
</body>
</html>