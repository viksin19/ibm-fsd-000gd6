<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    <%@page isELIgnored="false" %>
<!DOCTYPE html>

<html>

<head>
	<title>Soccer league Home Page</title>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- Reference Bootstrap files -->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
	<h2>Welcome To Soccer League</h2>
	<hr>
	
	Welcome to the soccer league home page!
	<br>
	<hr>
	<div class="row">
	
	<form:form action="${pageContext.request.contextPath}/soccer" method="POST" >
	<input type="submit"  class="btn btn-info" value="Go To Soccer Page" />
	</form:form>
	</div>
	<hr>
	
	<div class="row">
	<hr>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST" >
	<input type="submit"  class="btn btn-warning" value="Logout" />
	</form:form>
	<hr>
	</div>
</div>
</body>

</html>