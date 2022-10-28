<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
h1 {
	text-align: center;
}

.card {
	width: 500px;
	margin: 0 auto;
	box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.25);
}

.error {
	color: red;
	display: none;
}

.errorMsg {
	color: red;
	position: absolute;
	right: -291px;
}

.d-flex {
	position: relative;
	margin:10px;
}
</style>
</head>
<body>

	<h1>Registration for Love Calculator</h1>
	<div class="card p-3">
		<form:form action="registerUser" method="get"
			modelAttribute="regUser" onsubmit="true">
			<div class="d-flex pb-2">
				<label class="flex-fill">Your Name : </label>
				<form:input class="flex-fill" type="text"  path="name" />
				<form:errors path="name" cssClass="errorMsg" />
			</div>
			<div class="d-flex">
				<label class="flex-fill">User Name: </label>
				<form:input class="flex-fill" type="text" 
					path="userName" />
				<form:errors path="userName" cssClass="errorMsg" />
			</div>
			<div class="d-flex">
				<label class="flex-fill">Password: </label>
				<form:password class="flex-fill"  path="password" />
				<form:errors path="password" cssClass="errorMsg" />
			</div>
			<div class="d-flex">
				<label class="flex-fill">Email: </label>
				<form:input class="flex-fill" type="email" 
					path="email" />
				<form:errors path="email" cssClass="errorMsg" />
			</div>
			<div class="d-flex">
				<label class="flex-fill">Mobile: </label>
				<form:input class="flex-fill" type="text" 
					path="mobile" />
				<form:errors path="mobile" cssClass="errorMsg" />
			</div>
			<div class="d-flex">
				<label class="flex-fill">Age: </label>
				<form:input class="flex-fill" type="text" 
					path="age" />
				<form:errors path="age" cssClass="errorMsg" />
			</div>
			<input type="submit" class="btn btn-primary" value="Register" />
		</form:form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>