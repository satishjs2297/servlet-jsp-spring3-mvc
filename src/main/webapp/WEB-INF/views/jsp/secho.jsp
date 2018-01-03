<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring config Servlet JSP</title>
</head>
<body>	
	<jsp:include page="header.jsp" />
	<h3>Echo Basic echo page!!</h3>	
	 <c:forEach var="value" items='${numbers}'>
	 	<c:if test="${ value % 2 == 0}">
			count: ${value} <br/>
	 	</c:if>
	 </c:forEach>		 
	 <jsp:include page="footer.jsp" />
</body>
</html>