<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib 
    uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert.obj">


<table align="center"  cellspacing="0" cellpadding="1">

<tr><td>StudentId</td>
<td>
<select id="sid" name="sid">
	<c:forEach items="${sessionScope.list }" var="studid">
	<option value="${studid}">${studid} </option>
	</c:forEach>
	</select>
	</td>
		</tr>

<tr><td>Subject Name</td>
<td><select id=subject name=subject>
<option value="SelectValue">--Select value--</option>
		<option value=1>1</option>
		<option value=2>2</option>
		<option value=3>3</option>
		<option value=4>4</option>
		<option value=5>5</option>
		</select>
	</td>
		</tr>

<tr>
<td>Theory/Practical Score</td>
<td><input type="text" name="theory"></td>
</tr>

<tr>
<td>MCQ's Score</td>
<td><input type="text" name="score"></td>
</tr>

<tr>
<td>Lab Assignment</td>
<td><input type="text" name="lab"></td>
</tr>
 
<th>
<input class ="btn" type="submit" value="Submit">
</th>


</body>
</html>