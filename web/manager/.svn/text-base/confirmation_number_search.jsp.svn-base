<%@ include file="/headerIncludes.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/SBR-requestor.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>CHASS Workshop Management System</title>
<!-- InstanceEndEditable -->
<link href="<%= request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
<script src="<%= request.getContextPath() %>/Scripts/jquery/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="<%= request.getContextPath() %>/Scripts/menu.js" type="text/javascript"></script>
<script src="<%= request.getContextPath() %>/Scripts/confirmations.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/sIFR-screen.css" media="screen" />
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/sIFR-print.css" media="print, projection" />
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/sifr.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/sifr-config.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/swfobject.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/p7uberlink.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/confirmation-number-views.js"></script>
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
	        <div id="header"><h1>Confirmation Number Search</h1></div>
	        <div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']"/></strong>
	        	<input type="button" onclick="location.href='logout.do'" value="Logout" /></p></div>
	    </div>
		<%@ include file="/manager/manager_sidebar.jsp" %>
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
			Search for <s:select list="workshopLabclass" name="workshop_labclass" value="selectedWorkshopLabclass"/>
			with Confirmation Number <s:textfield name="specifiedConf"/>
			<input type="button" value="Search" onclick="confirmation_number_search();"/>
			<hr />
			<s:if test="isOutput() == true">
				<s:if test="isWorkshop() == true">
					<table cellpadding="5" cellspacing="0" id="manage">
						<tr>
							<th>Session</th><th>Reservation Status</th>
						</tr>
						<s:if test="wsReservations.size() > 0">
							<s:iterator value="wsReservations">
								<s:url id="sessURL" action="manage_session_view.do">
									<s:param name="id" value="session.id" />
								</s:url>
								<tr>
									<td><s:a href="%{sessURL}"><s:property value="session.name"/></s:a></td>
									<td><s:property value="reservationStatus.statusCode"/></td>
								</tr>
							</s:iterator>
						</s:if>
						<s:else>
							<td>None</td><td>Confirmation Number Not Found</td>
						</s:else>
					</table>
				</s:if>
				<s:else>
					<table cellpadding="5" cellspacing="0" id="manage">
						<tr>
							<th>Section</th><th>Reservation Status</th>
						</tr>
						<s:if test="lcReservations.size() > 0">
							<s:iterator value="lcReservations">
								<s:url id="sectURL" action="manage_section_view.do">
									<s:param name="id" value="section.id" />
								</s:url>
								<tr>
									<td><s:a href="%{sectURL}"><s:property value="section.name"/></s:a></td>
									<td><s:property value="reservationStatus.statusCode"/></td>
								</tr>
							</s:iterator>
						</s:if>
						<s:else>
							<td>None</td><td>Confirmation Number Not Found</td>
						</s:else>
					</table>
				</s:else>
			</s:if> 
		</div>
	</div>
	<div id="footer_wrapper">
	  	<div id="footer">
	        <s:property escapeHtml="false" value="#session['footer']"/><s:property escapeHtml="false" value="footer"/>
	    </div>  
  	</div>
</div>
</body>
</html>
