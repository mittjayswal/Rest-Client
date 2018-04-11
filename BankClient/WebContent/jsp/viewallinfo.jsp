<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class=container>
		<div class="row col-md-4" align="center">
			<form action="/BankApplication/edit">
				<table class="table table-striped" border=1
					style="position: absolute; left: 10%; top: 10%">
					<tr>
						<th>First Name</th>
						<th>Middle Name</th>
						<th>Last Name</th>
						<th>Gender</th>
						<th>Address</th>
						<th>City</th>
						<th>State</th>
						<th>Country</th>
						<th>Bank Name</th>
						<th>Phone</th>
						<th>Account</th>
						<th>SSN</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<c:forEach items="${listbvo}" var="listbvo">
					<tr>
						<td><c:out value="${listbvo.firstName }" /></td>
						<td><c:out value="${listbvo.middleName}" /></td>
						<td><c:out value="${listbvo.lastName}" /></td>
						<td><c:out value="${listbvo.gender}" /></td>
						<td><c:out value="${listbvo.address}" /></td>
						<td><c:out value="${listbvo.city}" /></td>
						<td><c:out value="${listbvo.state}" /></td>
						<td><c:out value="${listbvo.country}" /></td>
						<td><c:out value="${listbvo.phone}" /></td>
						<td><c:out value="${listbvo.bankName}" /></td>
						<td><c:out value="${listbvo.accountNumber}" /></td>
						<td><c:out value="${listbvo.ssn}" /></td>
						<td><button  class="btn btn-success" id="edit" name="btnedit"
								value="${listbvo}">Edit</button></td>
						<td><button class="btn btn-success"  id="delete" name="btndelete"
								value="${listbvo.firstName}">Delete</button></td>
					</tr>
					</c:forEach>					

				</table>
				
			</form>
		</div>
	</div>

</body>
</html>