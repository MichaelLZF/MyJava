<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date bir = new Date(107,3,6,16,54,00);
	request.setAttribute("bir",bir);
%>
<s:date name="#request.bir" format="yyyy-MM-dd" nice="false" /><br>
<s:date name="#request.bir" format="yyyy-MM-dd" nice="true" /><br>
<s:form action="select">
	<s:set name="ds" value="#{'jiangsu':{'nanjing','wuxi'},'anhui':{'hefei','wuhu'}}"></s:set>
	<s:doubleselect list="#ds.keySet()" doubleName="dn" doubleList="#ds[top]"
		name="n" label="please choose" labelposition="top">
	</s:doubleselect>
</s:form>
</body>
</html>