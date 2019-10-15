<%@ include file="./header.jsp"%>

<%@ include file="./dashboard-sidebar.jsp"%>



<div class="col-md-9">
	

	<form>
	
		<div class="form-group row">
			<label for="from" class="col-sm-2 col-form-label">from</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="from" value="${message.msgFrom}" readonly>
			</div>
		</div>
		<div class="form-group row">
			<label for="cc" class="col-sm-2 col-form-label">To</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="to" value="${message.msgTo},${message.cc}" readonly>
			</div>
		</div>
		<div class="form-group row">
			<label for="subject" class="col-sm-2 col-form-label">Subject</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="subject" value="${message.subject}" readonly>
			</div>
		</div>
		<div class="form-group row">
			<label for="body" class="col-sm-2 col-form-label">Body</label>
			<div class="col-sm-10 ">
				<textarea name="body" cols=80 rows=10 readonly>${message.body}</textarea>

			</div>
		</div>

		

	</form>

</div>

<%@ include file="./footer.jsp"%>