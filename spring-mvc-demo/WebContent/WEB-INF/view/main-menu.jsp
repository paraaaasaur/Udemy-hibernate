<!DOCTYPE html>
<html>

<head>

	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/assets/css/my-test.css">

	<script
		src="${pageContext.request.contextPath}/resources/assets/js/simple-test.js"></script>

</head>

<body>

	<h2>Spring MVC Demo - Home Page</h2>

	<a href="hello/showForm">Plain Hello World</a>

	<br>
	<br>

	<img
		src="${pageContext.request.contextPath}/resources/assets/images/spring-logo.png" />

	<br>
	<br>

	<input type="button" onclick="doSomeWork()" value="Click Me" />

</body>

</html>