<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
		<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<s:form action="menu_Items">
				<h3> <s:actionerror /></h3>
				<s:select label="What's your favor search engine" 
		headerKey="-1" headerValue="Add an Item"
		list="items" 
		name="selectedItem" 
		value="1" />
                      
        
					   <s:submit name = "submit" />
			  </s:form>
					
				
				
				</div>
				
			</div>
			<%@ include file="menu_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
