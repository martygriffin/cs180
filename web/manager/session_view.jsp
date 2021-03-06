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
<script type="text/javascript" charset="utf-8">
	Date.firstDayOfWeek = 0;
	Date.format = 'yyyy-mm-dd';
	$(function()
	{
		$('#mainContent input.date-pick').datePicker({clickInput:true, createButton:false})
	});
</script>
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
	        <div id="header"><h1>View Session: <s:property value="sess.getName()" /></h1></div>
	        <div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']" /></strong>
	        	<input type="button" onclick="location.href='logout.do'" value="Logout" /></p></div>
	    </div>
		<%@ include file="/manager/manager_sidebar.jsp" %>
		<div id="mainContent">
			<p>
				<b>Workshop Name:</b> <s:property value="sess.workshop.subject" />
				<br />
				<b>Terms:</b> <s:set value="%{sess.getAcademicTerm().getId()}" name="term"/>
			   		<s:if test="%{#term == 0}">Summer</s:if>		   			
			   		<s:if test="%{#term == 1}">Fall</s:if>
			   		<s:if test="%{#term == 2}">Winter</s:if>
			   		<s:if test="%{#term == 3}">Spring</s:if>
					<br />
				<b>Time:</b> 
					<s:if test="sess.getStartDate() != sess.getEndDate()">
						From &nbsp;${sess.startDate.month +1}
						/${sess.startDate.date} /${sess.startDate.year +1900}
						&nbsp;to &nbsp;${sess.endDate.month +1}
						/${sess.endDate.date} /${sess.endDate.year +1900}
					</s:if>
					<s:else>
						${sess.startDate.month +1}
						/${sess.startDate.date} /${sess.startDate.year +1900}
					</s:else> 
				at <s:property value="sess.getTimeDuration()"/><br />
				<b>Location:</b> <s:property value="sess.getLocation()"/><br />
				<b>Capacity:</b> <s:property value="workRes.size()"/>/<s:property value="sess.getMaxCapacity()"/><br />
				<b>Registration Begins:</b> <s:property value="sess.getOpenAdvanceDay()"/> day(s) early<br/>
				<b>Comments:</b> <s:property value="sess.getComments()"/>
			</p>  
			<s:form action="manage_session_cancel">
				<table width="100%" border="0" cellpadding="3" cellspacing="2">
				  	<s:hidden name="form.sessionId"/>
					<s:if test="workRes.size() > 0">
						<tr>
				  			<th></th>
				  			<th align="left">Student Name</th>
				  			<th align="left">SID</th>
				  			<th align="left">netID</th>
				  			<th align="left">email</th>
				  			<th align="left">Major</th>
				  			<th align="left">Confirmation #</th>
				  			<th align="left">Attended</th>
					  	</tr>
					  	<s:bean name="edu.ucr.c3.wms.controller.manager.WorkshopComparator" var="WorkshopComparator" />
					  	<s:iterator value="workRes" />
					  	<s:sort comparator="#WorkshopComparator" source="workRes">
						  	<s:iterator>
						  		<tr>
						  			<td align="center">
							  			<s:set name="student" value="%{workRes.getStudent()}"/>
							  			<s:checkbox name="form.students" fieldValue="%{student.getSid()}"/>
						  			</td>
						  			<td align="left"><s:property value="student.getFirstName()"/> <s:property value="student.getLastName()"/></td>
						  			<td align="left"><s:property value="student.getSid()"/></td>
						  			<td align="left"><s:property value="student.getNetid()"/></td>
						  			<td align="left"><s:property value="student.getEmail()"/></td>
						  			<td align="left"><s:property value="student.getMajor()"/></td>
						  			<td align="left"><s:property value="confirmationNumber"/></td>
						  			<td align="left"><s:checkbox name="form.attended" value="%{getAttended()}" fieldValue="%{student.getSid()}" /></td>
						  		</tr>
						  	</s:iterator>  	
					  	</s:sort>
					  	<tr><td colspan="7">
						  	<hr />
						  	<s:submit action="manage_session_save" value="Save" />
						  	<s:submit name="cancel" value="Cancel Selected" onclick="return delete_student(1);"/>
						  	<s:submit action="manage_session_cancel_all" value="Cancel All" onclick="return delete_students(1);"/>
						  	<s:submit action="manage_session_export" value="Export" />
						  	<input type="button" value="Back" onclick="window.location.href='view_workshop.do'" />
						</td></tr>
					</s:if>
					<s:else>
						No Reservations
					</s:else>
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
