<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	PersonalDetails Page
	<form name="PersonalDetailsfrm" action="#" method="post">
		<table>
			<tr>
				<td>First name<input type="text" name="firstName"> Last
					name<input type="text" name="lastName"></td>
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
				<td><font color='red' size='2'>Academic Details</font></td>
			</tr>
			<tr>
				<td>10th</td>
				<td>School Name<input type="text" name="schoolName">
					Year of Passing<input type="text" name="yearofpassing">
					Percentage<input type="text" name="percentage"></td>
			</tr>
			<tr>
				<td>12th</td>
				<td>College Name<input type="text" name="collegeName">
					Year of Passing<input type="text" name="yearofpassing">
					Percentage<input type="text" name="percentage"></td>
			</tr>
			<tr>
			<td>College:</td>
			<td><select name=collegename>
					<option value="">select college</option>
					<option value="srm">SRM</option>
					<option value="vit">VIT</option>
					<option value="vnr">VNR</option></select>
					<select name=branch>
						<option value="">select branch</option>
						<option value="eie">EIE</option>
						<option value="ece">ECE</option>
						<option value="eee">EEE</option></select></td>
						<td> Year of Passing
						<input type="text" name="yearofpassing"> Percentage
						<input type="text" name="percentage"></td>
				
			</tr>
		</table>
	</form>
</body>
</html>