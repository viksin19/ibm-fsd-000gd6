<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


</head>
<body>
<br>
<br>

<table class="table table-dark table-hover">
<tr>
<th>FirstNAme</th>
<th>LAstName</th>
<th>Email</th>
</tr>

<c:forEach var="cust" items="${customer}">
<tr>
<td>${cust.firstname}</td>
<td>${cust.lastname}</td>
<td>${cust.email}</td>
</tr>
</c:forEach>

</table>
<input type="button" value="Search customer" 
onclick="window.location.href='searchform';return false;" 
class="search-button btn btn-primary"  />
</body>
</html>