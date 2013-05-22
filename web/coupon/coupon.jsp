<%@ include file="../header.jsp"%>
<div id="page">
	<div class="inner_copy">
		<div class="inner_copy"></div>
	</div>
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
				<h3>Click Coupon Number for Details </h3>
				<table cellpadding="0" cellspacing="0">
					
					<tr>
						<td>Coupon ID</td>
						<td>Name</td>
						<td>Description</td>
						<td>Coupon Code</td>
						<td>Start Date</td>
						<td>End Date</td>
					</tr>

					<s:iterator value="couponList">
						<tr>

							<td><s:url action="coupon_prepareEdit.do" var="urlTag">
									<s:param name="id">
										<s:property value="couponId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />"><s:property
										value="couponId" /> </a></td>
							<td><s:property value="name" /> 
							<td><s:property value="description" /></td>
							<td><s:property value="couponCode" /></td>
							
							<td><s:date name="startDate"  format="MM/dd/yyyy 'at' hh:mm a"  />
							</td><td><s:date name="endDate"  format="MM/dd/yyyy 'at' hh:mm a"  />
							</td>

						</tr>
					</s:iterator>

				</table>
				
			</div>

		</div>
		<%@ include file="coupon_sidebar.jsp"%>
	</div>
</div>

</div>

</body>
</html>
