<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Train Booking Form</title>
<style type="text/css">
	
	button {
		padding: 10px;
	}
	.error {
		color: red;
		font-style: italic;
	}
	form {
		display: table;
	}
	form div {
		display: table-row;
	}
	label, input, span, select {
		display: table-cell;
		margin: 5px;
		text-align: left;		
	}
	input[type=text], input[type=password], select, textarea {
		width: 200px;
		margin: 5px;
	}

	form div div {
		display: table-cell;
	}	
</style>
</head>
<body>
	<div align="center">
		<h2>Train Booking</h2>
		<form:form action="booking" method="post" modelAttribute="train">
			<div>
			<form:label path="name">Full name:</form:label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
			</div>
			
			<div>
			<form:label path="email">E-mail:</form:label>
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
			</div>
			
			<div>
			<form:label path="dreg">Date of Traveling:</form:label>
			<form:input path="dreg" type="date"/>
			<form:errors path="dreg" cssClass="error" />
			</div>

			<div>
			<form:label path="fromloc">From Location:</form:label>
			<form:input path="fromloc" />
			<form:errors path="fromloc" cssClass="error" />
			</div>
			
			<div>
			<form:label path="toloc">To Location:</form:label>
			<form:input path="toloc" />
			<form:errors path="toloc" cssClass="error" />
			</div>
			
			<div>
			<form:label path="gender">Gender:</form:label>
			<form:radiobutton path="gender" value="Male"/>Male
			<form:radiobutton path="gender" value="Female"/>Female
			<form:errors path="gender" cssClass="error" />
			</div>
			
				
			
			
			<div>
				<div></div>
				<div>
				<form:button>Book</form:button>
				</div>
				<div></div>
			</div>
		</form:form>
	</div>
</body>
</html>