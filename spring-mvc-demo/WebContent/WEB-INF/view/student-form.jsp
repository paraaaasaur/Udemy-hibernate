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
		Country: 
		<form:select path="country">
			
<%-- 			<form:option value="Brazil" label="Brazill" /> --%>
<%-- 			<form:option value="France" label="Francee" /> --%>
<%-- 			<form:option value="Germany" label="Germanyy" /> --%>
<%-- 			<form:option value="India" label="Indiaa" /> --%>
			<form:options items="${student.countryOptions}"/>
		</form:select>
		
		<input type="submit" value="SubmitBtn">
	
	</form:form>

</body>

</html>