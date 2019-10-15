<%@ include file="./header.jsp"%>

<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<style>
label,h3 {
	font-weight: bold;
}
</style>


</head>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4 col-sm-12 text-center">

		<h3>New Users, Register here</h3>
		<hr />

		<form method="post">
			<div class="form-group row">
				<label for="name">Name</label>
				 <input type="text" class="form-control" name="name" required>
			</div>
			<div class="form-group row">
				
				<label><input type="radio"  name="gender" value="Male" required>Male</label> &nbsp;
				<label><input type="radio"  name="gender" value="Female" required>Female</label>
			</div>
			<div class="form-group row">
				<label for="email">Email address</label> 
				<input type="text"	class="form-control" name="email" required>
			</div>
			<div class="form-group row">
				<label for="phone">Mobile number</label>
				 <input type="text" class="form-control" name="phone" required>
			</div>
			<div class="form-group row">
				<label for="password">Password</label>
				 <input type="password" class="form-control" name="password" required>
			</div>
			<div class="form-group row">
				<label for="cpassword">Confirm password</label> 
				<input type="password" class="form-control" name="cpassword" required>
			</div>

			<div class="form-group row">
			<button type="submit" class="btn btn-primary">Register</button>
			&nbsp; &nbsp;  &nbsp;
			<a href="./login"  > Existing Users, Login here</a>
			</div>
		</form>


	</div>
	<div class="col-md-4"></div>
</div>

<%@ include file="./footer.jsp"%>