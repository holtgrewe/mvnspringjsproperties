<html>
<head>
<title>Maven + Spring + JSP + Properties Demo</title>
</head>
<body>
	<h1>This is the welcome.jsp file</h1>

	<p>
		<a href="<%=request.getContextPath()%>/welcome2.html">Go to welcome2</a>
	</p>

	<h2>Variables</h2>
	<ul>
		<li>message: ${message}</li>
		<li>foo: ${globalConfig.sectionFoo} (ENV is not considered)</li>
		<li>bar: ${globalConfig.sectionBar} (ENV is considered)</li>
	</ul>
</body>
</html>