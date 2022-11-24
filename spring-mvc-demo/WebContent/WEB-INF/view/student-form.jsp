<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		FirstName: <form:input path="firstName"/>
		<br><br>
		LastName: <form:input path="lastName"/>
		<br><br>
		<input type="submit" value="SubmitBtn">
	
	</form:form>

</body>

</html>