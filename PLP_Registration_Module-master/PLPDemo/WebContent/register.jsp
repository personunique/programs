<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<form:form action="register.lib" modelAttribute="bean" method="post">
<h2 align="center">User Registration Form</h2>
<table align="center" border="1" cellpadding="8" cellpadding="4" width="550px">

<tr>
</tr>
<tr>
</tr>
<tr>
<td>User Name:</td>
<td style="color:red"><form:input path="username"/>
<form:errors path="username"/>
</tr>

<tr>
<td>password:</td>
<td style="color:red"><form:input path="passwrd"/>
<form:errors path="passwrd"/>
</tr>

<tr>
<td>EmailId:</td>
<td style="color:red"><form:input path="email"/>
<form:errors path="email"/>
</tr>

<tr>
<td>Are you Librarian:</td>
<td><form:radiobutton path = "librarian" value = "Librarian" label = "YES" />
<form:radiobutton path = "librarian" value = "Student"   label = "NO" /></td>
</tr>

<tr>
<td>Recovery Question:</td>
<td><form:input path="qustn"/>
<form:errors path="qustn"/>
</tr>

<tr>
<td align="center" colspan="2"> <input type="submit" value="Submit"></td>
</tr>

</table>
</form:form>
</body>
</html>