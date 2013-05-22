<div id="sidebar">

				<ul>
					
					<li>
						
						<ul>
						
						<s:iterator value="Sidebar">
						<li><center><s:property escape= "false" value="link" /></center> </li>
						
						</s:iterator>
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