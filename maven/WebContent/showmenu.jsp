<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza Menu</title>
</head>
<body>
<jsp:useBean id="b" class="model.Menu" scope="session"></jsp:useBean>
<h1>Pizza list </h1>


 


 <c:forEach var="menu" items="${menus}" >
<%--   ${pizza.getPname()}<br/> --%>
  ${menu.getPname()}<br/>
 </c:forEach>

</body>
</html>