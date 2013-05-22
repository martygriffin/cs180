	<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/sbr.tld" prefix="sbr" %>
<%@page import="edu.ucr.c3.wms.helper.validators.BaseValidator"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<c:set var="NOT_SELECTED" value="<%=BaseValidator.NOT_SELECTED%>" scope="request"/>
<c:set var="OTHER_SELECTED" value="<%=BaseValidator.OTHER_SELECTED%>" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Brian's Tacos</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta HTTP-EQUIV=Refresh CONTENT="60; URL=order_unfilled.do" />
<link href="default.css" rel="stylesheet" type="text/css" />
<link href="tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="tablecloth/tablecloth.js"></script>
</head>
<body>
		<s:if test="%{#session['loggedInUser'] == null}">
   <%
    String redirectURL = "index.jsp";
    response.sendRedirect(redirectURL);
%>
    </s:if>
  
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="index.do">Brian's Tacos</a></h1>
			<h2><a>As Authentic as you can get</a></h2>
		</div>
		<div id="menu">
			<ul>
				<li ><a href="home.jsp">Admin</a></li>
				<li><a href="reservations_currentReservations.do">Reservations</a></li>
				<li><a href="order_unfilled.do">Orders</a></li>
				<li><a href="item_viewItems.do">Items</a></li>
				<li><a href="menu_viewMenus.do">Menus</a></li>
				<li><a href="social_view.do">Social</a></li>
				<li><a href="coupon_view.do">Coupon</a></li>
				<li><a href="feedback_viewActiveFeedback.do">Feedback</a></li>
<!--				<li><a href="user_viewAdmins.do">Admins</a></li>-->
				
			</ul>
		</div>
	</div>
	

<div id="page">
	<div class="inner_copy">
		<div class="inner_copy"></div>
	</div>
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
		<h3>Click Order Number for Details </h3>
			<table cellpadding="0" cellspacing="0">
					
					<tr>
						<td>Order ID</td>
						<td>Customer Name</td>
						<td>Is To-Go</td>
						<td>Is Delivery</td>
						<td>Status</td>
							<td>Order Time</td>
					</tr>

					<s:iterator value="order_list">
						<tr>

							<td><s:url action="order_details.do" var="urlTag">
									<s:param name="id">
										<s:property value="orderId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />"><s:property
										value="orderId" /> </a></td>
							<td><s:property value="user.firstName" /> &nbsp; <s:property
									value="user.lastName" /></td>
							<td><s:property value="isTogo" /></td>
							<td><s:property value="isDelivery" /></td>
							<td><s:property value="status" /></td>
							<td><s:property value="ordertime" /></td>

						</tr>
					</s:iterator>

				</table>

			</div>

		</div>
		<%@ include file="order_sidebar.jsp"%>
	</div>
</div>

</div>

</body>
</html>
