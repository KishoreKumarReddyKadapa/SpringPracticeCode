<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<style>
	span{
		color:blue;
		font-weight:bold;
	}
	.card{
		width:500px;
		position:absolute;
		top:50%;
		left:50%;
		transform:translate(-50%,-50%);
	}
</style>
</head>
<body>

<div class="card">
    <div class="card-header">Love Calculator Prediction :: Result</div>
    <div class="card-body">
    	<div class="d-flex justify-content-start">
    		 <label class="flex-fill"> Your Name : </label>
	 		 <span>${userInfoDto.name}</span>
    	</div>
    	<div class="d-flex justify-content-start">
    		 <label class="flex-fill"> Crush Name : </label>
	 		 <span>${userInfoDto.crushName}</span>
    	</div>
    </div> 
    <div class="card-footer">
    	<button class="btn btn-dark" id="back">Back</button>
    </div>
  </div>
 <script>
 	$(document).ready(function(){
 		var contextPath = "<%=request.getContextPath()%>";
 			$(document).on('click','#back',function(){
 				window.location =contextPath;
 			});
 		
 		
 		
 	});
 </script>
</body>
</html>