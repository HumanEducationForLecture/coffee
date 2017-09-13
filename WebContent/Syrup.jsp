<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../header.jsp" %>  
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
					
				<li class="active"><a href="index.jsp">Been</a></li>
				<li><a href="index.jsp">Grinder</a></li>
				<li><a href="Syrup.jsp">Syrup</a></li>
				<li><a href="index.jsp">Equipment</a></li>
				<li><a href="index.jsp">Etc</a></li>
					
			</div>		
		</div>	
	</div>
	
	<div class="services">
		<div class="container">
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active" align="Center">
    <h2>Been</h2>
      <a href="Syrup.jsp"><img src="images/¿øµÎ1.jpg" alt="#"></a>
      <div class="carousel-caption">
        
        
      </div>
    </div>
    <div class="item" align="Center">
    <h2>Grinder</h2>
      <img src="images/±×¶óÀÎ´õ1.jpg" alt="#">
      <div class="carousel-caption">
        
       
      </div>
    </div>
    <div class="item" align="Center">
    <h2>Syrup</h2>
      <a href="Syrup.jsp"><img src="images/½Ã·´1.jpg" alt="#"></a>
      <div class="carousel-caption">
        
        
      </div>
    </div>
    <div class="item" align="Center">
      <h2>Equipment</h2>
      <img src="images/ÄÅÈ¦´õ1.jpg" alt="#">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item" align="Center">
      <h2>Etc</h2>
      <img src="images/¸ÔÀ»°Å1.jpg" alt="#">
      <div class="carousel-caption">

      </div>
    </div>
    
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
	
	
<%@ include file="../footer.jsp" %>  
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