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
<sx:head/>
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<%@ include file="/masthead.jsp" %>
		<div id="headerContainer">
        	<div id="header"><h1>
				<s:if test="%{manId == -1}">Add</s:if>
        		<s:else>Edit</s:else>
				Manager<br />
        	</h1></div>
        	<div id="userInfo"><p>You are logged in as <strong><s:property value="#session['loggedInUser']"/></strong>
        	<input type="button" onclick="location.href='logout.do'" value="Log Out" /></p></div>
    	</div>
    	<%@ include file="/admin/admin_sidebar.jsp"%>
		<div id="mainContent">
			<div align="center">
				<s:fielderror />
				<s:actionerror />
			</div>
			<s:form action="/admin/manager_save">
				<s:hidden name="manId" />
				<table width="100%" id="addEdit" cellpadding="5">
					<tr>
						<td class="name">*Department Name:</td>
						<td class="field"><s:select name="deptId" list="depts" listKey="id" listValue="name" 
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Department--" /></td>
					</tr>
					<tr>
						<td class="name">*User Name:</td>
						<td class="field"><s:textfield name="userName"/></td>
					</tr>
					<tr>
						<td class="name">*Password:</td>
						<td class="field"><s:textfield name="password"/></td>
					</tr>
					<tr>
						<td class="name">*First Name:</td>
						<td class="field"><s:textfield name="firstName"/></td>
					</tr>
					<tr>
						<td class="name">*Last Name:</td>
						<td class="field"><s:textfield name="lastName"/></td>
					</tr>
					<tr>
						<td class="name">*Email:</td>
						<td class="field"><s:textfield name="email"/></td>
					</tr>
					<tr>
						<td class="name">*Telephone:</td>
						<td class="field"><s:textfield name="telephone"/></td>
					</tr>
					<tr>
						<td class="name">Comments:</td>
						<td class="field"><s:textarea rows="5" cols="30" name="comments"/></td>
					</tr>
				    <tr><td></td>
				    	<td colspan="2"><s:submit name="save" value="Save"/>
				    		<input type=button onClick="location.href='/wms/admin/view_managers.do'" value='Cancel'></input>
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