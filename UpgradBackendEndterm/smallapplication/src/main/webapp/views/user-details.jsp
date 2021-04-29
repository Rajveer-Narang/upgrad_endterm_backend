<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User-Details</title>
</head>
<body>
<h1>---------Registered Users Details---------</h1>


<br>
<br>

Name: ${regObj.nm} <br>
Age: ${regObj.age} <br>
Email: ${regObj.email} <br>
Address: ${regObj.address} <br>
PhoneNumber: ${regObj.ph} <br>
<button>EditUser</button>
<button>Delete User</button>
<Br>
<form action="regform">
<input type="submit" value="Add Another User">
</form>




</body>
</html>