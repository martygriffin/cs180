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
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/session-section-views.js"></script>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/Scripts/jquery/themes/ui-lightness/jquery.ui.all.css" />
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.core.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.widget.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.datepicker.js"></script>
<script type="text/javascript" charset="utf-8">
	$(function() {
			   $("#datepicker").datepicker();
			   });
</script>
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<sx:head/>
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
	        <div id="header"><h1>View Lab Classes</h1></div>
	        <div id="userInfo"><p>You are logged in as <strong><s:property value="managerName" /></strong>
	        	<input type="button" onclick="location.href='logout.do'" value="Logout" /></p></div>
	    </div>
		<%@ include file="/manager/manager_sidebar.jsp" %>
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
		  	<%@ include file="/manager/dropdowns.jsp" %>
			<input type="button" value="Update" onclick="view_labclass_view();"/>
			<hr />
			<s:if test="labclasses.size() > 0">
			  	<s:iterator value="labclasses">
			  		<s:property value="subject" /><br />
			  		<ul>
				  		<s:set name="sections" value="#labclasses.sections" />
				  		<s:if test="sections.size() > 0">
					  		<s:iterator value="sections">
								<s:url id="viewURL" action="manage_section_view.do">
									<s:param name="id" value="id" />			
								</s:url>
						  		<li><s:a href="%{viewURL}"><s:property value="name"/></s:a> 
						  			(<s:property value="labclassReservations.size()" />/<s:property value="maxCapacity"/>)</li>
					  		</s:iterator>
				  		</s:if>
				  		<s:else>
				  			<li>No sections</li>
				  		</s:else>
			  		</ul>
			  	</s:iterator>
		  	</s:if>
		  	<s:else>
		  		No workshops found.
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
