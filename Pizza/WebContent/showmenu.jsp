<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza Menu</title>
</head>
<body>
<jsp:useBean id="b" class="model.Menu"></jsp:useBean>
<h1>Pizza list </h1>

 <t:forEach var="pizza" items="${menu}">
  ${pizza.getPname()}<br/>
 </t:forEach>

</body>
</html>