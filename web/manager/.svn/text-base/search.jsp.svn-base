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
			href="<%= request.getContextPath() %>/Scripts/jquery/themes/ui-lightness/jquery.ui.all.css" />
		<script type="text/javascript"
			src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.core.js">
		</script>
		<script type="text/javascript"
			src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.widget.js">
		</script>
		<script type="text/javascript"
			src="<%= request.getContextPath() %>/Scripts/jquery/ui/jquery.ui.datepicker.js">
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
				<s:fielderror />
				<s:actionerror />
			</div>
			<s:form action="search.do">
				<table align="left" width="100%" id="addEdit" cellpadding="5">
					<tr>
						<td class="name">
							*Search By:
						
						</td>
						<td class ="fields">
							<s:select label="Class Type:" headerKey="-1"
								headerValue="Select Class Type" list="class_type"
								name="search_class_type" value="search__class_type" />
						</td>
					</tr>
					<tr>
						<td class="name">
							<s:select label="search by student" headerKey="-1"
								headerValue="Select student Filter" list="search_by_student"
								name="search_student_option" value="search__student_option" />
						</td>
						<td id="student">
							<s:textfield name="student_select" />
						</td>
					</tr>

					<tr>
						<td class="name">
							Session/Section Name contains:
						</td>
						<td id="sess">
							<s:textfield name="sess_sect_type_select" />
						</td>
					</tr>
					<tr>
						<td class="name">
							<s:select label="Date Search:" headerKey="-1"
								headerValue="Selecte Date Filter" list="dates" name="search_dates"
								value="search_dates" />
						</td>
						<td id="date">
							<s:textfield name="select_date" id="datepicker"
								value="%{getText('format.date',{startDate})}" />
						</td>
					</tr>
					<tr>
						<td class="name">
						</td>
						<td class ="field">
							<s:select label="Select Term Search:" list="academic_terms"
								headerKey="-1" headerValue="Search By Term " name="search_term"
								value="search_term" />
						</td>

					</tr>
						<tr>
						<td class="name">
						
						</td>
						<td class ="field">
							<s:select label="Status Search:" headerKey="-1"
								headerValue="Search By Status" list="statuses"
								name="search_status" value="search_status" />
						</td>

					</tr>
					

					
					<tr>
						<td class="name">
							Year:


						</td>
						<td class="field">
							<s:textfield name="term_year_select" />
						</td>
					</tr>

					<tr>
						<td class="name">
							Confirmation Number:
						</td>
						<td id="confirm">

							<s:textfield name="confirm_select" />
						</td>
					</tr>
					<tr>
						<td class="name"></td>
						<td class="field">
							<s:submit type="submit" value="Submit" name="submit"
								label="submit" />
							<INPUT TYPE="BUTTON" VALUE="Clear"
								ONCLICK="window.location.href='search.do'">
								<br/>
								*required
								<br/>
								note: all fields that are left blank will be disregarded from the search
						</td>
					</tr>
				</table>
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
