<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Registration Page
	<form name='registrationfrm' action="RegistrationServlet" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Re-enter Password:</td>
				<td><input type="password" name="re-enterpassword"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>Male<input type="radio" name="gender" value="male">
					Female<input type="radio" name="gender" value="female"></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><input type="text" name="mobileNumber"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Communication:</td>
				<td>E-mail<input type="checkbox" name="communication"
					value="e-mail"> Mobile Number<input type="checkbox"
					name="communication" value="mobilenumber"> Whatsapp<input
					type="checkbox" name="communication" value="whatsapp"></td>
			</tr>
			<tr>
				<td>Graduation:</td>
				<td><select name=graduation>
						<option value="">select graduation</option>
						<option value="eie">EIE</option>
						<option value="ece">ECE</option>
						<option value="eee">EEE</option>
				</select></td>
			</tr>
			<tr>
				<td>Enter Description:</td>
				<td><textarea rows="5" cols="10" name="description"></textarea></td>
			</tr>
			<tr>
				<td>Attach Resume:</td>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>