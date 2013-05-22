<div id="sidebar">
				<ul>
				
					<li>
						<h2>Order</h2>
						<ul>
							<li><a href="order_unfilled.do">View Unfilled Orders</a></li>
							<li><a href="order_completed.do">View Completed Orders</a></li>
							<li><a href="order_deleted.do">Deleted Orders</a></li>
							
						
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