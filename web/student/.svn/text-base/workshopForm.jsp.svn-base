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
					Workshop Signup
					<br />
				</h1>
			</div>
			<div id="userInfo">
				<s:if test="%{#session['netID']!=null}">
					<p>
						You are logged in as
						<strong><s:property value="#session['netID']" /> </strong>
						<input type="button" value="Log Out"
							onclick="window.location.href='logout.do'" />
					</p>
				</s:if>
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
				${workshop_name}
			</h3>
			<br />
			<div id="error">
				<s:fielderror />

			</div>
			<s:if test="all_sessions.size>0">
				<s:form action="addworkshop_workshop_save.do">
					<table align="left" width="100%" id="addEdit" cellpadding="5">
						<s:if test="%{#session['netID']==null}">
							<tr>
								<td class="name">
									*netID:
								</td>
								<td class="field">
									<s:textfield label="netID" key="netID" size="10" />
								</td>
							</tr>
							<tr>
								<td class="name">
									*SID:
								</td>
								<td class="field">
									<s:password label="SID" key="SID" size="10" />
								</td>
							</tr>
						</s:if>

						<tr>

							<td class="name">
								*Session:
							</td>
							<td class="field">
								<s:select label="Session" name="seshID" listKey="id"
									list="all_sessions" required="true" />
							</td>
						</tr>

						<tr>
							<td class="name"></td>
							<td class="field">
								<s:submit type="submit" value="Submit" name="submit"
									label="submit" />
								<INPUT TYPE="BUTTON" VALUE="Clear"
									ONCLICK="window.location.href='student_make_reservation.do'">
							</td>
						</tr>
						<tr>
							<td class="name"></td>
							<td class="field">
								* denotes required field
							</td>
						</tr>
						<tr>
							<td class="name">
								Not Registered?
							</td>
							<td class="field">
								<s:a href="addstudent_input.do">Click here</s:a>
							</td>
						</tr>

					</table>
				</s:form>
			</s:if>

			<s:else>There are currently no available sessions</s:else>

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
