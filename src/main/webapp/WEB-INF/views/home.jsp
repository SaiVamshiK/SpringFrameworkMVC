<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1 align="center"><%= request.getAttribute("title") %></h1>
	<hr>
	<div align="center">
		<form action="order">
			<label for="input1">Enter Order Item:</label>
			<input type="text" name="order" placeholder="Enter Order Name" id="input1">
			<br>
			<br>
			<input type="submit" value="Order!">
		</form>
	</div>
</body>
</html>