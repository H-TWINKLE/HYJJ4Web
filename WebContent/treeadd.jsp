<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HYJJ4 - tree—add</title>
</head>
<body>
 <%request.setCharacterEncoding("GBK");%>

<center>

  
    <a href="login.jsp">登录</a>
	<a href="upgrade.jsp">修改</a>
	<a href="look.jsp">查询</a>
	<a href="index.jsp">主页</a>
	<a href="treelook.jsp">查看树洞信息</a>
		
	<br><br><br>
	<form action="AddtreeServlet" method="post">
		名字：<input type="text" name="name"><br><br>
		信息：<input type="text" name="information"><br><br>
		时间：<input type="text" name="time"><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="增加">
		 </form>
	
	
	
	</center>


</body>
</html>