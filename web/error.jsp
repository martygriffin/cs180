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
</head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">Brian's Tacos</a></h1>
			<h2><a>As Authentic as you can get</a></h2>
		</div>
		<div id="menu">
			<ul>
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Reservations</a></li>
				<li><a href="#">Orders</a></li>
				<li><a href="#">Items</a></li>
				<li><a href="#">Menus</a></li>
			</ul>
		</div>
	</div>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				<h2>Invalid Login, please go back <a href="index.jsp"> Here</a> and try again</h2>
				</div>
				
			</div>
			<%@ include file="sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
