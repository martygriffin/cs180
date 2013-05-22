<%@ include file="../header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">
					<tr>
						<td>Social ID</td>
						<td>Name</td>
						<td>Html</td>
						<td>Edit</td>
						<td>Set Inactive</td>
					</tr>

					<s:iterator value="social_list">
						<tr>
							<td><s:property value="socailId" /></td>
							<td><s:property value="title"/> </td>
						     <td><s:property value="link"/></td>

						     
						     <td><s:url action="social_popEditFields" var="urlTag">
									<s:param name="id">
										<s:property value="socailId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Edit</a></td>
										
							<td><s:url action="social_setInactive.do" var="urlTag">
									<s:param name="id">
										<s:property value="socailId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Set Inactive </a></td>
							
						</tr>
					</s:iterator>

				</table>
				
					
				
				
				</div>
				
			</div>
			<%@ include file="social_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
