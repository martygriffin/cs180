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
				<h2> Edit Coupon</h2>
				<s:form action ="coupon_edit">
				<h3> <s:actionerror /></h3>
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="3">
						<tr><td>Coupon Name</td>
						<td><s:textfield name="name" label="name" /></td> </tr>
						<tr><td>Description</td>
						<td><s:textfield name="description" label="desceiptionr" /></td></tr>						
						<tr><td>Start Date</td>
						<td><sx:datetimepicker name="startDate" displayFormat="yyyy-MM-dd"  /></td></tr>
						<tr><td>End Date</td>
						<td><sx:datetimepicker name="endDate" displayFormat="yyyy-MM-dd"  /></td></tr>
						<tr><td>Number of Uses</td>
						<td><s:textfield name="numUses" /></td></tr>
						<tr>
						<td>Discount Type</td>
						<td><s:select id="discount" label="Select Discount Type" 
		headerKey="$ Amount Off" headerValue="$ Amount Off"
		list="#{'$ Amount Off':'$ Amount Off', '% Off':'% Off'}" 
		name="discount_type" /></td></tr>
	
		
		<tr><td>Discount Value(type percentage as decimal)</td>
						<td><s:textfield name="discount_value"/></td></tr>
		<tr><td>Coupon Code</td>
						<td><s:textfield name="coupon_code"/></td></tr>
		<tr>
		<td>Requirement Type(type in Item name for Item Name)</td>
		<td><s:select label="Select Requirement Type" 
		headerKey="Spent a certain Amount" headerValue="Spent a certain Amount"
		list="#{'Spent a certain Amount':'Spent a certain Amount', 'Ordered Certain Item':'Ordered Certain Item'}" 
		name="requirement_type" /></td></tr>
	
		<tr>
			
		<td>Requirement Value</td>
						<td><sx:autocompleter size="1" list="items" name="requirement_value" /></td>	</tr>
		<!-- add if statment to display drop down of items or field -->
					
					<tr>
					
					<td>	
						<s:submit /> </td>
						</tr>
				</table>
				
				</s:form>
<s:if test="%{current_coupon.isActive==true}">
			<s:url action="coupon_delete.do" var="urlTag2">
					<s:param name="id">
						<s:property value="current_coupon.couponId" />
					</s:param>
				</s:url>
				<a href="<s:property value="#urlTag2" />">Delete Order</a>
				</s:if>
				<s:else>
				<s:url action="coupon_undelete.do" var="urlTag3">
					<s:param name="id">
						<s:property value="current_coupon.couponId" />
					</s:param>
				</s:url>
					<a href="<s:property value="#urlTag3" />">Undelete Order</a>
				
				</s:else>
			</div>

		</div>
		<%@ include file="coupon_sidebar.jsp"%>
	</div>
</div>

</div>

</body>

</html>
