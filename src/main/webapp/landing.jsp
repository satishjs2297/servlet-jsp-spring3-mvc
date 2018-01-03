<%@ page language="java" isThreadSafe="true" import="java.util.ArrayList, java.util.UUID"  %>
<html>
<body>
<h2>Hello World!</h2>
<a href="<%=request.getContextPath() %>/echoGeneric.do">Click Here</a>

<%!
	int status = 1; 
	public void jspInit() {
		System.out.println("jspInit");	
	}
%> <!-- Declaration -->

<% int count = 10; %> <!-- scriplet -->
<%=count %> <!-- expression -->



<br/>
<br/>
<h3>Directives examples: Refer index_jsp.java</h3>
<%-- <%! String uuid; %>
<%!
  public String getUUID() {
	return UUID.randomUUID().toString();
}%> <!-- Declaratives -->

<%! public void jspInit() {
	System.out.println("jspInit invoked testing!!!");
} %>

<%! public void jspDestroy() {
	System.out.println("jspDestroy invoked testing!!!");
} %>

UUID:: <%=getUUID() %> <!-- Expression -->

<%  uuid = getUUID(); %> <!-- Script let -->
<br/>
Next UUID: <%=uuid %>  <!-- Expression --> --%>
<h4>Testing jsp landing page</h4>

</body>
</html>
