<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<form action="searchcustomer" modelAttribute="customer" method="GET">
FirstName <input type="radio" name="searchby" value="firstname" />
 LastNAme <input type="radio" name="searchby" value="lastname" />
 Email <input type="radio" name="searchby" value="email" /><br>
  Key <input type="text" name="searchkey" />
   <input type="submit" value="Search" class="search" />
</form>
</body>
</html>