<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/EmpController/insertEmployeeInformation" method="post">

        <table align="center" width="400px" cellpadding="10px" cellspacing="0px" border="1px">

            <tr>
                <td align="right" width="30%">员工编号</td>
                <td align="left" width="70%">
                    <input type="text" name="empno" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">员工姓名</td>
                <td align="left" width="70%">
                    <input type="text" name="ename" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">职位</td>
                <td align="left" width="70%">
                    <input type="text" name="job" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">上级领导</td>
                <td align="left" width="70%">
                    <input type="text" name="mgr" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">薪资</td>
                <td align="left" width="70%">
                    <input type="text" name="sal" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">佣金</td>
                <td align="left" width="70%">
                    <input type="text" name="comm" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">入职时间</td>
                <td align="left" width="70%">
                    <input type="text" name="hiredate" size="20" />
                </td>
            </tr>

            <tr>
                <td align="right" width="30%">部门编号</td>
                <td align="left" width="70%">
                    <input type="text" name="deptno" size="20" />
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交" />
                </td>
            </tr>

        </table>

    </form>

</body>
</html>
