
<html>
<head>

</head>
<body>
	<h4>${msg}</h4>
	<pre>
	<form action="log" method="post">
	
	<%
			String s = (String) request.getAttribute("msg");

			if (s != null) {
				out.print(s);
			} else {

			}
		%>
	UserName<input type="text" name="uname">
	
	Password<input type="password" name="pass">

		<input type="submit" value="Login">   
		
		<a href="register.jsp">Register</a>
	
	</form>
</pre>
</body>
</html>