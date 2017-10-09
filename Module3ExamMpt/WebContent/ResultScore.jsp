<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList, com.cg.bean.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int id = Integer.parseInt(session.getAttribute("id").toString());
String subject = session.getAttribute("subject").toString();
int total = Integer.parseInt(session.getAttribute("total").toString());
String grade = session.getAttribute("grade").toString();
%>
<table>
<tr>
<td>Student id:</td><td><%=id %></td>
</tr>
<tr>
<td>Subject name:</td><td><%=subject %></td>
</tr>
<tr>
<td>Total:</td><td><%=total %></td>
</tr>
<tr>
<td>Grade:</td><td><%=grade %></td>
</tr>
</table>
</body>
</html>