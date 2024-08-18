<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
        <%@ include file="insert.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Scriptlet Tag --%>
<b>
<%
out.print(new Date());
%>
</b>

<%-- Expression Tag --%>
<h1>
<%= new java.util.Date() %>
</h1>

<%-- Declaration Tag --%>
<% String name = "Mitali"; %>

 <h2>Welcome <%= name%></h2>
 
 
 
</body>
</html>
