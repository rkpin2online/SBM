<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Books</title>
</head>
<body>
	<h3>Welcome to View Books Page</h3>
	<a href="/">+Add New Book</a>
	<table border="1">
		<thead>
			<tr>
				<th>Book ID</th>
				<th>Book Name</th>
				<th>Book Price</th>
				<th>Author Name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="b">
				<tr>
					<td>${b.bookId}</td>
					<td>${b.bookName}</td>
					<td>${b.bookPrice}</td>
					<td>${b.authorName}</td>
					<td>
						<a href="editBook?bid=${b.bookId}">Edit</a>
						<a href="deleteBook?bid=${b.bookId}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<font color="red">${succMsg}</font>
</body>
</html>