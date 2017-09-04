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

<!-- Bootstrap -->
<!-- =======================================================
        Theme Name: Company
        Theme URL: https://bootstrapmade.com/company-free-html-bootstrap-template/
        Author: BootstrapMade
        Author URL: https://bootstrapmade.com
    ======================================================= -->
</head>
<body>

	<div id="breadcrumb">
		<div class="container">
			<div class="breadcrumb">
				<li><a href="index.html">Home</a></li>
				<li>Portfolio</li>
			</div>
		</div>
	</div>

	<section id="portfolio">
		<div class="container">
			<div class="center">
				<p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed
					do eiusmod tempor incididunt</p>
			</div>

			<ul class="portfolio-filter text-center">
				<li><a class="btn btn-default active" href="#" data-filter="*">All</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".1">TakeOut</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".2">Ex) Cup</a></li>
				<li><a class="btn btn-default" href="#"	data-filter=".wordpress">Web Development</a></li>
			</ul>
			<!--/#portfolio-filter-->
		</div>
		<div class="container">
			<div class="">
				<div class="portfolio-items">
					<c:forEach var="product" items="${productList }">
						<div class="portfolio-item apps ${product.code } col-xs-12 col-sm-4 col-md-3">
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