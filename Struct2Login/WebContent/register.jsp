<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 - Login Application</title>
</head>
<body>
<h2>Struts 2 Registration Application</h2>
<s:actionerror/>
<s:form action="register.action"  method="post" validate="true">
	<s:textfield name="reg1.fname" label="FirstName" size="25"/>
	<s:textfield name="reg1.lname" label="LastName" size="25"/>
	<s:textfield name="reg1.email" label="Email" size="25"/>
	<s:textfield name="reg1.age" label="Age" size="25"/>
	<s:submit value="submit"></s:submit> 
</s:form>
</body>
</html>