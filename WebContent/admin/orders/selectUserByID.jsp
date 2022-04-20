<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/admin/css/Style.css"
	type="text/css" rel="stylesheet">
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/public.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/check.js"></script>

</HEAD>

<body >
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/updateU?id=${user.id}" method="get"
		enctype="multipart/form-data">
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>编辑用户</STRONG> </strong></td>
			</tr>
			<tr>
			
			</tr>
                 <td align="center" bgColor="#f5fafe" class="ta_01">用户ID：</td>
					<td class="ta_01" bgColor="#ffffff">
					<input type="text" name="id" class="bg" value="${user.id}" readonly="readonly"/></td>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">用户姓名：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="username" class="bg" value="${user.username}" readonly="readonly"/></td>
				<td align="center" bgColor="#f5fafe" class="ta_01">用户性别：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="gender" class="bg" value="${user.gender}" readonly="readonly"/></td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">用户密码：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="password" class="bg"  placeholder="${user.password}"/></td>	
				<td align="center" bgColor="#f5fafe" class="ta_01">用户邮件：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="email" class="bg"  placeholder="${user.email}"/></td>
			</tr>
<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">用户电话：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="telephone" class="bg"  placeholder="${user.telephone}"/></td>
				<td align="center" bgColor="#f5fafe" class="ta_01">权限修改：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="role" class="bg"  placeholder="${user.role}"/></td>
			</tr>
			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4"><input type="submit"
					class="button_ok" value="确定"> <FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>

					<input type="reset" value="重置" class="button_cancel"> <FONT
					face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT> <INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1"> </span></td>
			</tr>
		</table>
	</form>
</body>
</HTML>