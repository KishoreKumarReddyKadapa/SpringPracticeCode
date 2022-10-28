<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	/* $(document).ready(function(){
	
	 function validateFormFields(){
	 if($("#name").val() == "" || $("#name").val() == undefined){
	 $(".error.nameError").show();
	 return false;
	 }
	 if($("#crushName").val() == "" || $("#crushName").val() == undefined){
	 $(".error.crushNameError").show();
	 return false;
	 }
	 return true;
	 }
	 }); */

	function validateFormFields() {
		if ($("#name").val() == "" || $("#name").val() == undefined) {
			$(".error.nameError").show();
			return false;
		}
		if ($("#crushName").val() == "" || $("#crushName").val() == undefined) {
			$(".error.crushNameError").show();
			return false;
		}
		return true;
	}
</script>
<title>WelcomePage</title>
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
}
</style>
</head>
<body>
	<h1>Love Calculator</h1>
	<div class="card p-3">
		<form:form action="resultPage" method="get"
			modelAttribute="userInfoDto" onsubmit="true">
			<div class="d-flex pb-2">
				<label class="flex-fill">Your Name : </label>
				<form:input class="flex-fill" type="text" id="name" path="name" />
				<form:errors path="name" cssClass="errorMsg" />
				<!-- <span class="error nameError">Your Name should not be empty.</span> -->
			</div>
			<div class="d-flex">
				<label class="flex-fill">Crush Name : </label>
				<form:input class="flex-fill" type="text" id="crushName"
					path="crushName" />
				<form:errors path="crushName" cssClass="errorMsg" />
				<!-- <span class="error crushNameError">Crush Name should not be empty.</span> -->
			</div>
			<div class="d-flex">
				<form:checkbox id="agreeTc" path="agreeTc" />
				<label>I am agreeing that this is for fun.</label>
			</div>
			<input type="submit" class="btn btn-primary" value="Calculate" />
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