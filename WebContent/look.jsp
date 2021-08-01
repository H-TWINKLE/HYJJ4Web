<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="twinkle.factory.*,twinkle.user.*" %>
    <%@ page import="java.util.*" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HYJJ4-look</title>
</head>
<body>
<center>

	<%	
			List<User> all = DAOFactory.getIEmpDAOInstance().findAll();
			Iterator<User> iter =all.iterator();				
			%>

   
    <a href="login.jsp">登录</a>
	<a href="upgrade.jsp">修改</a>
	<a href="index.jsp">主页</a>
	<a href="treeadd.jsp">增加树洞信息</a>
	<a href="treelook.jsp">查看树洞信息</a>
	
			<table border="1">
				<tr>
			<td>账号</td>
			<td>密码</td>
			<td>昵称</td>
			<td>个性签名</td>
			<td>等级</td>
			<td>学号</td>
			<td>学号教务管理系统密码</td>
			</tr>
			<%
                	while(iter.hasNext()){
                	User user = iter.next();
                %>
		<tr>
			<td><%=user.getAdmin() %></td>
			<td><%=user.getPassword() %></td>
			<td><%=user.getName() %></td>
			<td><%=user.getSay() %></td>
			<td><%=user.getLevel() %></td>
			<td><%=user.getXuehao() %></td>
			<td><%=user.getXuehaopassword() %></td>
			
			</tr>
			<%} %>
				</table>		
	</center>

</body>
</html>