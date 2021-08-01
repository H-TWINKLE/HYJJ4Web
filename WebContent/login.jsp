<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HYJJ4-login</title>
</head>
<body>



<%request.setCharacterEncoding("GBK");%>


<center>

   
    <a href="index.jsp">主页</a>
	<a href="upgrade.jsp">修改</a>
	<a href="look.jsp">查询</a>
	<a href="treeadd.jsp">增加树洞信息</a>
	<a href="treelook.jsp">查看树洞信息</a>
	<br><br><br>
	<form action="LoginServlet" method="post">
	 <%	
			
	    
		List<String> info = (List<String>)request.getSession().getAttribute("info");
			if(info!=null){
				Iterator <String>iter = info.iterator();
				while(iter.hasNext()){
					%>
					<h4 name="name"><font color="#FF0000">&nbsp;&nbsp;&nbsp;&nbsp;<%=iter.next() %></font> </h4>
			<%													
				}}						
			%>
		账号：<input type="text" name="admin"><br><br>
		密码：<input type="password" name="password"><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登录/注册">
		 </form>
	
	
	</center>

</body>
</html>