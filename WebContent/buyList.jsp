<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<%-- <%
	Calendar cal = Calendar.getInstance();
	String strYear = request.getParameter("year");
	String strMonth = request.getParameter("month");
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int date = cal.get(Calendar.DATE);
	if (strYear != null) {
		year = Integer.parseInt(strYear);
		month = Integer.parseInt(strMonth);
	} else {
	}
	//����/�� ����
	cal.set(year, month, 1);
	int startDay = cal.getMinimum(java.util.Calendar.DATE);
	int endDay = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
	int start = cal.get(java.util.Calendar.DAY_OF_WEEK);
	int newLine = 0;
	//�ㅻ�� ��吏� ����.

	Calendar todayCal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
	int intToday = Integer.parseInt(sdf.format(todayCal.getTime()));
%> --%>

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
				<li class="active"><a href="post.jsp">Calendar</a></li>
				<li><a href="rank.jsp">Rank</a></li>
				<li><a href="Syrup.jsp">Favorites</a></li>
				<li><a href="index.jsp">----</a></li>
				<li><a href="index.jsp">----</a></li>
			</div>
		</div>
	</div>
	<div align="center">
		<form name="calendarFrm" id="calendarFrm" action="" method="post">

			<DIV id="content" style="width: 712px;">

				<table width="100%" border="0" cellspacing="1" cellpadding="1">
					<tr>
						<td align="right"><input type="button"
							onclick="javascript:location.href='<c:url value='/post.jsp' />'"
							value="�ㅻ��" /></td>
					</tr>
				</table>
				<!--��吏� �ㅻ�寃��댁��  -->
				<table width="100%" border="0" cellspacing="1" cellpadding="1"
					id="KOO" bgcolor="#F3F9D7" style="border: 1px solid #CED99C">

					<tr>

						<td height="60">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td height="10"></td>
								</tr>
								<tr>
									<td align="center"><a
										href="<c:url value='/buyList.jsp' />?year=${year -1}&amp;month=${month}"
										target="_self"> <b>&lt;&lt;</b> <!-- �댁���� -->
									</a> <c:choose>
											<c:when test="${month > 0 }">
												<a
													href="<c:url value='/buyList.jsp' />?year=${year -1}&amp;month=${month-1}"
													target="_self"> <b>&lt;</b> <!-- �댁���� -->
												</a>
											</c:when>
											<c:otherwise>
												<b>&lt;</b>
											</c:otherwise>
										</c:choose> <font color="black">&nbsp;&nbsp; ${year}�� ${month+1}��
											&nbsp;&nbsp; </font> <c:when test="${month <11 }">
											<a
												href="<c:url value='/buyList.jsp' />?year=${year}&amp;month=${month+1}"
												target="_self"> <!-- �ㅼ���� --> <b>&gt;</b>
											</a>
										</c:when> <c:otherwise>
											<b>&gt;</b>
										</c:otherwise> <a
										href="<c:url value='/buyList.jsp' />?year=${year+1}&amp;month=${month}"
										target="_self"> <!-- �ㅼ���� --> <b>&gt;&gt;</b>
									</a></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br>
				<table border="0" cellspacing="1" cellpadding="1" bgcolor="#FFFFFF">
					<THEAD>
						<TR bgcolor="#CECECE">
							<TD width='100px'>
								<DIV align="center">
									<font color="red">��</font>
								</DIV>
							</TD>
							<TD width='100px'>
								<DIV align="center">��</DIV>
							</TD>
							<TD width='100px'>
								<DIV align="center">��</DIV>
							</TD>
							<TD width='100px'>
								<DIV align="center">��</DIV>
							</TD>
							<TD width='100px'>
								<DIV align="center">紐�</DIV>
							</TD>
							<TD width='100px'>
								<DIV align="center">湲�</DIV>
							</TD>
							<TD width='100px'>
								<DIV align="center">
									<font color="#529dbc">��</font>
								</DIV>
							</TD>
						</TR>
					</THEAD>
					<TBODY>
						<TR>
							<c:forEach var="item" items="${start }" begin=1 end=${start }
								step=1>
								<TD>&nbsp;</TD>
							${newLine+1 }
						</c:forEach>
							<c:forEach var="item" items="${endDay }" begin=1 end=${endDay }
								step=1 varStatus="status">
								<c:choose>
									<c:when test="${newLine == 0}">
										<c:set var="color" value="RED"></c:set>
									</c:when>
									<c:when test="${newLine == 6}">
										<c:set var="color" value="#529dbc"></c:set>
									</c:when>
									<c:otherwise>
										<c:set var="color" value="BLACK"></c:set>
									</c:otherwise>
								</c:choose>
								<fmt:formatNumber value="${year }" type="String" var="ye"></fmt:formatNumber>
								<fmt:formatNumber value="${month+1 }" type="String" var="mon"></fmt:formatNumber>
								<fmt:formatNumber value="${status.count }" type="String"
									var="count"></fmt:formatNumber>
								<c:choose>
									<c:when test="${fn:length(mon)==1}">
										<c:choose>
											<c:when test="${fn:length(count)==1}">
												<c:set var="sUseDate" value="${ye }0${mon }0${count }" />
											</c:when>
											<c:otherwise>
												<c:set var="sUseDate" value="${ye }0${mon }${count }" />
											</c:otherwise>
										</c:choose>
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${fn:length(count)==1}">
												<c:set var="sUseDate" value="${ye }${mon }0${count }" />
											</c:when>
											<c:otherwise>
												<c:set var="sUseDate" value="${ye }${mon }${count }" />
											</c:otherwise>
										</c:choose>
									</c:otherwise>
								</c:choose>
								<fmt:parseNumber value="${sUseDate }" type="number"
									var="iUseDate" />
								<c:set var="intToday" value="${intToday }" />
								<c:if test="${iUseDate== intToday}">
									<c:set var="backColor" value="#c9c9c9" />
								</c:if>
								<td valign='top' align='left' margin-left=10px height='92px'
									bgcolor='${backColor }' nowrap><font color='${color}'>&nbsp;
										${status.count} </font> <BR> <font color='black'> <!-- 嫄곕���댁���� ���� 遺�遺� ���� -->
								</font><BR></td>
							${newLine+1 }
								
							</c:forEach>

						</tr><tr>
						<c:if test="${newLine==7 }">
							
							<c:if test="${status.count < endDay}">
								
							</c:if>
								${newLine=0}
						</c:if>

						<c:forEach var="item" items="${newLine }" end="${newLine==7 }">
							<td>&nbsp;</td>
								${newLine+1}
							</c:forEach>


						<c:forEach var="buyList" items="${buyList }">
							<c:out value="${buyList.CA_date }" default="" />;
						</c:forEach>
						</TR>
					</TBODY>
				</TABLE>
			</DIV>
		</form>
	</div>

	<%@ include file="footer.jsp"%>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/jquery.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/jquery.isotope.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/functions.js"></script>

</body>
</html>