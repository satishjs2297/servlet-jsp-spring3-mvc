<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" isErrorPage="false" isThreadSafe="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Root JSP</title>
</head>
<body>

Static Include/Compile Time: <%@ include file="./1.jsp" %>

<br/>
Dynamic Include/Runtime: <jsp:include page="./1.jsp" />

<br/>
<%-- Forward: <jsp:forward page="./3.jsp" /> --%>

<br>
JSP Elements:
<br>
ScriptLet: <% request.setAttribute("message", "Echo!!!!"); %> : set request Attribute!!
<br>
Expression: <%=request.getAttribute("message") %>
<br>
Expression: <%=session.getId() %>
Expression: <%="Testing !!!"+session.getId() %>
<br>
Expression Language: ${session['id']}
<br>

<h3>main content!!</h3>

</body>
</html>