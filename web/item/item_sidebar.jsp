<div id="sidebar">
				<ul>
				
					<li>
						<h2>Items</h2>
						<ul>
							<li><a href="item_viewItems.do">View Items</a></li>
							<li><a href="item.do">Add Item</a></li>
							<li><a href="item_viewDeletedItems.do">View Deleted Items</a></li>
							
						
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