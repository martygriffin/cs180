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
	