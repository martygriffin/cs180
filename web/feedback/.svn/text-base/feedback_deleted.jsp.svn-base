<%@ include file="../header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<table border="0" bordercolor="#000000"
					style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="5">


					<s:iterator value="feedback">
						<tr>
						<td>Customer Name: <s:property value="name" />&nbsp;&nbsp;&nbsp; Rating: <s:property value="rating" /></td>
						</tr>
						<tr>
						<td>Feedback Subject: <s:property value="reviewName"/> </td>
						</tr>
						<tr>
						<td>Feedback: <s:property value="text"/> </td>
						</tr>
						<tr>
							<td><s:url action="feedback_feedbackInactive.do" var="urlTag">
									<s:param name="id">
									<s:property value="feedbackId" />
									</s:param>
								</s:url> <a href="<s:property value="#urlTag" />">Undelete</a></td>
							
						</tr>
						<tr><td> &nbsp;</td></tr>
					</s:iterator>

				</table>
				
					
				
				
				</div>
				
			</div>
			<%@ include file="feedback_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
