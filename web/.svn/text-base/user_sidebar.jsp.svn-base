<div id="sidebar">
				<ul>
				
					<li>
						<h2>Admins</h2>
						<ul>
							<li><a href="user_newadmin.jsp">Add Admin</a></li>
							<li><a href="user_viewAdmins.do">View Admins</a></li>
							<li><a href="user_viewInactiveAdmins.do">View Inactive Admins</a></li>
							<li><a href="user_viewLog.do">View Site Log</a></li>
							
						
						</ul>
					</li>
						<li>
					<s:if test="%{#session['loggedInUser'] != null}">
    <h2>Logged in as <br/>
   
   <s:property value="#session['loggedInUser'].firstName" /> &nbsp;
      <s:property value="#session['loggedInUser'].lastName" /><br/> 
     <s:form action="logout" >
     <s:submit value="Logout" name = "Logout" />
     </s:form>
    </s:if></h2>
    </li>
					
				</ul>
			</div>
			<div style="clear:both;"></div>