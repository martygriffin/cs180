		<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				<s:form action="menu_edit">
					<h3> <s:actionerror /></h3>
				<table border="0" bordercolor="#000000" style="background-color:#fff" width="300" cellpadding="3" cellspacing="3">
				<tr>
				<td>Name:</td>
				<td><s:textfield name="menuName" /></td>
				</tr>
				<tr>
				<td>Description:</td>
				<td><s:textarea name="description"  /></td>
				</tr>
				<tr>
				<td>
				<s:submit /></td>
				</tr>
				</table>
				
				</s:form>
				<s:url action="menu_getItems.do" var="urlTag">
									<s:param name="id">
									<s:property value="#session['id']" />
									</s:param>
				</s:url> <a href="<s:property value="#urlTag" />">Add Items</a>
									<s:url action="menu_editItems.do" var="urlTag">
									<s:param name="id">
										<s:property value="#session['id']" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Edit Items</a>
				<h2> Items on Menu:</h2> <br/>
					<table border="0" bordercolor="#000000" style="background-color:#fff" width="300" cellpadding="3" cellspacing="3">
					<tr>
					
					</tr>
					<s:iterator value="#session['itemList']">
					<tr>
					<td><h3><s:property value="item.name" /></h3></td>
					
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
		