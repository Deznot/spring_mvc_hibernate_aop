<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="saveEmployee" modelAttribute="createEmployeeDTO" >
        <form:hidden path="employee.id"></form:hidden>

        Name <form:input path="employee.name"></form:input>
        <br><br>
        Surname <form:input path="employee.surname"></form:input>
        <br><br>
<%--        Department <form:select path="employee.department" items="${createEmployeeDTO.departments}" itemLabel="department" itemValue="id" param='department'>--%>
        Department <form:select path="employee.department.id" items="${createEmployeeDTO.departments}" itemLabel="department" itemValue="id">
        </form:select>
        <br><br>
        Salary <form:input path="employee.salary"></form:input>
        <br><br>
        <input type="submit" value="Ok">
    </form:form>

</body>
</html>
