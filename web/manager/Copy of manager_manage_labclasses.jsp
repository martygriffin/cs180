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
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
	        <div id="header"><h1>Manage Lab Classes</h1></div>
	        <div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']"/></strong>
	        	<input type="button" onclick="location.href='logout.do'" value="Logout" /></p></div>
	    </div>
		<%@ include file="/manager/manager_sidebar.jsp" %>
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
			<%@ include file="/manager/dropdowns.jsp" %>
			<input type="button" value="Update" onclick="manage_labclass_view();"/>
			<hr />
			<s:url id="addURL" action="/manager/labclass_input.do" />
			<s:if test="labclasses.size() > 0">
				<table cellpadding="5" cellspacing="0" id="manage">
					<tr>
						<th class="workshop_labclass_name">Lab Class Name</th>
					    <th class="workshop_labclass_description">Description</th>
					    <th class="sessions_sections">Sections</th>
					    <th class="buttons"><s:a href="%{addURL}"><img src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Lab Class" width="25" height="25" border="0" /></s:a></th>
					</tr>
					<s:iterator value="labclasses">
						<tr>
							<s:url id="addSectURL" action="section_input.do">
								<s:param name="labclassId" value="id" />
							</s:url>
							<s:url id="editURL" action="labclass_input.do">
								<s:param name="id" value="id" />
							</s:url>
							<s:url id="deleteURL" action="labclass_delete.do">
								<s:param name="id" value="id" />
							</s:url>
						    <td class="workshop_labclass_name"><s:property value="subject"/></td>
						    <td class="workshop_labclass_description"><s:property value="description"/></td>
						    <td class="sessions_sections">
								<ul class="hidden">
							  		<s:if test="sections.size() > 0">	
									  	<s:iterator value="sections">
										  	<s:url id="editSectURL" action="section_input.do">
												<s:param name="id" value="id" />
											</s:url>
											<s:url id="deleteSectURL" action="section_delete.do">
												<s:param name="id" value="id" />
											</s:url>
									  		<li><s:property value="name"/> (<s:property value="labclassReservations.size()" />/<s:property value="maxCapacity"/>) <s:a href="%{editSectURL}"><img src="<%= request.getContextPath() %>/images/page_white_edit.png" alt="View/Edit Section" width="16" height="16" border="0" /></s:a>
												<s:a href="%{deleteSectURL}"  onclick="return delete_session_section(0);"><img src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Delete Section" width="16" height="16" border="0" /></s:a></li>
									  	</s:iterator>
									  	<li><s:a href="%{addSectURL}"><img src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Section" width="16" height="16" border="0" /></s:a></li>
							  		</s:if>
							  		<s:else>
							  			<li>No sections found. <s:a href="%{addSectURL}"><img src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Section" width="16" height="16" border="0" /></s:a></li>
							  		</s:else>
						  		</ul>
							</td>
						    <td class="buttons">
							    <s:a href="%{editURL}"><img src="<%= request.getContextPath() %>/images/page_white_edit.png" alt="View/Edit Lab Class" width="25" height="25" border="0" /></s:a>
							    <s:a href="%{deleteURL}"  onclick="return delete_workshop_labclass(0);"><img src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Delete Lab Class" width="25" height="25" border="0" /></s:a>
							</td>
						</tr>
					</s:iterator>
				</table>
			</s:if>	
			<s:else>
				<table cellpadding="5" cellspacing="0" id="manage"><tr>
					<th>No lab classes found.</th>
					<th class="buttons"><s:a href="%{addURL}"><img src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Labclass" width="25" height="25" border="0" /></s:a></th>
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
