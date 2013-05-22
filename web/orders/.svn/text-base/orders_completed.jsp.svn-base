<%@ include file="../header.jsp"%>
<div id="page">
	<div class="inner_copy">
		<div class="inner_copy"></div>
	</div>
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
		<h3>Click Order Number for Details </h3>
			<table cellpadding="0" cellspacing="0">
					<tr>
						<td>Order ID</td>
						<td>Customer Name</td>
						<td>Is To-Go</td>
						<td>Is Delivery</td>
						<td>Status</td>
						<td>Order Time</td>
					</tr>

					<s:iterator value="order_list">
						<tr>

							<td><s:url action="order_details.do" var="urlTag">
									<s:param name="id">
										<s:property value="orderId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />"><s:property
										value="orderId" /> </a></td>
							<td><s:property value="user.firstName" /> &nbsp; <s:property
									value="user.lastName" /></td>
							<td><s:property value="isTogo" /></td>
							<td><s:property value="isDelivery" /></td>
							<td><s:property value="status" /></td>
							<td><s:property value="ordertime" /></td>

						</tr>
					</s:iterator>

				</table>

			</div>

		</div>
		<%@ include file="order_sidebar.jsp"%>
	</div>
</div>

</div>

</body>
</html>
