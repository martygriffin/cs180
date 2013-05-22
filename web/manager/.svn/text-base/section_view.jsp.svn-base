<%@ include file="/headerIncludes.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<!-- InstanceBegin template="/Templates/SBR-requestor.dwt" codeOutsideHTMLIsLocked="false" -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<!-- InstanceBeginEditable name="doctitle" -->
		<title>CHASS Workshop Management System</title>
		<!-- InstanceEndEditable -->
		<link href="<%=request.getContextPath()%>/css/style.css"
			rel="stylesheet" type="text/css" />
		<script
			src="<%=request.getContextPath()%>/Scripts/jquery/jquery-1.4.2.min.js"
			type="text/javascript">
		</script>
		<script src="<%=request.getContextPath()%>/Scripts/menu.js"
			type="text/javascript">
		</script>
		<script src="<%=request.getContextPath()%>/Scripts/confirmations.js"
			type="text/javascript">
		</script>
		<link rel="stylesheet" type="text/css"
			href="<%=request.getContextPath()%>/css/sIFR-screen.css"
			media="screen" />
		<link rel="stylesheet" type="text/css"
			href="<%=request.getContextPath()%>/css/sIFR-print.css"
			media="print, projection" />
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/sifr.js">
		</script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/sifr-config.js">
		</script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/swfobject.js">
		</script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/p7uberlink.js">
		</script>
		<script type="text/javascript" charset="utf-8">
Date.firstDayOfWeek = 0;
Date.format = 'yyyy-mm-dd';
$(function() {
	$('#mainContent input.date-pick').datePicker( {
		clickInput : true,
		createButton : false
	})
});
</script>
		<!-- InstanceBeginEditable name="head" -->
		<!-- InstanceEndEditable -->
	</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp"%>
		<div id="headerContainer">
			<div id="header">
				<h1>
					View Section:
					<s:property value="sect.getName()" />
				</h1>
			</div>
			<div id="userInfo">
				<p>
					You are logged in as
					<strong><s:property value="#session['loggedInUser']" /></strong>
					<input type="button" onclick="location.href='logout.do'"
					value="Logout" />
				</p>
			</div>
		</div>
		<%@ include file="/manager/manager_sidebar.jsp"%>
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
			<p>
				<b>Labclass Name:</b> <s:property value="sect.labclass.subject" />
				<br />
				<b>Terms:</b>
				<s:set value="%{sect.getAcademicTerm().getId()}" name="term" />
				<s:if test="%{#term == 0}">Summer</s:if>
				<s:if test="%{#term == 1}">Fall</s:if>
				<s:if test="%{#term == 2}">Winter</s:if>
				<s:if test="%{#term == 3}">Spring</s:if>
				<br />
				<b>Time:</b>
				<s:if test="sect.getStartDate() != sect.getEndDate()">
					${sect.startDate.month +1}
					/${sect.startDate.date} 
					
					/${sect.startDate.year +1900}
					to
					${sect.endDate.month +1}
					/${sect.endDate.date} 
					/${sect.endDate.year +1900}
				</s:if>
				<s:else>
					On ${sect.startDate.month +1}
					/${sect.startDate.date} 
					/${sect.startDate.year +1900}
				</s:else>
				on
				<s:property value="sect.getWeeklyday()" />
				at
				<s:property value="sect.getTimeDuration()" />
				<s:if test="sect.weeklySchedules.size() > 0">
					<s:iterator value="sect.weeklySchedules">
						and on
						<s:property value="weeklyday" />
						at
						<s:property value="timeDuration" />
					</s:iterator>
				</s:if>
				<br />
				<b>Location:</b>
				<s:property value="sect.getLocation()" />
				<br />
				<b>Capacity:</b>
				<s:property value="labRes.size()" />
				/
				<s:property value="sect.getMaxCapacity()" />
				<br />
				<b>Registration Begins:</b>
				<s:property value="sect.getOpenAdvanceDay()" />
				day(s) early
				<br />
				<b>Comments:</b>
				<s:property value="sect.getComments()" />
			</p>
			<s:form action="manage_section_cancel">
				<table width="100%" border="0" cellpadding="3" cellspacing="2">
					<s:hidden name="form.sectionId" />
					<s:if test="labRes.size() > 0">
						<tr>
							<th></th>
							<th align="left">
								Student Name
							</th>
							<th align="left">
								SID
							</th>
							<th align="left">
								netID
							</th>
							<th align="left">
								email
							</th>
							<th align="left">
								Major
							</th>
							<th align="left">
								Confirmation #
							</th>
						</tr>
						<s:bean
							name="edu.ucr.c3.wms.controller.manager.LabclassComparator"
							var="LabclassComparator" />
						<s:iterator value="labRes" />
						<s:sort comparator="#LabclassComparator" source="labRes">
							<s:iterator>
								<tr>
									<td align="center">
										<s:set name="student" value="%{labRes.getStudent()}" />
										<s:checkbox name="form.students"
										fieldValue="%{student.getSid()}" />
									</td>
									<td align="left">
										<s:property value="student.getFirstName()" />
										<s:property value="student.getLastName()" />
									</td>
									<td align="left">
										<s:property value="student.getSid()" />
									</td>
									<td align="left">
										<s:property value="student.getNetid()" />
									</td>
									<td align="left">
										<s:property value="student.getEmail()" />
									</td>
									<td align="left">
										<s:property value="student.getMajor()" />
									</td>
									<td align="left">
										<s:property value="confirmationNumber" />
									</td>
								</tr>
							</s:iterator>
						</s:sort>
						<tr>
							<td colspan="7">
								<hr />
								<s:submit name="cancel" value="Cancel Selected" onclick="return delete_student(0);" />
								<s:submit action="manage_section_cancel_all" value="Cancel All"onclick="return delete_students(0);" />
								<s:submit action="manage_section_export" value="Export" />
								<input type="button" value="Back" onclick="window.location.href='view_workshop.do'" />
							</td>
						</tr>
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
