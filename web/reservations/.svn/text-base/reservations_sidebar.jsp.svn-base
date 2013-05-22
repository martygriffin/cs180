<div id="sidebar">
				<ul>
				
					<li>
						<h2>Reservations</h2>
						<ul>
							<li><a href="reservations_makeReservation.do">Make Reservation</a></li>
							<li><a href="reservations_currentReservations.do">View Current Reservations</a></li>
							<li><a href="reservations_pastReservations.do">View Past Reservations</a></li>
						
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