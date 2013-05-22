<%@ include file="../header.jsp"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<head>
  <title>My page</title>
  <sx:head/>
</head>
<div id="page">
	<div class="inner_copy">
		<div class="inner_copy"></div>
	</div>
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
				<h2> Add a Reservation</h2>
				<s:form action ="reservations_addReservation">
				<h3> <s:actionerror /></h3>
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="3">
						<tr><td>Customer Name</td>
						<td><s:textfield name="name" label="name" /></td> </tr>
						<tr><td>Table</td>
						<td><s:textfield name="tableNumber" label="tableNumber" /></td></tr>						
						<tr><td>Date</td>
						<td><sx:datetimepicker name="date" displayFormat="yyyy-MM-dd"  /></td></tr>
						<tr><td>Time</td>
						<td><sx:datetimepicker name="time" type="time" displayFormat="hh-mm"  /></td></tr>
						<tr><td>Duration</td>
						<td><s:textfield name="duration" label="duration" /></td></tr>
						<tr><td>Group Size</td>
						<td><s:textfield name="groupSize" label="groupSize" /></td></tr>
						<tr><td>Special Requests</td>
						<td><s:textfield name="specialRequests" label="requests" /></td></tr>

		
					
					
					
					<tr>
					<td>	
						<s:submit /> </td>
						</tr>
				</table>
				</s:form>

			</div>

		</div>
		<%@ include file="reservations_sidebar.jsp"%>
	</div>
</div>

</div>

</body>
</html>
