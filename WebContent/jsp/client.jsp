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
<s:text name="action.name"/> <s:property value = "name" />
<s:text name="action.age"/> <s:property value = "age" />
<s:text name="action.salary"/> <s:property value = "salary" />
<s:text name="action.dob"/> <s:property value="dob" />
Gender: <s:property value="sex"/>
First Name:<s:property value="firstName"/>
Contact No: <s:property value="contactNo"/>
</body>
</html>