<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<form action="savedata1">
<center>
<table>
<tr><td>Name</td><td><input type="text" name="name"></td></tr>
<tr><td>contact no.</td><td><input type="text" name="mobile"></td></tr>
<tr><td>Email</td><td><input type="text" name="email"></td></tr>
<tr><td>Country</td><td><select name="country" >
<option>Select Country</option>
<option value="india">India</option>
<option value="us">USA</option>
<option value="au">Australia</option>
<option value="sr">SriLanka</option>
</select></td></tr>

<tr><td>Select State</td><td><select name="state">
<option >Select state</option>
<option value="mh">Maharashtra</option>
<option value="krl">Keral</option>
<option value="gj">Gujrat</option>
<option value="rj">Rajasthan</option>
</select></td></tr>

<tr><td>Select City</td><td><select name="city">
<option >Select city</option>
<option value="mum">Mumbai</option>
<option value="pune">Pune</option>
<option value="ngp">Nagpur</option>
<option value="amt">Amravati</option>
<option value="psd">Pusad</option></select></td>
</tr>
<tr><td>Enter Showroom Name</td><td><input type="text" name="showroomName"></td></tr>
<tr><td>pincode</td><td><input type="text" name="pincode"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr> <td>Confirm Password</td><td><input type="text" name="cnfrmpassword"></td></tr>
</table>
<input type="submit" value="SUBMIT"></center>
</form>
</body>

</html>