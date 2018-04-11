<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<h1 align="center">Last Page</h1>
	<form:form method="POST" modelAttribute="userBean" action="/BankClient/addBankInfo.do" >
		
		<pre>
			Bank Name  :    <input type="text" name ="bankName">
			
			Account    :	<input type="text" name ="accountNumber">
			
			SSN        :	<input type="text" name ="ssn">
			
						
						<input type="submit" value ="finish">
			
		
		</pre>
	</form:form>

	

</body>
</html>