<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
		.card{
			width:400px;
			height:300px;
			border-radius:10px;
			box-shadow:2px 2px 10px rgba(0,0,0,0.25);
			margin:0 auto;
			position:relative;
		}
		form {
		    position: absolute;
		    top: 50%;
		    left: 50%;
		    transform: translate(-50%,-50%);
		    width: 100%;
		    text-align: center;
		}
		select{
			width:100px;
			margin-top:12px;
		}
	</style>
</head>
<body>
	<h1>Gift Shop</h1> <hr/>
	<div class="card">
		<form action="/SpringMVCIntro/lakshmiHouse/gitStatus">
			<input  type="text" name="giftName" placeholder="Enter your Gift Name here..." />
			<br>
			<select name="toWhom">
				<option value="-1">--Select--</option>
				<option value="Mother">Mother</option>
				<option value="Dad">Dad</option>
				<option value="Sister">Sister</option>
				<option value="Brother">Brother</option>
			</select>
			<br> <br>
			<div>
				<label>Price : </label>
				<input type="number" name="price"/>
			</div>
			<input  type="submit" value="Send Gift"/>
		</form>
	</div>
	

</body>
</html>