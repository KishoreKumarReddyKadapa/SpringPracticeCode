<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Gift Order Status Details</h1> <hr>
	
	<div>
		<label>Recepient Type: </label>
		<span style="color:blue;">${toWhom}</span>
	</div>
	<div>
		<label>Gift Name : </label>
		<span style="color:blue;">${giftName}</span>
	</div>
	<div>
		<label>Gift Price: </label>
		<span style="color:red;">${giftPrice}</span>
	</div>
	<div>
		<label>Gift Sent Date : </label>
		<span style="color:blue;">${giftSentDate}</span>
	</div>
	
</body>
</html>