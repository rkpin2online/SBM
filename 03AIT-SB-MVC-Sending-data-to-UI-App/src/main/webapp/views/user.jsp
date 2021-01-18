<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>User Id :</th>
			<td>${user.userId}</td>
		</tr>
		<tr>
			<th>User Name :</th>
			<td>${user.userName}</td>
		</tr>
		<tr>
			<th>User Email :</th>
			<td>${user.userEmail}</td>
		</tr>
		<tr>
			<th>User Gender :</th>
			<td>${user.userGender}</td>
		</tr>
		<tr>
			<th>User DOB :</th>
			<td>${user.userDob}</td>
		</tr>
	</table>
</body>
</html>