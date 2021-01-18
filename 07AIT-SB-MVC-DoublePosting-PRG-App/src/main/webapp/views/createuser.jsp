<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h3>User Registration Form</h3>
	<form:form action="save" method="POST" modelAttribute="userModel" >
		<table>
			<tr>
				<th>User Name</th>
				<td><form:input path="uname" /></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<th>Phone Number</th>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<th><input type="reset" value="reset" /></th>
				<th><input type="submit" value="Submit"/></th>
			</tr>
		</table>
	<font color="green">${msg}</font>
	</form:form>
</body>
</html>