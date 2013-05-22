<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/sbr.tld" prefix="sbr" %>
<%@page import="edu.ucr.c3.wms.helper.validators.BaseValidator"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<c:set var="NOT_SELECTED" value="<%=BaseValidator.NOT_SELECTED%>" scope="request"/>
<c:set var="OTHER_SELECTED" value="<%=BaseValidator.OTHER_SELECTED%>" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/phr_layout.dwt.asp" codeOutsideHTMLIsLocked="false" -->
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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>C3 Health</title>
<!-- InstanceEndEditable -->
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body class="twoColHybLtHdr">
<br />
<div id="container">
  <div id="header">
    <h1>C3 Health</h1>
  </div>
  <div id="sidebar1">
  <!-- end #header -->
  <!-- InstanceBeginEditable name="EditRegion1" --><%@ include file="/sidebar.jsp" %><!-- InstanceEndEditable -->
  
  <!-- end #sidebar1 -->
  </div>
  <br />
  <div id="mainContent">
  <!-- MAIN CONTENT -->
  
  <!-- InstanceBeginEditable name="EditRegion2" -->
    <div class="tab"> 
    <div id="tabHeader">Register</div>    
  	
  	
<s:form action="register_save">
  	<div id="tabContent">
  	<b>User Information</b>
	<table>
	<tr>
	<td>First Name</td><td>Last Name</td>	
	</tr>	
	<tr>
	<td><s:textfield name="fname"/></td>
	<td><s:textfield name="lname"/></td>
	</tr>
	<tr>
	<td>Date of Birth</td><td>Gender</td>	
	</tr>	
	<tr>
	<td><s:textfield name="dob" id="datepicker" 
					   		value="%{getText('format.date',{dob})}"/></td>
	<td><s:select name="sex" list="#{'1':'Male', '0':'Female'}"  
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Sex--" /> </td>
	</tr>
	</table>
	<br/>
    <b>Account Information</b>
	<table>
	<tr>
	<td>Username</td><td>Email</td>	
	</tr>	
	<tr>
	<td><s:textfield name="user"/></td>
	<td><s:textfield name="email"/></td>
	</tr>
	<tr>
	<td>Password</td><td>Re-enter Password</td>	
	</tr>	
	<tr>
	<td><s:textfield name="password"/></td>
	<td><s:textfield name="password2"/></td>
	</tr>
	<tr>
	<td colspan=2>Security Question</td>	
	</tr>
	<tr>
	<td colspan=2><s:select name="questions" list="questionList" 
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Question--" /></td>	
	</tr>	
	<tr>
	<td colspan=2>Answer</td>	
	</tr>
	<tr>
	<td colspan=2><s:textfield name="answer" size="40"/></td>	
	</tr>	
	<tr><td colspan=2>
    	<s:actionmessage />
		<s:fielderror />
		<s:actionerror />	
	</td></tr>
	</table>
    <div class="tabButtons" ><s:submit name="Register!" /> </div>
    </div>
</s:form>






<!-- InstanceEndEditable -->

  <!-- end #mainContent -->
  </div>
  <!-- This clearing element should immediately follow the #mainContent div in order to force the #container div to contain all child floats -->
  <br class="clearfloat" />
  <div id="footer">
    <p>Copyright © 2011 Regents of the University of California. All rights   reserved.</p>
  <!-- end #footer --></div>
<!-- end #container --></div>
</body>
<!-- InstanceEnd --></html>
