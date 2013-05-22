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
        	<div id="header"><h1>Welcome</h1></div>
        	<div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']"/></strong>
        		<input type="button" onclick="location.href='logout.do'" value="Logout" /></p></div>
    	</div>
		<%@ include file="/manager/manager_sidebar.jsp" %>
		<div id="mainContent">
			<p>Welcome, <strong><s:property value="#session['loggedInUser']"/></strong>. Use the sidebar to view or manage workshops or lab classes.
			    The "view" pages will give you information about the enrollment of each session or section and let you cancel or
			    export those reservations. The "manage" pages will let you add and edit workshops, lab classes, sessions, and sections.
			</p>
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
