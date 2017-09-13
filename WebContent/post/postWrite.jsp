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
                    <div class="blog-item">
                        <div class="row">
                         <h4>글 작성</h4>
                         <form method="post" enctype="multipart/form-data" name="frm">
                         <table>
                         <tr><th>이름</th><td><input type="text" name="name" size="80"></td></tr>
                         <tr><th>email</th><td><input type="text" name="email" size="80"></td></tr>
                         <tr><th>비밀번호</th><td><input type="text" name="pass" size="80"></td></tr>
                         <tr><th>제목</th><td><input type="text" name="title" size="80"></td></tr>
                         <tr><th>내용</th><td><textarea cols="80" rows="10" name="content"></textarea></td></tr>
                         </table>
                         <input type="submit" value="등록" onclick="return postCheck()">
                         <input type="reset" value="다시 작성">
                         <input type="button" value="목록" onclick="location.href='post.do'">
                         </form>
                        </div>    
                    </div><!--/.blog-item-->
                     
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