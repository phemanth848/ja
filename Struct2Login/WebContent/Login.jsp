<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>Struts 2 - Login Application</title>
</head>

<body>
<h2>Struts 2 - Login Application</h2>

<s:form action="Login" method="post" validate="true" >
    <s:textfield  label="username" name="user1.username"  size="20" />
	<s:password  label="password" name="user1.password"  size="20" />
	<s:submit value="login"></s:submit> 

</s:form>
<a href="register.jsp">click here to Register NewUser</a>
</body>
</html>