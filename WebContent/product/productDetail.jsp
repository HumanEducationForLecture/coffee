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
				<li>Product Detail</li>
			</div>
		</div>
	</div>

	<section id="portfolio">
		<div class="container">
			<div class="center" style="font-size:25px">
				<li><a href="order.do">Order</a></li>
			</div>
		</div>
		<div class="container">
			<div class="">
				<div class="portfolio-items">
					<c:forEach var="product" items="${productDetail }">
						<div class="portfolio-item apps col-xs-120 col-sm-40 col-md-3">
							<div class="recent-work-wrap">
								<a href="#"><img class="img-responsive" src="images/product/${product.image }"
									alt=""></a>
								<div class="overlay">
									<div class="recent-work-inner">
										<h3>
											<a href="#">${product.name }</a>
										</h3>
										<p>가격:${product.price } / 상세내용 ${product.content }</p>
										<a class="preview" href="images/product/${product.image }"
											rel="prettyPhoto"><i class="fa fa-eye"></i> View</a>
									</div>
								</div>
							</div>
						</div>
						<!--/.portfolio-item-->
					</c:forEach>
				</div>
			</div>
		</div>
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