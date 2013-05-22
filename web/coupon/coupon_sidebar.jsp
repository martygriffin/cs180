<div id="sidebar">
				<ul>
				
					<li>
						<h2>Coupon</h2>
						<ul>
							<li><a href="coupon.do">Add Coupon</a></li>
							<li><a href="coupon_view.do">View Current Coupon</a></li>
							<li><a href="coupon_viewInactive.do">View Deleted Coupons</a></li>
						
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