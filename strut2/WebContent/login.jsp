<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<body>
<s:form action="login" method="post">
	<s:textfield name="user.username" label="name"></s:textfield>
	<s:password name="user.password" label="password"></s:password>
	<s:textfield name="user.age" label="age"></s:textfield>
	<s:textfield name="user.bir" label="birthday"></s:textfield>
	<s:textfield name="user.tel" label="tel"></s:textfield>
	<s:submit value="submit"></s:submit>
</s:form>
</body>
</html>