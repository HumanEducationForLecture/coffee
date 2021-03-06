<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Company-HTML Bootstrap theme</title>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link href="../css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="../css/font-awesome.min.css">
	<link rel="stylesheet" href="../css/animate.css">
	<link href="../css/prettyPhoto.css" rel="stylesheet">
	<link href="../css/style.css" rel="stylesheet" />	
</head>
<body>

	<div id="breadcrumb">
		<div class="container">
			<div class="breadcrumb">
				<li><a href="index.jsp">Home</a></li>
				<li>PostView</li>
			</div>
		</div>
	</div>

	<section id="portfolio">
		<div class="container">
			<div class="center" style="font-size:25px">
				<li><a href="post.do">post</a></li>
			</div>
		</div>
		<section id="blog" class="container">
        <div class="blog">
            <div class="row">
                 <div class="col-md-8">
                    <div class="blog-item" style="color:balck">
                        <div class="row">
                         <h4>게시판</h4>
                         <c:forEach var="post" items="${postView}">
                               <table>
                               <tr><td>번호</td><td>이름</td><td>이메일</td><td>제목</a></td><td>조회수</td></tr>
                               <tr><td>${post.num }</td><td>${post.name }</td><td>${post.email}</td><td>${post.title }</td><td>${post.readcount }</td></tr>
                               <tr><td colspan=5>${post.content }</td></tr>
                               <tr><td><a href="postUpdate.do?num=${post.num }">수정</a></td><td><a href="postDelete.do?num=${post.num }">삭제</a></td></tr>
                               </table>
                            </c:forEach>
                        </div>    
                    </div><!--/.blog-item-->
                        
                   
                        
                    <ul class="pagination pagination-lg">
                        <li><a href="#"><i class="fa fa-long-arrow-left"></i>Previous Page</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">Next Page<i class="fa fa-long-arrow-right"></i></a></li>
                    </ul><!--/.pagination-->
                </div><!--/.col-md-8-->
		
	</section>
	<!--/#portfolio-item-->



	<%@ include file="../footer.jsp"%>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-2.1.1.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/jquery.isotope.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/functions.js"></script>

</body>
</html>