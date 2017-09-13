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
				<li>ȸ������</li>			
			</div>		
		</div>	
	</div>
	
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top:20px;">
			<form method="post" action="joinAction.jsp">
				<h3 style="text-align: center;">ȸ������ ȭ��</h3>
				<div class="from-group">
					<input type="text" class="form-control" placeholder="���̵�" name="userID" maxlength="20">
				</div>
				<div class="from-group">
					<input type="password" class="form-control" placeholder="��й�ȣ" name="userPassword" maxlength="20">
				</div>
				<div class="from-group">
					<input type="text" class="form-control" placeholder="�̸�" name="userName" maxlength="20">
				</div>
				<div class="from-group" style="text-align:center;">
					<div class="btn-group" data-toggle="buttons">
						<label class="btn btn-primary active">
							<input type="radio" name="userGender" autocomplete="off" value="����" checked>����
						</label>
						<label class="btn btn-primary">
							<input type="radio" name="userGender" autocomplete="off" value="����" checked>����
						</label>
					</div>
				</div>
				<div class="from-group">
					<input type="email" class="form-control" placeholder="�̸���" name="userEmail" maxlength="20">
				</div>
				<input type="submit" class="btn btn-primary form-control" value="�α���">
			</form> 
			</div>
			</div>
			<div class="col-lg-4"></div>
	</div>
	
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