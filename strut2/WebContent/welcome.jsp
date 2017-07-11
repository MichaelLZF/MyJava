<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WelcomePage</title>
</head>
<body>
	name:<s:property value="user.username"/><br>
	password:<s:property value="user.password"/><br>
	age:<s:property value="user.age"/><br>
	date:<s:property value="user.bir"/><br>
	tel:<s:property value="user.tel"/><br>
</body>
</html>