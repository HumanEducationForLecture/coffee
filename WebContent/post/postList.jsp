<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div id="wrap" align="center">
<h1>�Խñ�</h1>
<table class=list">
<tr>
<td colspan="5" style="border:white; text-align: right">
<a href="CoffeeServlet?command=post_white_form">�Խñ� ���</a>
</td>
</tr>
<tr><th>��ȣ</th><th>����</th><th>�ۼ���</th><th>��ȸ</th></tr>
<c:forEach var="post" items="${postList }">
<tr class="record">
<td>${post.num }</td>
<td><a href="CoffeeServlet?command=post_view&num=${post.num}">${post.title }</a>
</td>
<td>${post.name} </td>
<td>${post.readcount }</td>
</tr>
</c:forEach>
</table>
</div>
	<%@include file="../footer.jsp" %>
</body>
</html>