<%@ include file="../header.jsp"%>
<div id="page">
	<div class="inner_copy">
		<div class="inner_copy"></div>
	</div>
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td>Reservation ID</td>
						<td>Customer Name</td>
						<td>Table</td>
						<td>DateTime</td>
						<td>Duration</td>
						<td>Group Size</td>
						<td>Special Requests</td>
						<td>Edit</td>
						<td>Set Active</td>
					</tr>
					<s:iterator value="r_list">
						<tr>

							<td><s:property value="reservationId" />
							</td>
							<td><s:property value="name" /> 
							</td>
							<td><s:property value="tableNumber" />
							</td>
							<td><s:property value="dateTime" />
							</td>
							<td><s:property value="duration" />
							</td>
							<td><s:property value="groupSize" />
							</td>
							<td><s:property value="SpecialRequests" />
							</td>
							<td><s:url action="reservations_popReservationField.do" var="urlTag">
									<s:param name="id">
										<s:property value="reservationId" />
									</s:param>
							</s:url> <a href="<s:property value="#urlTag" />">Edit</a></td>
										
							<td><s:url action="reservations_reservationActive.do" var="urlTag">
									<s:param name="id">
										<s:property value="reservationId" />
									</s:param>
							</s:url> <a href="<s:property value="#urlTag" />">Set Active</a></td>
							
						</tr>
					</s:iterator>

				</table>

			</div>

		</div>
		<%@ include file="reservations_sidebar.jsp"%>
	</div>
</div>

</div>

</body>
</html>
