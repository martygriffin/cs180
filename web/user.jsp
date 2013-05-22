<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">		</div></div>
	<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">
					<tr>
						<td>Username</td>
						<td>Email</td>
						<td>Name</td>
						<td>Address</td>
						<td>City</td>
						<td>State</td>
						<td>Phone</td>
						<td>Zip</td>
						<td>Set Inactive</td>
						<td>Edit</td>
					</tr>

					<s:iterator value="adminlist">
						<tr>
							<td><s:property value="username" /></td>
							<td><s:property value="email"/> </td>
						    <td><s:property value="firstName"/>&nbsp;
						         <s:property value="lastName"/> </td>
						    <td><s:property value="address"/></td>
						    <td><s:property value="city"/> </td>
						    <td><s:property value="state"/> </td>
						    <td><s:property value="phone"/></td>
						    <td><s:property value="zip"/></td>    

						     <td><s:url action="user_adminInactive.do" var="urlTag">
									<s:param name="id">
										<s:property value="userId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Set Inactive</a></td>
										
							<td><s:url action="user_popUserField.do" var="urlTag">
									<s:param name="id">
										<s:property value="userId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Edit</a></td>
										
							
						</tr>
					</s:iterator>

				</table>
					
				
				
				</div>
				
			</div>
			<%@ include file="user_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
