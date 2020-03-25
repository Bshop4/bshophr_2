<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/table.css" type="text/css" />
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
	<form method="post"
		action="/HR_Fist/salaryCriterion/salaryCriterionAction!salarystandardChangeListByPage">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准登记变更</font>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>符合条件的薪酬标准总数: ${count} 例</td>
			</tr>
		</table>

		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="15%" class="TD_STYLE1"><span>薪酬标准编号</span></td>
				<td width="20%" class="TD_STYLE1"><span>薪酬标准名称</span></td>
				<td width="15%" class="TD_STYLE1"><span>制定人</span></td>
				<td width="30%" class="TD_STYLE1"><span>登记时间</span></td>
				<td class="TD_STYLE1" width="15%">薪酬总额</td>
				<td class="TD_STYLE1" width="4%">变更</td>
			</tr>
			<tr>
				<c:forEach items="${sslist}" var="s" varStatus="ss">
				<tr class="TD_STYLE2">
					<td>${s.standardId }</td>
					<td>${s.standardName }</td>
					<td>${s.designer }</td>
					<td>${s.registTime }</td>
					<td>&nbsp;${s.salarySum}</td>
					<c:if test="${s.changeStatus != 1}">
						<td><a href="qyertbg.do?standardId=${s.standardId}">变 更</a></td>
					</c:if>
					<c:if test="${s.changeStatus == 1}">
						<td><a href="qyertbg.do?standardId=${s.standardId}">已变更</a></td>
					</c:if>
				</tr>
			</c:forEach>
			</tr>
		</table>

		<html>
	</form>
</body>
</html>
