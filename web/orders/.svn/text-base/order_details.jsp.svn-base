<%@ include file="../header.jsp"%>
<div id="page">
	<div class="inner_copy">
		<div class="inner_copy"></div>
	</div>
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
						<h2>Order <s:property value="current_order.orderId" /></h2>		
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td>Order ID</td>
						<td>Order Password</td>
						<td>Customer Name</td>
						<td>Is To-Go</td>
						<td>Is Delivery</td>
						<td>Status</td>
						<td>Order Time</td>
						<td>Coupon</td>
						
					</tr>


					<tr>

						<td><s:property value="current_order.orderId"/> </td>
						<td><s:property value="current_order.orderPassword" /></td>
						<td><s:property value="current_order.user.firstName" />
							&nbsp; <s:property value="current_order.user.lastName" /></td>
						<td><s:property value="current_order.isTogo" /></td>
						<td><s:property value="current_order.isDelivery" /></td>
						<td><s:property value="current_order.status" /></td>
						<td><s:date name="current_order.ordertime"  format="MM/dd/yyyy 'at' hh:mm a"  /></td>
						<td><s:property value="current_order.coupon.name"  /></td>

					</tr>


				</table>

				<h2>Items</h2>
					<table border="0" bordercolor="#000000"
					style="padding-left:100px; padding-top:30px; background-color: #fff; color: #000"
					width="650" cellpadding="7" cellspacing="3">

					<tr>
						<td>Item Names</td>
						<td>Description</td>
						<td>Side</td>
						<td>Drink</td>
						<td>FastReady</td>
						<td>Price</td>
					</tr>

					<s:iterator value="item_list">
					<tr>
							<td><s:property value="name" />
							</td>
							<td><s:property value="description" />
							</td>
							<td><s:property value="isSide" />
							</td>
							<td><s:property value="isDrink" />
							</td>
							<td><s:property value="isFastready" />
							</td>
							<td><s:property value="price" />
							</td>

					
					
					
				</tr>
				</s:iterator>
				</table>
					<s:if test="%{!#customList.isEmpty()}" >
				<h3>Customizations</h3>
				<table border="0" bordercolor="#000000"
					style="padding-left:100px; padding-top:30px; background-color: #fff; color: #000"
					width="650" cellpadding="7" cellspacing="3">

					<tr>
						<td>Item Name</td>
						<td>Description</td>
						<td>Price</td>
					</tr>
					
					<tr>
						<s:iterator value="customList">
							<td><s:property value="item.name" />
							</td>
							<td><s:property value="description" />
							</td>
							<td><s:property value="price" />
							</td>


						</s:iterator>
					</tr>
				</table>
				</s:if>
				<s:if test="%{current_order.coupon !=null}" >
				<h3>Coupon Used</h3>
				<table border="0" bordercolor="#000000"
					style="padding-left:100px; padding-top:30px; background-color: #fff; color: #000"
					width="650" cellpadding="7" cellspacing="3">

					<tr>
						<td>Coupon Name</td>
						<td>Description</td>
						<td>Discount Type</td>
						<td>Discount Value</td>
					</tr>
					
					<tr>
						<td><s:property value="current_order.coupon.name" /></td>
						<td><s:property value="current_order.coupon.description" /></td>
						<td><s:property value="current_order.coupon.discountType" /></td>
							<td><s:property value="current_order.coupon.discountValue" /></td>
					</tr>
				</table>
				</s:if>
				<div style="padding-left:600px;">
					<h2>
						Total:
						<s:property value="total" />
					</h2>
				</div>
				<s:url action="order_markComplete.do" var="urlTag">
					<s:param name="id">
						<s:property value="current_order.orderId" />
					</s:param>
				</s:url>
				<s:url action="order_delete.do" var="urlTag2">
					<s:param name="id">
						<s:property value="current_order.orderId" />
					</s:param>
				</s:url>
				<s:if test="%{current_order.isDelivery==true}">
				<h3>Address for Delivery</h3>
				<s:property value="current_order.user.address" /> <br/>
				<s:property value="current_order.user.city" />,
				 <s:property value="current_order.user.state" /> &nbsp; 
				 <s:property value="current_order.user.zip" /> <br/>
				 Phone:<s:property value="current_order.user.phone" /> <br/>
				
				
				</s:if>
				
				<s:if test="%{current_order.isActive==true}">
				<a href="<s:property value="#urlTag" />">Change Order Status</a><br/>
				<a href="<s:property value="#urlTag2" />">Delete Order</a>
				</s:if>
				<s:else>
				<s:url action="order_undelete.do" var="urlTag3">
					<s:param name="id">
						<s:property value="current_order.orderId" />
					</s:param>
				</s:url>
					<a href="<s:property value="#urlTag3" />">Undelete Order</a>
				
				</s:else>
				
			</div>

		</div>
		<%@ include file="order_sidebar.jsp"%>
	</div>
</div>

</div>

<body><br> </body>
</html>
