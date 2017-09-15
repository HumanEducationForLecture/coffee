<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource
		var="snapshot"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false"
		user="root"
		password="1111"
	/>
	<sql:query sql="select * from basket" var="result" dataSource="${snapshot }"/>
	
	<form action="test" method="post">
	<table border="1" width="100%">
	<tr>
	<th>선택</th>
	<th>ID</th>
	<th>제품</th>
	<th>수량</th>
	<th>등록일</th>
	</tr>
	
	<c:forEach var="row" items="${result.rows}">
	<tr>
	<td><input type="checkbox" value="${row.b_amount }" name="check">
	<td><c:out value="${row.u_id }"/></td>
	<td><c:out value="${row.p_code }"/></td>
	<td><c:out value="${row.b_amount }"/></td>
	<td><c:out value="${row.b_date }"/></td>
	</tr>
	</c:forEach>
	</table>
	<input type="submit" value="구매확인">
	</form>
</body>
</html>