<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/admin/css/Style.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/public.js"></script>

</HEAD>
<body>
	<br>

					
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<td align="center" width="20%">用户id</td>
								<td align="center" width="10%">姓名</td>
								<td align="center" width="15%">密码</td>
								<td align="center" width="10%">性别</td>
								<td width="11%" align="center">邮件</td>
								<td width="8%" align="center">电话</td>
								<td width="10%" align="center">用户</td>
								<td width="7%" align="center">修改</td>
								<td width="7%" align="center">删除</td>
							</tr>
							<%request.getSession().getAttribute("list1"); %>
							<c:forEach items="${list1}" var="user">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="20%">${user.id}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="10%">${user.username}</td>
									<td style="CURSOR: list; HEIGHT: 22px" align="center"
										width="15%">${user.password}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="10%">${user.gender}</td>
									<td width="8%" align="center">${user.email}</td>
									<td width="10%" align="center">${user.telephone}</td>
									<td width="10%" align="center">${user.role}</td>
									
									<td align="center" style="HEIGHT: 22px" width="7%"><a
										href="${pageContext.request.contextPath}/findUserId?id=${user.id}&type=admin">
											<img
											src="${pageContext.request.contextPath}/admin/images/i_edit.gif"
											border="0" style="CURSOR: hand"> </a>
									</td>

									<td align="center" style="HEIGHT: 22px" width="7%"><a
										href="${pageContext.request.contextPath}/deleteU?id=${user.id}">
											<img
											src="${pageContext.request.contextPath}/admin/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a>
									</td>
								</tr>
							</c:forEach>
						</table>
		
	
</body>
</HTML>

