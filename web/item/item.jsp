<%@ include file="../header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">
					<tr>
						<td>Item ID</td>
						<td>Name</td>
						<td>Description</td>
						<td>Price</td>
						<td>Ingredients</td>
						<td> Side </td>
						<td> Drink  </td>
						<td>  Extra </td>
						<td>  Fastready </td>
						<td>Edit</td>
						<td>Set Inactive</td>
					</tr>

					<s:iterator value="items">
						<tr>
							<td><s:property value="itemId" /></td>
							<td><s:property value="name"/> </td>
						     <td><s:property value="description"/></td>
						     <td><s:property value="price"/></td>
						     <td><s:property value="ingredients"/></td>
						     <td><s:property value="isSide"/></td>
						     <td><s:property value="isDrink"/></td>
						     <td><s:property value="isExtra"/></td>
						     <td><s:property value="isFastready"/></td>
						     
						     <td><s:url action="item_popItemField.do" var="urlTag">
									<s:param name="id">
										<s:property value="itemId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Edit</a></td>
										
							<td><s:url action="item_itemInactive.do" var="urlTag">
									<s:param name="id">
										<s:property value="itemId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Set Inactive</a></td>
							
						</tr>
					</s:iterator>

				</table>
				
					
				
				
				</div>
				
			</div>
			<%@ include file="item_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
