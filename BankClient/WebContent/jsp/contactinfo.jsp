<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<h1 align="center">Second Page</h1>
	<form:form method="POST" modelAttribute="userBean" action="/BankClient/addContactInfo.do" >
	
		<pre>
			Address  :  <input type="text" name ="address">
			
			City     :	<input type="text" name ="city">
			
			State    :	<input type="text" name ="state">
			
			Country  :	<input type="text" name ="country">
			
			Phone    :	<input type="text" name ="phone">
						
						
						<input type="submit" value ="next">
		</pre>
	</form:form>
</body>
</html>