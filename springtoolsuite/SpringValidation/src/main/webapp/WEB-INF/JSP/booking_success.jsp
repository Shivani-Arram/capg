<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Success</title>
<style type="text/css">
	span {
		display: inline-block;
		width: 200px;
		text-align: left;
	}
</style>
</head>
<body>
	<div align="center">
		<h2>Booking Succeeded!</h2>
		<span>Full name:</span><span>${train.name}</span><br/>
		<span>E-mail:</span><span>${train.email}</span><br/>
		<span>Date of Traveling:</span><span>${train.dreg}</span><br/>
		<span>From Location:</span><span>${train.fromloc}</span><br/>
		<span>To Location:</span><span>${train.toloc}</span><br/>
		<span>Gender:</span><span>${train.gender}</span><br/>
	</div>
</body>
</html>