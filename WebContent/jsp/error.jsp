<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
An error has occured
<p><h4>Exception Name: </h4><s:property value="exception" /></p>
<p><h4>What you did wrong:</h4> <s:property value="exceptionStack" /></p>
<p><h5>Also, please confirm that your Internet is working before actually
contacting us.</h5></p>
</body>
</html>