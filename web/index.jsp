<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/20 0020
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>员工信息</title>
    <script src="jquery/jquery-3.1.1.js"></script>
    <script>
    </script>
  </head>
  <body>
  <a href="queryEmploy">查看员工信息</a>
  <a href="addEmploy.jsp">添加员工</a>
  <table width="80%" border="1"  align="center" border-color="#84C1FF" cellpadding="5"  id="tb" >
    <tr id="tr1">
      <td>员工姓名</td>
      <td>部门</td>
      <td>年龄</td>
      <td>性别</td>
      <td>入职时间</td>
      <td>操作</td>
    </tr>
    <c:forEach items="${sessionScope.empList}" var="empList">
      <tr id="tr2">
        <td><c:out value="${empList.ename}"/></td>
        <td><c:out value="${empList.dept_id}"/></td>
        <td><c:out value="${empList.age}"/></td>
        <td><c:out value="${empList.gender}"/></td>
        <td><c:out value="${empList.wordDate}"/></td>
        <td><a href="updateEmploy.jsp?eid=${empList.eid}">修改</a>
          /<a id="delete" onclick="confirm('确认删除此用户么')" href="deleteEmploy?eid=${empList.eid}">删除</a></td>
      </tr>
      </c:forEach>
    </table>
  </body>
</html>
