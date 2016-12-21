<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<title>Maven + Spring + JSP + Properties Demo</title>
</head>
<body>
	<h1>This is the welcome.jsp file</h1>

	<p>
		<a href="<%=request.getContextPath()%>/welcome1.html">Go to welcome1</a>
	</p>

	<h2>Variables</h2>
	<ul>
		<li>message: ${message}</li>
		<li>foo: <spring:eval expression="@environment.getProperty('section.foo')" /> (ENV is not considered)</li>
		<li>bar: <spring:eval expression="@environment.getProperty('section.bar')" /> (ENV is not considered)</li>
	</ul>
</body>
</html>