<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示用户列表</title>
</head>
<body>
	
	
	<table border="1">
		<thead>
			<td>用户ID</td>
			<td>用户名</td>
		</thead>
		<tbody>
	<c:forEach  items="${result}" var="item">
			<tr>
				<td><c:out value="${item.id}"></c:out></td>
				<td><c:out value="${item.name}"></c:out></td>
			</tr>
			
     </c:forEach>
		</tbody>
	</table>
           
</body>
</html>