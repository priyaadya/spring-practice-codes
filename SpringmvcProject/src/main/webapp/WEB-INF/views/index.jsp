<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow" text-align="center">
<h1>Hello Dinga and dingis</h1>
<h2>Welcome to springmvc clsss</h2>
<%
	int x=10;
String a="ABCD";
List<String> b=new ArrayList<String>();
b.add("java");
b.add("sql");
b.add("python");
b.add("spring");

%>
<h1>The value of x is<%=x %></h1>
<h1>Char at second position is:<%=a.charAt(1) %></h1>
<h1>The values of ArrayList are:<%=b %></h1>

<%
for(String c:b)
{
%>
	<h1>The String values of arrayList are:---<%=c%></h1>
<%
}

%>

</body>
</html>