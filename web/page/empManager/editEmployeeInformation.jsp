<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑员工信息</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/EmpController/updateEmployeeInformation" method="post">

        <table align="center" width="400px" cellpadding="10px" cellspacing="0px" border="1px">

            <tr>
                <td align="right" width="30%">员工姓名</td>
                <td align="left" width="70%">
                    <input type="text" name="ename" size="20" value="${queryEmployeeInformationByEmpnoResult.ename}"/>
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">职位</td>
                <td align="left" width="70%">
                    <input type="text" name="job" size="20" value="${queryEmployeeInformationByEmpnoResult.job}"/>
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">上级领导</td>
                <td align="left" width="70%">
                    <input type="text" name="mgr" size="20" value="${queryEmployeeInformationByEmpnoResult.mgr}"/>
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">薪资</td>
                <td align="left" width="70%">
                    <input type="text" name="sal" size="20" value="${queryEmployeeInformationByEmpnoResult.sal}"/>
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">佣金</td>
                <td align="left" width="70%">
                    <input type="text" name="comm" size="20" value="${queryEmployeeInformationByEmpnoResult.comm}"/>
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">入职时间</td>
                <td align="left" width="70%">
                    <input type="text" name="hiredate" size="20" value="${queryEmployeeInformationByEmpnoResult.hiredate}"/>
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">部门编号</td>
                <td align="left" width="70%">
                    <input type="text" name="deptno" size="20" value="${queryEmployeeInformationByEmpnoResult.dept.deptno}"/>
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <!--通过隐藏域将主键提交上去-->
                    <input type="hidden" name="empno" value="${queryEmployeeInformationByEmpnoResult.empno}" />
                    <input type="submit" value="提交" />
                </td>
            </tr>

        </table>

    </form>
</body>
</html>
