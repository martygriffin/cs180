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
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/Scripts/jquery/themes/ui-lightness/jquery.ui.all.css" />
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.core.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.widget.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.datepicker.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/Scripts/section-times.js"></script>
<script type="text/javascript">
$(function() {
			   $("#datepicker").datepicker();
			   $("#datepicker2").datepicker();
			   });
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
</script>
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<sx:head/>
</head>

<body onLoad="P7_Uberlink('uberlink','nav'); showFilled();">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
        <div id="header"><h1>
			<s:if test="%{sectId == -1}">Add</s:if>
       		<s:else>Edit</s:else>
			Section<br />
       	</h1></div>
        <div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']"/></strong>
        	<input type="button" onclick="location.href='logout.do'" value="Logout" /></p></div>
    	</div>
		<%@ include file="/manager/manager_sidebar.jsp" %>
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
			<s:form action="/manager/section_save">
				<s:hidden name="sectId"/>
				<s:hidden name="labclassId"/>
			   	<table width="100%" id="addEdit" cellpadding="5">
				   	<tr>
						<td class="name"><s:if test="%{sectId == -1}">*</s:if>Year:</td>
					  	<td class="field">
					  		<s:if test="%{sectId == -1}"><s:textfield name="year"/></s:if>
					  		<s:else>
					  			<s:property value="year"/>
					  			<s:hidden name="year"/>
					  		</s:else>
					  	</td>
				  	</tr>			   
				  	<tr>
						<td class="name"><s:if test="%{sectId == -1}">*</s:if>Term:</td>
					   	<td class="field">
					   		<s:if test="%{sectId == -1}"><s:select name="termId" list="terms" listKey="id" listValue="name" 
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Term--" /></s:if>
					   		<s:else>
						   		<s:property value="termName"/>
						   		<s:hidden name="termId"/>
						   		<s:hidden name="termName"/>
					   		</s:else>
					   	</td>
				   	</tr>
				   	<tr>
					   	<td class="name">*Name:</td>
					   	<td class="field"><s:textfield name="name"/></td>
				   	</tr>	
				   	<tr>
					   	<td class="name">*Start Date:</td>
					   	<td class="field"><s:textfield name="startDate" id="datepicker" 
					   		value="%{getText('format.date',{startDate})}"/></td>
					</tr>
					<tr>
						<td class="name">*End Date:</td>
						<td class="field"><s:textfield name="endDate" id="datepicker2" 
					   		value="%{getText('format.date',{endDate})}"/></td>
					</tr>
					<tr>
						<td class="name">*Weekly Day(s):</td>
						<td class="field"><s:textfield name="weeklyDay1"/></td>
					</tr>
					<tr>
						<td class="name">*Time:</td>
						<td class="field"><s:textfield name="time1"/><img onclick="show(2);" src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Another Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="days2" class="additional_section_time">
						<td class="name">Weekly Day(s) 2:</td>
						<td class="field"><s:textfield name="weeklyDay2"/><img onclick="hide(2);" src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Remove Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="time2" class="additional_section_time">
						<td class="name">Time 2:</td>
						<td class="field"><s:textfield name="time2"/><img onclick="show(3);" src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Another Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="days3" class="additional_section_time">
						<td class="name">Weekly Day(s) 3:</td>
						<td class="field"><s:textfield name="weeklyDay3"/><img onclick="hide(3);" src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Remove Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="time3" class="additional_section_time">
						<td class="name">Time 3:</td>
						<td class="field"><s:textfield name="time3"/><img onclick="show(4);" src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Another Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="days4" class="additional_section_time">
						<td class="name">Weekly Day(s) 4:</td>
						<td class="field"><s:textfield name="weeklyDay4"/><img onclick="hide(4);" src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Remove Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="time4" class="additional_section_time">
						<td class="name">Time 4:</td>
						<td class="field"><s:textfield name="time4"/><img onclick="show(5);" src="<%= request.getContextPath() %>/images/page_white_add.png" alt="Add Another Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="days5" class="additional_section_time">
						<td class="name">Weekly Day(s) 5:</td>
						<td class="field"><s:textfield name="weeklyDay5"/><img onclick="hide(5);" src="<%= request.getContextPath() %>/images/page_white_delete.png" alt="Remove Time" width="25" height="25" border="0" /></td>
					</tr>
					<tr id="time5" class="additional_section_time">
						<td class="name">Time 5:</td>
						<td class="field"><s:textfield name="time5"/></td>
					</tr>
					<tr>
						<td class="name">*Location:</td>
						<td class="field"><s:textfield name="location"/></td>
					</tr>
					<tr>
						<td class="name">*Max Capacity:</td>
						<td class="field"><s:textfield name="maxCap"/></td>
					</tr>
					<tr>
						<td class="name">*Number of Days Early<br />to Open Enrollment:</td>
						<td class="field"><s:textfield name="daysEarly"/></td>
					</tr>
					<tr>
						<td class="name">Comments:</td>
						<td class="field"><s:textarea rows="5" cols="30" name="comments"/></td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2"><s:submit name="save" value="Save"/>
							<input type="button" value="Cancel" onclick="window.location.href='/wms/manager/view_manage_labclass.do'" />
					    </td>
				    </tr>
					<tr>
						<td></td><td>* denotes required field</td>
					</tr>
				</table>
			</s:form>
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
