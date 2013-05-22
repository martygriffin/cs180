<%@ include file="../header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">		</div></div>
	<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<s:form action="item_addItem">
				<h3> <s:actionerror /></h3>
				<table border="0" bordercolor="#000000"
				    style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="3">
					
				<tr>
				    <td>Item Name:</td>
				    <td><s:textfield name="name" label="Item Name:" /></td>
				</tr>
				<tr>
				    <td>Description:</td>
				    <td><s:textarea name="description" label="Description:" /></td>
				</tr>
				<tr>
				    <td>Price:</td>
				    <td><s:textfield name="price" label="price:" /></td>
				</tr>
				<tr>
				    <td>Ingredients:</td>
				    <td><s:textarea name="integrdients" label="Ingredients:" /></td>
				</tr>
				<tr>
				    <td>Side:</td>
				    <td><s:checkbox name="isSide" label="Side:" /></td>
				</tr>
				<tr>
				    <td>Drink:</td>
				    <td><s:checkbox name="isDrink" label="Drink:" /></td>
				</tr>
				<tr>
				    <td>Extra Options:</td>
				    <td><s:textarea name="isExtra" label="Extras:" /></td>
				</tr>
				<tr>
				    <td>Fastready:</td>
				    <td><s:checkbox name="isFastready" label="Fastready:" /></td>
				</tr>
				<tr> <td><s:submit /></td> </tr>
				
				
				
				</table>
				
				</s:form>
				
				</div>
				
			</div>
			<%@ include file="item_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
