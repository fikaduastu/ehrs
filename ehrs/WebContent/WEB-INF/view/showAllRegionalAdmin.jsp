<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style1.css" />
</head>
<body>

	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>User Name</th>
					<th>Region</th>
					<th>Email</th>
					<th>Type</th>
					<th>Password</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempAdmin" items="${admins}">
				
					<tr>
						<td> ${tempAdmin.userName} </td>
						<td> ${tempAdmin.region} </td>
						<td> ${tempAdmin.email} </td>
						<td> ${tempAdmin.type} </td>
						<td> ${tempAdmin.password} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
</body>
</html>