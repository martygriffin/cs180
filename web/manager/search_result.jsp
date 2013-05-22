<%@ include file="/headerIncludes.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<!-- InstanceBegin template="/Templates/SBR-requestor.dwt" codeOutsideHTMLIsLocked="false" -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<!-- InstanceBeginEditable name="doctitle" -->
		<title>CHASS Workshop Management System</title>
		<!-- InstanceEndEditable -->
		<style type="text/css">
#searchHeader th {
	background-color: #2d6cc0;
	font-weight: bold;
	color: #FFF;
}

#searchHeader td,th {
	border: 1px solid #D6D6D6;
}
</style>
		<link href="<%=request.getContextPath()%>/css/style.css"
			rel="stylesheet" type="text/css" />
		<script
			src="<%=request.getContextPath()%>/Scripts/jquery/jquery-1.4.2.min.js"
			type="text/javascript">
		</script>
		<script src="<%=request.getContextPath()%>/Scripts/search.js"
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
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/confirmation-number-views.js">
		</script>
		<link rel="stylesheet" type="text/css"
			href="<%=request.getContextPath()%>/Scripts/jquery/themes/ui-lightness/jquery.ui.all.css" />
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/jquery/ui/jquery.ui.core.js">
		</script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/jquery/ui/jquery.ui.widget.js">
		</script>
		<script type="text/javascript"
			src="<%=request.getContextPath()%>/Scripts/jquery/ui/jquery.ui.datepicker.js">
		</script>
		<script type="text/javascript">
$(function() {
	$("#datepicker").datepicker();
	$("#datepicker2").datepicker();
});
function MM_goToURL() { //v3.0
	var i, args = MM_goToURL.arguments;
	document.MM_returnValue = false;
	for (i = 0; i < (args.length - 1); i += 2)
		eval(args[i] + ".location='" + args[i + 1] + "'");
}
</script>
	</head>

	<body onLoad="P7_Uberlink('uberlink','nav')">
		<%@ include file="/masthead.jsp"%>
		<div id="headerContainer">
			<div id="header">
				<h1>
					Search
				</h1>
			</div>
			<div id="userInfo">
				<p>
					You are logged in as
					<strong><s:property value="#session['loggedInUser']" /> </strong>
					<input type="button" onclick="location.href='logout.do'"
						value="Logout" />
				</p>
			</div>
		</div>
		<%@ include file="/manager/manager_sidebar.jsp"%>
		<div id="mainContent">
			<div align="center">

				<s:if test="filtered_Reservations_workshops.size()> 0">
					<INPUT TYPE="BUTTON" VALUE="Back to Search"
						ONCLICK="window.location.href='search.do'">
						<br />
						<br />
					<table id="searchHeader">

						<tr>
							<th>
								<strong>TERM</strong>
							</th>
							<th>
								<strong>DATE</strong>
							</th>
							<th>
								<strong>WORKSHOP</strong>
							</th>
							<th>
								<strong>SESSION</strong>
							</th>
							<th>
								<strong>SID</strong>
							</th>
							<th>
								<strong>STUDENT NAME</strong>
							</th>

							<th>
								<strong>EMAIL</strong>
							</th>
							<th>
								<strong>CONFIRMATION#</strong>
							</th>
							<th>
								<strong>ATTENDED</strong>
							</th>
						</tr>
						<s:iterator value="filtered_Reservations_workshops">
							<tr>
								<td>
									<s:property value="session.academicTerm.name" />
									<br />
									<s:property value="session.academicYear" />
								</td>
								<td>
						
									<s:property value="session.startDate.month+1" />
									/
									<s:property value="session.startDate.date" />
									/
									<s:property value="session.startDate.year+1900" />
									<br />
									to
									<br />
									<s:property value="session.endDate.month+1" />
									/
									<s:property value="session.endDate.date" />
									/
									<s:property value="session.endDate.year+1900" />
								</td>
								<td>
									<s:property value="session.workshop.subject" />
								</td>
								<td>
									<s:url id="sessionURL" action="manage_session_view.do">
										<s:param name="id" value="session.id" />			
									</s:url>
									<s:a href="%{sessionURL}"><s:property value="session.name" /></s:a>
								</td>
								<td>
									<s:property value="student.sid" />
								</td>
								<td>
									<s:property value="student.firstName" />
									<s:property value="student.LastName" />
								</td>
								<td>
									<s:property value="student.email" />
								</td>
								<td>
									<s:property value="confirmationNumber" />
								</td>
								<td>
									<s:if test="attended">Attended</s:if>
									<s:elseif test="reservationStatus.id == 1 && reservationStatus.active">Canceled by Student</s:elseif>
									<s:elseif test="reservationStatus.id == 2 && reservationStatus.active">Canceled by Manager</s:elseif>
									<s:elseif test="reservationStatus.id == 3 && reservationStatus.active">Canceled by Administrator</s:elseif>
									<s:elseif test="
											today.month <= session.endDate.month &&
											today.date <= session.endDate.date &&
											today.year <= session.endDate.year 
											">Reserved</s:elseif>
									<s:else>Did not attend</s:else>
								</td>
							</tr>
						</s:iterator>

					</table>

				</s:if>
				<s:elseif test="filtered_Reservations_labs.size()> 0">

					<INPUT TYPE="BUTTON" VALUE="Back to Search"
						ONCLICK="window.location.href='search.do'">
						<br />
						<br />
					<table id="searchHeader">
						<tr>
							<th>
								<strong>TERM</strong>
							</th>
							<th>
								<strong>DATE</strong>
							</th>
							<th>
								<strong>LABCLASS</strong>
							</th>
							<th>
								<strong>SECTION</strong>
							</th>
							<th>
								<strong>SID</strong>
							</th>
							<th>
								<strong>STUDENT NAME</strong>
							</th>

							<th>
								<strong>EMAIL</strong>
							</th>
							<th>
								<strong>CONFIRMATION#</strong>
							</th>

						</tr>
						<s:iterator value="filtered_Reservations_labs">

							<tr>
								<td>
									<s:property value="section.academicTerm.name" />
									<br />
									<s:property value="section.academicYear" />
								</td>
								<td>

									<s:property value="section.startDate.month+1" />
									/
									<s:property value="section.startDate.date" />
									/
									<s:property value="section.startDate.year+1900" />
									<br />
									to
									<br />
									<s:property value="section.endDate.month+1" />
									/
									<s:property value="section.endDate.date" />
									/
									<s:property value="section.endDate.year+1900" />
								</td>
								<td>
									<s:property value="section.labclass.subject" />
								</td>
								<td>
									<s:url id="sectionURL" action="manage_section_view.do">
										<s:param name="id" value="section.id" />			
									</s:url>
									<s:a href="%{sectionURL}"><s:property value="section.name" /></s:a>
								</td>
								<td>
									<s:property value="student.sid" />
								</td>
								<td>
									<s:property value="student.firstName" />
									<s:property value="student.LastName" />
								</td>
								<td>
									<s:property value="student.email" />
								</td>
								<td>
									<s:property value="confirmationNumber" />
								</td>

							</tr>
						</s:iterator>
					</table>
<%--					<table id="searchHeader">--%>
<%----%>
<%--						<tr>--%>
<%--							<th>--%>
<%--								Lab class Name--%>
<%--							</th>--%>
<%--							<th>--%>
<%--								Start Date--%>
<%--							</th>--%>
<%--							<th>--%>
<%--								End Date--%>
<%--							</th>--%>
<%----%>
<%--						</tr>--%>
<%--						<s:iterator value="filtered_Reservations_labs">--%>
<%--							<tr>--%>
<%--								<td>--%>
<%--									<s:property value="section.labclass.subject" />--%>
<%--								</td>--%>
<%--								<td>--%>
<%----%>
<%--									<s:property value="section.startDate.month+1" />--%>
<%--									/--%>
<%--									<s:property value="section.startDate.date" />--%>
<%--									/--%>
<%--									<s:property value="section.startDate.year+1900" />--%>
<%----%>
<%--								</td>--%>
<%--								<td>--%>
<%--									<s:property value="section.endDate.month+1" />--%>
<%--									/--%>
<%--									<s:property value="section.endDate.date" />--%>
<%--									/--%>
<%--									<s:property value="section.endDate.year+1900" />--%>
<%--								</td>--%>
<%----%>
<%--							</tr>--%>
<%----%>
<%----%>
<%--						</s:iterator>--%>
					</table>



				</s:elseif>
				<s:else>
			
			No Results
		
			</s:else>
				<br />
				<s:form action="search_export">
					<INPUT TYPE="BUTTON" VALUE="Back to Search"
						ONCLICK="window.location.href='search.do'">
					<s:submit value="Export" />
				</s:form>
			</div>
		</div>
	</body>
</html>
