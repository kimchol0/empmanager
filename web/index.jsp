<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/empController/employeelist" method="post">
    <table align="center" width="400px" cellpadding="10px" cellspacing="0px" border="1px">
      <tr>
        <td align="right" width="30%" >用户名</td>
        <td align="left" width="70%" >
          <input type="text" name="uname" size="20" /></td>
        </td>
      </tr>
      <tr>
        <td align="right" width="30%" >密码</td>
        <td align="left" width="70%" >
          <input type="password" name="upwd" size="20" /></td>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit"value="登录">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
