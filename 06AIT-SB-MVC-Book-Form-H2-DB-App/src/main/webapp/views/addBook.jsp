
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addBook</title>
</head>
<body>
	<h3>Add Book Here</h3>
	<font color="green">${succMsg}</font>
	<font color="red">${failMsg}</font>
	<form:form action="savebook" method="POST" modelAttribute="book">
		<table>
			<tr>
				<th>Book Name :</th>
				<td><form:input path="bookName" /> </td>
			</tr>
			<tr>
				<th>Book Price :</th>
				<td><form:input path="bookPrice" /> </td>
			</tr>
			<tr>
				<th>Author Name :</th>
				<td><form:input path="authorName" /> </td>
			</tr>
			<tr>
				<th><input type="submit" value="Save Book"/> </th>
			</tr>
		</table>
	</form:form>	
		<a href="viewBooks">View All Books</a>
</body>
</html>