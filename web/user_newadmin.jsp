<%@ include file="header.jsp" %>
	<div id="page"><div class="inner_copy"><div class="inner_copy">		</div></div>
	<div id="page-bgtop">
			<div id="content">
				<div class="post">
				
				<s:form action="user_addAdmin">
					<h3> <s:actionerror /></h3>
				<table border="0" bordercolor="#000000"
				    style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="3">
					
				<tr>
				    <td>Username:</td>
				    <td><s:textfield name="username" label="Username:" /></td>
				</tr>
				<tr>
				    <td>Password:</td>
				    <td><s:textfield name="password" label="Password" /></td>
				</tr>
				<tr>
				    <td>Email:</td>
				    <td><s:textfield name="email" label="email" /></td>
				</tr>
				<tr>
				    <td>First Name:</td>
				    <td><s:textfield name="firstName" label="firstName" /></td>
				</tr>
				<tr>
				    <td>Last name:</td>
				    <td><s:textfield name="lastName" label="lastName" /></td>
				</tr>
				<tr>
				    <td>Address:</td>
				    <td><s:textarea name="address" label="address" /></td>
				</tr>
				<tr>
				    <td>City:</td>
				    <td><s:textarea name="city" label="city" /></td>
				</tr>
				<tr>
				    <td>State:</td>
				    <td><s:textarea name="state" label="state" /></td>
				</tr>
				<tr>
				    <td>Phone Number:</td>
				    <td><s:textarea name="phone" label="phone" /></td>
				</tr><tr>
				    <td>Zip:</td>
				    <td><s:textarea name="zip" label="zip" /></td>
				</tr>
				
				<tr> <td><s:submit /></td> </tr>
				
				
				
				</table>
				
				</s:form>
				
				</div>
				
			</div>
			<%@ include file="user_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
