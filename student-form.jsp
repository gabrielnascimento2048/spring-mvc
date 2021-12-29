<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName"/>

<br><br>

Last name: <form:input path="lastName"/>

<br><br>

Country:

		<form:select path="country">


	<form:options items= "${student.options}"/>

<!-- 
	<form:option value="Brazil" label="Brazil"/>
	<form:option value="Portugal" label="Portugal"/>
	<form:option value="France" label="France"/>
	<form:option value="United States" label="United States"/>
 -->

</form:select>

<br><br>

Favorite Language: 

	Java<form:radiobutton path="language" value="Java"/>
	C#<form:radiobutton path="language" value="C#"/>
	Python<form:radiobutton path="language" value="Python"/>
	PHP<form:radiobutton path="language" value="PHP"/>
	
<br><br>

Operating Systems:

Linux <form:checkbox path="operatingSystems" value="Linux"/>
Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>


<br><br>


<input type="submit" value="Submit"/>

</form:form>

</body>


</html>