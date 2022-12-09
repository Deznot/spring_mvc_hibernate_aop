<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="saveEmployee" modelAttribute="employee">
        Name <form:input path="name"></form:input>
        <br><br>
        Surname <form:input path="surname"></form:input>
        <br><br>
        Department <form:input path="department"></form:input>
        <br><br>
        Salary <form:input path="salary"></form:input>
        <br><br>
        <input type="submit" value="Ok">
    </form:form>

</body>
</html>
