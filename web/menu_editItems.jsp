<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">
				<tr>
				<td>Item Name</td>
				
				<td></td>
				</tr>
				<s:iterator value="itemList" >
				<tr>
				<td><s:property value="item.name" /></td>
				<td><s:url action="menu_deleteItem.do" var="urlTag">
									<s:param name="id">
										<s:property value="menuItemId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Delete Item</a></td>
				</tr>
			</s:iterator>
				</table>
				
					
				
				
				</div>
				
			</div>
			<%@ include file="menu_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
