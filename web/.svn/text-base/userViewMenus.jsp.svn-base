<%@ include file="public_header.jsp" %>
				<div class="post">
				<table cellpadding="0" cellspacing="0">
					<tr>
						
						<td>Name</td>
						<td>Description</td>
					
					</tr>

					<s:iterator value="menus">
						<tr>
							
							<td><s:property value="menuName"/> </td>
						     <td><s:property value="description"/></td>

						   
							<td><s:url action="menu_viewItems.do" var="urlTag">
									<s:param name="id">
										<s:property value="menuId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">View Items </a></td>
							
						</tr>
					</s:iterator>

				</table>
				
					
				
				
				</div>
				
			</div>
			<%@ include file="sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
