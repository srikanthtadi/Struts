<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style >
.errorMessage {
color:red;
text-align: left;
}
</style>
</head>
<body>
<s:form action="action" >
<s:div>
<s:textfield key = "action.name" name = "name"/>
<s:password key="action.password" name ="password" ></s:password>
<s:textfield key = "action.age" name = "age"/>
<s:textfield key = "action.salary" name = "salary"/>
<s:textfield key="action.fname" name = "firstName"/>
<s:textfield label= "Contact No:" name = "contactNo"/>
<s:label key="action.dob"  /><s:date   name="dob"  format="dd/MM/yyyy" />
<s:radio label="Gender" name="sex" list="{'male','female'}" />
<s:submit value="submit"/>
</s:div>
</s:form>
<a href="/HelloWorld/default?request_locale=te">Telugu</a>
<a href="/HelloWorld/default?request_locale=en">English</a>
</body>
</html>