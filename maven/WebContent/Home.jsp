<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>select Category</h3>
	<form action="menu">
		<select name="categories">
			<c:forEach var="c" items="${catlist }">
				<option name="${cname }" value="${c.catid }">
					<c:out value="${c.cname }"></c:out>
				</option>
			
			</c:forEach>
		</select>
		<br/>
		<br/>
		<input type="submit" value="View" />
	
	</form>
</body>
</html>