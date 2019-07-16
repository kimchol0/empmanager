<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>员工列表</title>
</head>
<body>

    <table align="center" width="100%" border="1px" cellspadding="10px" cellspacing="0px" >

            <tr>
                <td colspan="10" align="right">
                    <a href="${pageContext.request.contextPath}/EmpController/addEmployeeInformation">添加</a>
                </td>
            </tr>

            <tr>
                <td align="center">员工编号</td>
                <td align="center">员工姓名</td>
                <td align="center">职位</td>
                <td align="center">上级领导</td>
                <td align="center">薪资</td>
                <td align="center">佣金</td>
                <td align="center">入职时间</td>
                <td align="center">部门名称</td>
                <td align="center">部门所在地</td>
                <td align="center">操作</td>
            </tr>

        <c:forEach var="employeeInformationQueryResultTable" items="${employeeInformationQueryResultTable}">

            <tr>

                <td align="center">${employeeInformationQueryResultTable.empno}</td>
                <td align="center">${employeeInformationQueryResultTable.ename}</td>
                <td align="center">${employeeInformationQueryResultTable.job}</td>
                <td align="center">${employeeInformationQueryResultTable.mgr}</td>
                <td align="center">${employeeInformationQueryResultTable.sal}</td>
                <td align="center">${employeeInformationQueryResultTable.comm}</td>
                <td align="center">${employeeInformationQueryResultTable.hiredate}</td>
                <td align="center">${employeeInformationQueryResultTable.dept.dname}</td>
                <td align="center">${employeeInformationQueryResultTable.dept.loc}</td>
                <td align="center">
                    <a href="${pageContext.request.contextPath}/EmpController/editEmployeeInformation?empno=${employeeInformationQueryResultTable.empno}">【修改】</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/EmpController/deleteEmployeeInformation?empno=${employeeInformationQueryResultTable.empno}">【删除】</a>
                </td>

            </tr>

        </c:forEach>

    </table>

</body>
</html>
