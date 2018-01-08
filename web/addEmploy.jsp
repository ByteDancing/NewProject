<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/21 0021
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增员工</title>
    <script src="jquery/jquery-3.1.1.js"></script>
    <script>
    $(function () {
        $("#name").blur(function () {
          if ($("#name").val()==null){
              alert("用户名不能为空")
          }
        })
        $("#age").blur(function () {
            if ($("#age").val()==null){
                alert("用户名不能为空")
            }
        })
        $("#workDate").blur(function () {
            if ($("#workDate").val()==null){
                alert("用户名不能为空")
            }
        })

    })
    </script>
</head>
<body>
<form method="post" action="addEmploy">
    <h3>员工信息</h3>
    员工姓名 <input type="text" id="name" name="ename" placeholder="员工姓名"><p>
    部 门 <input type="text" id="dept" name="dept_id" placeholder="部门"><p>
    年 龄 <input type="text" id="age" name="age" placeholder="年龄"><p>
    性 别 <input type="radio" name="gender" value="">男
    <input type="radio" name="gender" value="">女
    入职时间 <input type="text" name="wordDate" id="workDate" placeholder="入职时间"><p>
    <input id="submit" type="submit" value=提交>         <input type="reset" value="重置">
</form>
</body>
</html>
