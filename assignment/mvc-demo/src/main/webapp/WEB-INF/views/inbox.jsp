<%@ include file="./header.jsp"%>

<%@ include file="./dashboard-sidebar.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="col-md-9">


	<table class="table table-bordered table-striped table-hover">
		<tr>
			<th>From</th>
			<th>Subject</th>
			<th>Sent At</th>
		</tr>
		<c:forEach items="${msg}" var="m">
		
		<tr>
		<td>${m.msgFrom}</td>
		<td> <a href="./messageDetails?id=${m.id}">${m.subject}</a></td>
		<td>${m.sendAt}</td>
		</tr>



		</c:forEach>

	</table>

</div>

<%@ include file="./footer.jsp"%>
