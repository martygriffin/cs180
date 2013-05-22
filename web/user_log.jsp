<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">		</div></div>
	<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">
					<tr>
						<td>ID</td>
						<td>Text</td>
						<td>Timestamp</td>
					</tr>

					<s:iterator value="site_log">
						<tr>
							<td><s:property value="logId" /></td>
							<td><s:property value="text" /></td>
								<td><s:property value="datetime" /></td>
						
										
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
