<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/prettyPhoto.css">
	<link rel="stylesheet" href="css/style.css" />	
<title>Insert title here</title>
</head>
<body>
 <header>		
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="navigation">
				<div class="container">					
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<div class="navbar-brand">
							<a href="index.jsp"><h1><span>Cof</span>fee</h1></a>
						</div>
					</div>
					
					<div class="navbar-collapse collapse">							
						<div class="menu">
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation"><a href="index.jsp" class="active">Home</a></li>
								<li role="presentation"><a href="login.jsp">Join Us</a></li>
								<li role="presentation"><a href="order.jsp">Order</a></li>								
								<li role="presentation"><a href="siteMap.jsp">Site Map</a></li>
								<li role="presentation"><a href="post.jsp">Post</a></li>
								<li role="presentation"><a href="qna.jsp">QnA</a></li>	
								<li class="dropdown">
									<a href="#" class="dropdown-toggle"
										data-toggle="dropdown" role="button" aria-haspopup="true"
										aria-expanded="false">Sign In<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="login1.jsp" onClick="window.open('login1.jsp','제발','width=400, height=260, toolbar=no, menubar=no, scrollbars=no, resizable=no, left=800,top=300');return false;">Sign In</a></li>
										<li><a href="join1.jsp">Sign Up</a></li>
									</ul>
								</li> 			
							</ul>
						</div>
					</div>						
				</div>
			</div>	
		</nav>	
	</header>
</body>
</html>