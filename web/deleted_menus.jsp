<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">
					<tr>
						<td>Menu ID</td>
						<td>Name</td>
						<td>Description</td>
						<td>Edit</td>
						<td>Set Active</td>
					</tr>

					<s:iterator value="menus">
						<tr>
							<td><s:property value="menuId" /></td>
							<td><s:property value="menuName"/> </td>
						     <td><s:property value="description"/></td>

						     
						     <td><s:url action="menu_popMenuField.do" var="urlTag">
									<s:param name="id">
										<s:property value="menuId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Edit</a></td>
										
							<td><s:url action="menu_menuActive.do" var="urlTag">
									<s:param name="id">
										<s:property value="menuId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Set Active </a></td>
							
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
