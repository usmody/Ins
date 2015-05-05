<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Udai's Auto Questionnaire</title>
</head>
<body>
<form action="EmailSendingServlet" method="post">
        <table border="0" width="65%" align="center">
            <caption><h2>Auto Questionnaire</h2></caption>
            <tr>
                <td>First Name </td>
                <td><input type="text" name="firstName" size="25"/></td>
            </tr>
            
            <tr>
                <td>Last Name </td>
                <td><input type="text" name="lastName" size="25"/></td>
            </tr>
            
            <tr>
                <td>Date Of Birth(MM/DD/YYYY) </td>
                <td><input type="text" name="dob" size="25"/></td>
            </tr>
            
            <tr>
                <td>Single/Married/Divorced </td>
                <td><input type="text" name="relationship" size="25"/></td>
            </tr>
            
             <tr>
                <td>Driver's License </td>
                <td><input type="text" name="driversLicense" size="15"/></td>
            </tr>
            
            <tr>
                <td>Date License Was Received </td>
                <td><input type="text" name="dateOfLicense" size="25"/></td>
            </tr>
            
            <tr>
                <td>Occupation </td>
                <td><input type="text" name="occupation" size="25"/></td>
            </tr>
            
            <tr>
                <td>Degree in Science, Computer Science, or Engineering </td>
                <td><input type="text" name="degreeType" size="25"/></td>
            </tr>
            
            <tr>
                <td>Employer's Name </td>
                <td><input type="text" name="employerName" size="25"/></td>
            </tr>
            
            <tr>
                <td>Employer's Address </td>
                <td><input type="text" name="employerAddress" size="35"/></td>
            </tr>
                        
            <tr>
                <td>Phone Number </td>
                <td><input type="text" name="phoneNumber" size="15"/></td>
            </tr>
          
            <tr>
                <td>Garaging Address </td>
                <td><input type="text" name="garagingAddress" size="25"/></td>
            </tr>
           
            <tr>
                <td>VIN Number Of Vehicle #1 </td>
                <td><input type="text" name="vin1" size="25"/></td>
            </tr>
            
            <tr>
                <td>VIN Number Of Vehicle #2 </td>
                <td><input type="text" name="vin2" size="25"/></td>
            </tr>
            
            <tr>
                <td>VIN Number Of Vehicle #3 </td>
                <td><input type="text" name="vin3" size="25"/></td>
            </tr>
            
            <tr>
                <td>VIN Number Of Vehicle #4 </td>
                <td><input type="text" name="vin4" size="25"/></td>
            </tr>
            
            <tr>
                <td>VIN Number Of Vehicle #5 </td>
                <td><input type="text" name="vin5" size="25"/></td>
            </tr>
                <td colspan="2" align="center"><input type="submit" value="Submit"/></td>
            </tr>
        </table>

</body>
</html>