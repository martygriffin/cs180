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
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>

<body onLoad="P7_Uberlink('uberlink','nav')">
<div id="container">
	<div id="masthead">
		<img alt="" src="<%= request.getContextPath() %>/images/managerheader.jpg" width="940" height="55" border="0" usemap="#Map" />
		<map name="Map" id="Map">
  			<area shape="rect" coords="5,16,168,50" href="http://www.ucr.edu/" alt="UCR Homepage" />
  		</map>
 		<div id="title">
			<div id="department">Workshop Management System</div>
			<div id="service">Administration</div>
    	</div>
	</div>
	<div id="content">
    <h2>WMS: Administrator and Manager Login</h2>
<div id="mainContentNoSidebar">
<div align="center">
				<s:actionmessage />
				<s:fielderror />
				<s:actionerror />
</div>
  <s:form action="login">   
      <table width="100%" cellpadding="5">
          <tr>
              <td align="right" width="50%">Manager ID:</td>
              <td align="left" width="50%"><s:textfield name="name" />
          </tr>
          <tr>
              <td align="right">Password:</td>
              <td align="left"><s:password name="password" />
          </tr>
          <tr>
              <td></td><td align="left"><s:submit name="Submit" /></td>
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
