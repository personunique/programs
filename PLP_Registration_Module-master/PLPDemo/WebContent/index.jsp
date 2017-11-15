<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="bean" method="post">
<h1 align="center">Library Registration Form</h1>

<table align="center" border="1" cellpadding="4" cellpadding="4" width="550px">
<tr>
<td align="center"><a href="start.lib">User Registration </a></td>
</tr>
<tr>
<td align="center"> <a href="librarian.lib">Librarian Login </a></td>
</tr>
<tr>
<td align="center"><a href="student.lib">Student Login </a></td>
</tr>

</table>
</form:form>
</body>
</html>