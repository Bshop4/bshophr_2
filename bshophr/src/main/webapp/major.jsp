<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="table.css" type="text/css">
<script type="text/javascript" src="javascript/comm/comm.js"></script>
</head>

<body>
	<form method="post" action="pyl/configmajor.do?operate=list">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="添加"
					class="BUTTON_STYLE1" onclick="window.location.href='pyl/configmajor.do?operate=toAdd'"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="22%" class="TD_STYLE1">职位分类编号</td>
				<td width="23%" class="TD_STYLE1">职位分类名称</td>
				<td width="26%" class="TD_STYLE1">职位编号</td>
				<td width="24%" class="TD_STYLE1">职位名称</td>
				<td width="5%" class="TD_STYLE1">删除</td>
			</tr>
			<c:forEach  items="${list }" var="m">
				<tr>
					<td class="TD_STYLE2">${m.majorKindId }</td>
					<td class="TD_STYLE2">${m.majorKindName }</td>
					<td class="TD_STYLE2">${m.majorId }</td>
					<td class="TD_STYLE2">${m.majorName}</td>
					<td class="TD_STYLE2"><a href="major_delete.jsp?id=${m.makId }&message=${mk.majorKindId }/${mk.majorKindName }/${m.majorId }/${m.majorName }">删除</a>
					</td>
				</tr>
			</c:forEach>

		</table>
		<p>
			&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage } 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1 /> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0 />
			</p>
	</form>
</body>
</html>


