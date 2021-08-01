<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HYJJ4-upgrade</title>
</head>
<body>

<%request.setCharacterEncoding("GBK");%>
<center>

  
    <a href="login.jsp">登录</a>
	<a href="index.jsp">主页</a>
	<a href="look.jsp">查询</a>
	<a href="treeadd.jsp">增加树洞信息</a>
	<a href="treelook.jsp">查看树洞信息</a>
	
	<br><br><br>
	<form action="UpgradeServlet" method="post">
		账号：<input type="text" name="admin"><br><br>
		密码：<input type="text" name="password"><br><br>
		姓名：<input type="text" name="name"><br><br>
		个性签名：<input type="text" name="say"><br><br>
		等级：<input type="text" name="level"><br><br>
		学号：<input type="text" name="xuehao"><br><br>
		教务管理系统密码：<input type="text" name="xuehaopassword"><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="修改">
		 </form>
	
	
	
	</center>

</body>
</html>