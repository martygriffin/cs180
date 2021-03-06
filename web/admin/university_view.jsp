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
	<!-- InstanceBeginEditable name="head" -->
	<!-- InstanceEndEditable -->
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
	        <div id="header"><h1>Universities</h1></div>
	        <div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']"/></strong>
	        	<input type="button" value="Log Out"
	            onclick="window.location.href='logout.do'" /></p></div>
	    </div>
	    <%@ include file="/admin/admin_sidebar.jsp"%> 
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
			<s:url id="addURL" action="/admin/university_input.do" />
			<s:if test="universities.size() > 0"> 
				<table cellpadding="5" cellspacing="0" id="manage">
					<tr>
						<th class="univ_name">Name</th><th class="url">URL</th><th class="sid_rule">SID Rule</th>
						<th class="buttons"><s:a href="%{addURL}"><img src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add University" width="25" height="25" border="0" /></s:a></th>
					</tr>
					<s:iterator value="universities">
			        	<tr>
			        		<s:url id="editURL" action="/admin/university_input.do">
								<s:param name="id" value="id" />
							</s:url>
							<s:url id="deleteURL" action="/admin/university_delete.do">
								<s:param name="id" value="id" />
							</s:url>
							<td class="univ_name"><s:property value="name" /></td>
							<td class="url"><s:a href="homeUrl"><s:property value="homeUrl"/></s:a></td>
							<td class="sid_rule"><s:property value="sidRule" /></td>
							<td class="buttons">
								<s:a href="%{editURL}"><img src="<%= request.getContextPath() %>/images/page_white_edit.png" alt="View/Edit University" width="25" height="25" border="0" /></s:a>
								<s:a href="%{deleteURL}" onclick="return delete_university();"><img src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Delete University" width="25" height="25" border="0" /></s:a>
							</td>
						</tr>
					</s:iterator>
				</table>
			</s:if>
			<s:else>
				<table cellpadding="5" cellspacing="0" id="manage"><tr>
					<th>No universities found.</th>
					<th class="buttons"><s:a href="%{addURL}"><img src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add University" width="25" height="25" border="0" /></s:a></th>
				</tr></table>
			</s:else> 
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
