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
		<!-- InstanceBeginEditable name="head" -->
		<!-- InstanceEndEditable -->
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
					Section Details
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

			<h3>
				${this_section.labclass.subject}
			</h3>
			<h4>
				${this_section.name}
			</h4>
			Term:&nbsp; ${this_section.academicTerm.name}&nbsp;
			${this_section.academicYear}
			<br />
			<s:if test="this_seection.endDate.equals(this_section.startDate)">
			Date: &nbsp;${this_section.startDate.month +1}
			/${this_section.startDate.date} /${this_section.startDate.year +1900}
			<br />
			</s:if>
			<s:else>
			Start Date: &nbsp;${this_section.startDate.month +1}
			/${this_section.startDate.date} /${this_section.startDate.year +1900}
			End Date: &nbsp;${this_section.endDate.month +1}
			/${this_section.endDate.date} /${this_section.endDate.year +1900}
			<br />
			</s:else>
			Weekday(s) and time(s):
			<br />
			${this_section.weeklyday}&nbsp;from
			&nbsp;${this_section.timeDuration}
			<s:iterator value="this_section.weeklySchedules">
				<br />
				<s:property />
			</s:iterator>

			<br />

			Location: &nbsp;${this_section.location}
			<br />
			Confirmation Number:&nbsp; ${confirm_number}
			<br />
			Comments: &nbsp;${this_section.comments}
			<br />
			<form>
				<s:url id="editURL" action="addlab_delete">
					<s:param name="id" value="id" />
				</s:url>
				<INPUT TYPE="BUTTON" VALUE="View Reservations"
					ONCLICK="window.location.href='student_view_reservations.do'">
					<br />
					<s:a href="%{editURL}" onclick="return delete_reservations(1);">Cancel Reservation</s:a>
					<br />
			</form>

			<br />
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
