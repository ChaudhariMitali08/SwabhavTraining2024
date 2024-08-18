<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Example</title>
</head>
<body>
	<c:out value="mitali" />

	<c:set var="name" value="chaudhari" scope="session" />

	<c:out value="${name}" />

	<c:set var="number" value="2" />

	<c:if test="${number % 2 == 0}">
		<h1>Even</h1>
	</c:if>


	<!--  	<c:choose>
		<c:when test="${number % 2 == 0}">
			<p>The number is even.</p>
		</c:when>
		<c:otherwise>
			<p>The number is odd.</p>
		</c:otherwise>
	</c:choose> -->

	<!-- <c:forEach var="item" items="${itemsList}">
		<p>${item}</p>
	</c:forEach> -->
</body>
</html>
