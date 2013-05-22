<%@ include file="/headerIncludes.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<!--	 InstanceBegin template="/Templates/SBR-requestor.dwt" codeOutsideHTMLIsLocked="false" -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<!--		 InstanceBeginEditable name="doctitle" -->
		<title>CHASS Workshop Management System</title>
		<!--		 InstanceEndEditable -->
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
		<!--		 InstanceBeginEditable name="head" -->
		<!--		 InstanceEndEditable -->
	</head>

	<body onLoad="P7_Uberlink('uberlink','nav')">
		<%@ include file="/masthead.jsp"%>

		<div id="container">

			<map name="Map" id="Map">
				<area shape="rect" coords="5,16,168,50" href="http://www.ucr.edu/"
					alt="UCR Homepage" />
				<area shape="rect" coords="665,34,936,49"
					href="http://chass.ucr.edu/" alt="CHASS Homepage" />
			</map>
		</div>

		<div id="headerContainer">
			<div id="header">
				<h1>
					View Reservations
					<br />
				</h1>
			</div>
			<div id="userInfo">
				<p>
					You are logged in as
					<strong><s:property value="#session['netID']" /> </strong>
					<input type="button" value="Log Out"
						onclick="window.location.href='logout.do'" />
				</p>
			</div>
		</div>
		<div id="cL">
			<ul id="nav">
				<li>
					<a href="student_view.do">Home</a>
				</li>
				<li>
					<a href="student_make_reservation.do">Make Reservation</a>
				</li>
				<li>
					<a href="student_view_reservations.do">View Reservations</a>
				</li>

				<%
					String getURL = request.getScheme().toString() + "://"
							+ request.getServerName();
				%>
				<li>
					<a href="<%=getURL%>"> <s:property
							value="#session['leftHeader']" /> </a>
				</li>

			</ul>

		</div>
		<div id="mainContent">
			<br />


			Click on the Section/Session name to view more information.
			<s:form action="student_reservations_cancel">
				<s:if test="student_reservations.size() > 0">
					<table cellpadding="5" cellspacing="0" id="manage">
						<tr>
							<th class="name_small"></th>
							<th class="univ_name">
								Labclass Name
							</th>
							<th class="name_small">
								Section Name
							</th>
							<th class="name_small">
								Day(s)
							</th>
							<th class="univ_name">
								Time(s)
							</th>
							<th class="name_small">
								Location
							</th>
							<th class="name_small">
								Term
							</th>

						</tr>
						<s:iterator value="student_reservations">

							<s:url id="editURL" action="student_view_section.do">
								<s:param name="id" value="Section.id" />
							</s:url>
							<tr>
								<td align="center" class="name_small ">
									<s:checkbox name="deletelist_lab" fieldValue="%{Section.id}" />
								</td>

								<td align="center" class="univ_name">

									<s:property value="Section.labclass.subject" />
								</td>
								<td class="name_small">
									<s:a href="%{editURL}">
										<s:property value="Section.Name" />
									</s:a>
								</td>

								<td class="name_small">
									<s:property value="Section.weeklyday " />
									<br />
									<s:iterator value="Section.weeklySchedules">

										<s:property value="weeklyday" />

										<br />
									</s:iterator>

								</td>
								<td class="univ_name">
									<s:property value="Section.timeDuration" />
									<br />
									<s:iterator value="Section.weeklySchedules">

										<s:property value="timeDuration" />
										<br />
									</s:iterator>
								</td>
								<td class="name_small">
									<s:property value="Section.Location" />
								</td>
								<td class="name_small">
									<s:property value="Section.academicTerm.name" />
									<s:property value="Section.academicYear" />
								</td>
							</tr>
						</s:iterator>
					</table>
				</s:if>
				<s:else>
					<br /> 
You are not currently registered in any Lab classes.
</br>
				</s:else>
				<s:if test="student_workshop_reservation.size() > 0">
					<table cellpadding="5" cellspacing="0" id="manage">
						<tr>
							<th class="name_small"></th>
							<th class="univ_name">
								Workshop Name
							</th>
							<th class="name_small">
								Session Name
							</th>
							<th class="name_small">
								Start Date
							</th>
							<th class="name_small">
								End Date
							</th>
							<th class="univ_name">
								Time
							</th>
							<th class="name_small">
								Location
							</th>
							<th class="name_small">
								Term
							</th>

						</tr>
						<s:iterator value="student_workshop_reservation">
							<tr>
								<s:url id="editURL" action="student_view_session.do">
									<s:param name="id" value="Session.id" />
								</s:url>
								<td align="center" class="name_small ">
									<s:checkbox name="deletelist_workshop"
										fieldValue="%{Session.id}" />
								</td>
								<td class="univ_name">
									<s:property value="Session.workshop.subject" />
								</td>
								<td class="name_small">
									<s:a href="%{editURL}">
										<s:property value="Session.name" />
									</s:a>
								</td>
								<td class="name_small">
									<s:property
										value="%{getText('format.date',{Session.startDate})}" />
								</td>
								<td class="name_small">
									<s:property value="%{getText('format.date',{Session.endDate})}" />
								</td>
								<td class="univ_name">
									<s:property value="Session.timeDuration" />
									<br/>
								</td>
								<td class="name_small">
									<s:property value="Session.location" />
								</td>
								<td class="name_small">
									<s:property value="Session.academicTerm.name" />
									<s:property value="Session.academicYear" />
								</td>
							</tr>
						</s:iterator>
					</table>
				</s:if>
				<s:else>
					<br /> 
You are not currently registered in any Workshops. 
<br />
				</s:else>
				<s:if test="student_workshop_reservation.size() > 0 ">
					<s:submit name="cancel" value="Cancel Selected"
						onclick="return delete_reservations(1);" />
					<s:submit action="student_cancel_all" value="Cancel All"
						onclick="return delete_reservations(1);" />
				</s:if>
				<s:elseif test="student_reservations.size() > 0">
					<s:submit name="cancel" value="Cancel Selected"
						onclick="return delete_reservations(1);" />
					<s:submit action="student_cancel_all" value="Cancel All"
						onclick="return delete_reservations(1);" />

				</s:elseif>
			</s:form>
		</div>
		</div>
		<div id="footer_wrapper">
			<div id="footer">
				<s:property escapeHtml="false" value="#session['footer']" />
				<s:property escapeHtml="false" value="footer" />
			</div>
		</div>
		</div>
	</body>
</html>
