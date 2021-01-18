<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Student Registration</h3>
	<form:form action="studentreg" method="POST" modelAttribute="student">
		<table>
			<tr>
				<th>First Name :</th>
				<td><form:input path="fname"/></td>
			</tr>
			<tr>
				<th>Last Name :</th>
				<td><form:input path="lname"/></td>
			</tr>
			<tr>
				<th>Email :</th>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<th>Gender :</th>
				<td>
					<form:radiobuttons path="gender" items="${genders} }"/>
				</td>
			</tr>
			<tr>
				<th>Course :</th>
				<td>
					<form:select path="course">
							<form:options items="${courses}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<th>Timings :</th>
				<td>
					<form:checkboxes path="timings" items="${timings}"/>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>