
<%
	session.invalidate();
%>
<jsp:forward page="/" />
<%
	System.out.println("logout");
%>
