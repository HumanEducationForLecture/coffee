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

</head>
<body>

	<div id="breadcrumb">
		<div class="container">
			<div class="breadcrumb">
				<li><a href="index.jsp">Home</a></li>
				<li>Order</li>
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
				<li><a class="btn btn-default" href="#" data-filter=".2">Ex) Drip</a></li>
			</ul>
			<ul class="portfolio-filter text-center">
				<li><a class="btn btn-default" href="#" data-filter=".straw">Straw</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".ice">Ice</a></li>
				<li><a class="btn btn-default" href="#"	data-filter=".cupHolder">CupHolder</a></li>
				<li><a class="btn btn-default" href="#"	data-filter=".cupCarrier">CupCarrier</a></li>
				<li><a class="btn btn-default" href="#"	data-filter=".hot">Hot</a></li>
				<li><a class="btn btn-default" href="#"	data-filter=".dripper">Dripper</a></li>
			</ul>
			<!--/#portfolio-filter-->
		</div>
		<div class="container">
			<div class="">
				<div class="portfolio-items">
					<c:forEach var="product" items="${productList }">
						<div class="portfolio-item apps ${product.code } ${product.kind } col-xs-12 col-sm-4 col-md-3">
							<div class="recent-work-wrap">
								<a href="productDetail.do?name=${product.name }"><img class="img-responsive" src="images/product/${product.image }"
									alt=""></a>
								<div class="overlay">
									<div class="recent-work-inner">
										<h3>
											<a href="productDetail.do?name=${product.name }">${product.name }</a>
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