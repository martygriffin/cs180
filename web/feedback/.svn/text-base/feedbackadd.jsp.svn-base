	<%@ include file="/public_header.jsp" %>
				<div class="post">
				
				<s:form action="feedback_addFeedback">
				<h3> <s:actionerror /></h3>
				<table border="0" bordercolor="#000000"
				    style="background-color: #fff; color: #000" width="600"
					cellpadding="3" cellspacing="3">
					
				<tr>
				    <td>Name:</td>
				    <td><s:textfield name="name" label="Name:" /></td>
				    <td>Optional</td>
				</tr>
				<tr>
				    <td>Feedback Subject:</td>
				    <td><s:textarea name="reviewName" label="Review Name:" /></td>
				    <td>Required</td>
				</tr>
				<tr>
				    <td>Feedback:</td>
				    <td><s:textarea name="text" label="Feedback Text:" /></td>
				    <td>Required</td>
				</tr>
				<tr>
					<td>Rating</td>
					<td>
					<s:select headerKey="-1" list="ratingList"  name="rating" label="Select a Rating" /></td>
					<td>Required</td>
				</tr>
				<tr>


				
        		</tr>
				
				
				
				
				
				</table>
				
				<script type="text/javascript"
   				 src="http://api.recaptcha.net/challenge?k=<6Lcrys4SAAAAALPLRgPgzwDIrp_13lsfvizhyWPU>">
				</script>
				<noscript>
    			<iframe src="http://api.recaptcha.net/noscript?k=<6Lcrys4SAAAAALPLRgPgzwDIrp_13lsfvizhyWPU>"
        		height="300" width="500" frameborder="0"></iframe><br>
    			<textarea name="recaptcha_challenge_field" rows="3" cols="40">
    			</textarea>
    			<input type="hidden" name="recaptcha_response_field" 
       			 value="manual_challenge">
				</noscript> 
				
				<tr> <td><s:submit /></td> </tr>
				
				</s:form>
				
				</div>
				
			</div>
			<%@ include file="user_feedback_sidebar.jsp" %>
		</div>
	</div>
	
</div>

</body>
</html>
