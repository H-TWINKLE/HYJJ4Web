<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="twinkle.factory.*,twinkle.user.*" %>
<%@ page import="java.util.*" %>    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HYJJ4 - tree—look</title>
</head>
<body>
<center>

   <%	
			List<User> all = DAOFactory.getIEmpDAOInstance().findAlltree();
			Iterator<User> iter =all.iterator();				
			%>
   
   
    <a href="login.jsp">登录</a>
	<a href="upgrade.jsp">修改</a>
	<a href="look.jsp">查询</a>
	<a href="treeadd.jsp">增加树洞信息</a>
	<a href="index.jsp">主页</a>
	
	<br><br><br><br><br>
	<table border="1">
				<tr>
			<td>姓名</td>
			<td>信息</td>
			<td>时间</td>
			</tr>
			<%
                	while(iter.hasNext()){
                	User user = iter.next();
                %>
		<tr>
			<td><%=user.getName() %></td>
			<td><%=user.getInformation() %></td>
			<td><%=user.getTime() %></td>			
			</tr>
			<%} %>
				</table>	
	
	</center>

</body>
</html>