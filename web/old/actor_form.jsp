<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/sbr.tld" prefix="sbr" %>
<%@page import="edu.ucr.c3.wms.helper.validators.BaseValidator"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<c:set var="NOT_SELECTED" value="<%=BaseValidator.NOT_SELECTED%>" scope="request"/>
<c:set var="OTHER_SELECTED" value="<%=BaseValidator.OTHER_SELECTED%>" scope="request"/>

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
  	<div id="tabHeader"><s:if test="%{actorId >= 0}">Edit <s:property value="fname"/>'s </s:if><s:else>Add</s:else> Profile <!-- Edit [name]'s Profile --></div>    
	<div id="tabAdd"><a href="login.jsp"><font color="#F90"><b>&lt;&lt;</b></font> Return to C3 Health</a></div>  
	<div id="tabContent">
<s:form action="actor_save">
<table>
	 <s:hidden name="actorId" />
  	 <tr><td class="tblCol1"><b>First Name:</b></td> <td><s:textfield name="fname" /></td></tr>
  	 <tr><td class="tblCol1"><b>Last Name:</b></td> <td><s:textfield name="lname" /></td></tr>
  	 <tr><td class="tblCol1"><b>Email:</b></td> <td><s:textfield name="email" /></td></tr> 
<tr><td class="tblCol1"><b>Date of Birth:</b></td> <td> <s:textfield name="dob" id="datepicker" 
					   		value="%{getText('format.date',{dob})}"/> </td></tr> 
     <tr><td class="tblCol1"><b>Bloodtype:</b> </td> <td><s:select name="btype" list="btypeList" 
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Blood Type--" /> </td></tr>
	 <tr><td class="tblCol1"><b>Sex:</b> </td> <td><s:select name="sex" list="#{'1':'Male', '0':'Female'}"  
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Sex--" /> </td></tr>
     <tr><td class="tblCol1"><b>Race:</b> </td> <td><s:select name="race" list="raceList"  
							headerKey="%{#request.NOT_SELECTED}" headerValue="--Select Race--" /> </td></tr>  
     
</table>

    	<s:actionmessage />
		<s:fielderror />
		<s:actionerror />
    <div class="tabButtons"><s:submit name="Save" /> <s:if test="%{!actorId.equals(-1)}"><s:submit action="actor_delete" value="Delete" /></s:if></div>
    </s:form>
	</div>
  	</div>
  	
  	
<s:if test="%{actorId > 0}">
  	    <div class="tab"> 
    <div id="tabHeader">Account Information<br /></div>
<s:form action="actor_account_save">
  	<div id="tabContent">Modify account settings here.<br/><br/>
	<table>
	<tr>
	<td><strong>Username</strong></td><td><strong>Email</strong></td>	
	</tr>	
	<tr>
	<td><s:textfield name="user"/></td>
	<td><s:textfield name="email"/></td>
	</tr>
	<tr>
	<td><strong>Current Password</strong></td><td><strong>New Password</strong></td>	
	</tr>	
	<tr>
	<td><s:password name="password"/></td>
	<td><s:password name="newpass"/></td>
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
</div>
</s:if>
  
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
