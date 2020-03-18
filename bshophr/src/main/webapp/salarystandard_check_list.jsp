<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
<link rel="stylesheet" href="table.css" type="text/css" />
<title>无标题文档</title>
<style type="text/css">
<!--
.style3 {
	color: #0000CC
}
-->
</style>
</head>

<body>
	<form method="post" action="toqueryfh.do?operate=list">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准登记复核</font>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>当前等待复核的薪酬标准总数: ${sumNumber} 例</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="18%" class="TD_STYLE1"><span>薪酬标准编号</span></td>
				<td width="19%" class="TD_STYLE1"><span>薪酬标准名称</span></td>
				<td width="16%" class="TD_STYLE1"><span>制定人</span></td>
				<td width="30%" class="TD_STYLE1"><span>登记时间</span></td>
				<td width="13%" class="TD_STYLE1">薪酬总额</td>
				<td width="4%" class="TD_STYLE1">复核</td>
			</tr>

			<c:forEach items="${list }" var="ss">
				<tr class="TD_STYLE2">
					<td>${ss.standardId }</td>
					<td>${ss.standardName }</td>
					<td>${ss.designer }</td>
					<td>${ss.registTime}</td>
					<td>&nbsp;${ss.salarySum }</td>
					<td><a href="queryfh.do?standardId=${ss.standardId}">复 核</a></td>
				</tr>
			</c:forEach>

		</table>
		<p>
			&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页 &nbsp;&nbsp;&nbsp;共 ${maxPage } 页
			&nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1 /> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0 />
	</form>
</body>
</html>

