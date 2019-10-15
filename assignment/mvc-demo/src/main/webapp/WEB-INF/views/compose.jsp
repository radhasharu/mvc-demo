<%@ include file="./header.jsp"%>

<%@ include file="./dashboard-sidebar.jsp"%>



<div class="col-md-9">
	

	<form method="post">
	
		<div class="form-group row">
			<label for="to" class="col-sm-2 col-form-label">To</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="to">
			</div>
		</div>
		<div class="form-group row">
			<label for="cc" class="col-sm-2 col-form-label">Cc</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="cc">
			</div>
		</div>
		<div class="form-group row">
			<label for="subject" class="col-sm-2 col-form-label">Subject</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="subject">
			</div>
		</div>
		<div class="form-group row">
			<label for="body" class="col-sm-2 col-form-label">Body</label>
			<div class="col-sm-10 ">
				<textarea name="body" cols=80 rows=10></textarea>

			</div>
		</div>

		<div class="form-group row">
			<button type="submit" class="btn btn-primary">Send Message</button>
			&nbsp;&nbsp;&nbsp;
			<button type="reset" class="btn btn-primary">Cancel</button>

		</div>

	</form>

</div>

<%@ include file="./footer.jsp"%>