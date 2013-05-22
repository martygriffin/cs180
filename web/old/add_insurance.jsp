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
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/phr_layout.dwt.asp" codeOutsideHTMLIsLocked="false" -->
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
  <!-- InstanceBeginEditable name="EditRegion1" -->
	<%@ include file="/sidebar.jsp" %>
  <!-- InstanceEndEditable -->
  
  <!-- end #sidebar1 -->
  </div>
  <br />
  <div id="mainContent">
  <!-- MAIN CONTENT -->
   <div class="fltrt">Display: 
  <select name="menu" onChange="location=document.jump.menu.options[document.jump.menu.selectedIndex].value;" value="GO">
  <option value="http://google.com">Summary</option>
  <option value="http://google.com">Current</option>
  <option value="http://google.com">Past</option>
  <option value="http://google.com">All</option>
  </select>  
  </div>

  <br /><br />
  
  <!-- InstanceBeginEditable name="EditRegion2" --> 
    <div class="tab">  

  	<div id="tabHeader">Add New Insurance</div> 

    <div id="tabAdd"><a href="default_test.do"><font color="#F90"><b>&lt;&lt;</b></font> Return to C3 Health</a></div>    

	<div id="tabContent">

    <ul>
<s:form action="insurance_save">
  	<li>Company Name:<br /><s:textfield name="company"/></li>
  		<li>What is your Plan name:<br /><s:textfield name="plan_name"/></li>
  		<li>What is your Plan ID:<br /><s:textfield name="plan_id"/></li>
  		<li>What is your Group Number:<br /><s:textfield name="group_num"/></li>
  			<li>What is your Member Number:<br /><s:textfield name="member_num"/></li>
  				<li>What is your Policy Number:<br /><s:textfield name="policy_num"/></li>
  					<li>What is your Insurance Companies Phone Number:<br /><s:textfield name="phone"/></li>
 

  	<li>Is this Insurance current? <br />
  	<s:radio name="is_current_problem" value="is_current_problem" list="current_probelm"/>
  	</li>

    <li>

    	<div style="position:relative;">
    	
        	<div width="50%" style="float:left;width:50%">Start Date<br /><s:textfield name="start_date" id="datepicker" 
					   		value="%{getText('format.date',{start_date})}"/></div><br/>
			<div width="50%" style="float:left;width:50%">End Date<br /><s:textfield name="end_date" id="datepicker2" 
					   		value="%{getText('format.date',{end_date})}"/></div><br/>
     </div>	
    </li>
    <li>
    <s:hidden name="id" />
    <br/>
     <div class="tabButtons"><s:submit name="Save" />  
     <s:if test="!company.isEmpty()">
    
     <s:submit action="insurance_delete" value="Delete" /></div>
   	</s:if>
   	</li>
	</s:form>
    </ul>

   

	</div>

  </div>
  
    	
    <div class="tabButtons">  </div>
   
	</div>
  </div><!-- InstanceEndEditable -->

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