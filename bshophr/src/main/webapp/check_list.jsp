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
<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
	function toCheck(id) {
		document.forms[0].action = document.forms[0].action + "?operate=toCheck&id=" + id;
		document.forms[0].submit();
	}
</script>
</head>

<body>
	<form name="humanfileForm" method="post">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记复核
				</font></td>
			</tr>
			<tr>
				<td>当前等待复核的人力资源档案总数：${count}例</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="13%" class="TD_STYLE1">档案编号</td>
				<td width="13%" class="TD_STYLE1">姓名</td>
				<td width="11%" class="TD_STYLE1">性别</td>
				<td width="14%" class="TD_STYLE1">I级机构</td>
				<td width="14%" class="TD_STYLE1">II级机构</td>
				<td width="14%" class="TD_STYLE1">III级机构</td>
				<td width="14%" class="TD_STYLE1">职称</td>
				<td width="7%" class="TD_STYLE1">复核</td>
			</tr>

			<c:if test="${!empty list}">
				<c:forEach items="${list}" var="lpn">
				<tr>
					<td class="TD_STYLE2">${lpn.hufId}</td>
					<td class="TD_STYLE2">${lpn.humanName}</td>
					<td class="TD_STYLE2">${lpn.humanSex}</td>
					<td class="TD_STYLE2">${lpn.firstKindName}</td>
					<td class="TD_STYLE2">${lpn.secondKindName}</td>
					<td class="TD_STYLE2">${lpn.thirdKindName}</td>
					<td class="TD_STYLE2">${lpn.humanProDesignation}</td>
					<td class="TD_STYLE2">
						<a href="humanRegister/jumpToId.do?hufId=${lpn.hufId}">复核</a>
					</td>
				</tr>
				</c:forEach>
			</c:if>	

		</table>
		<p>
			&nbsp;&nbsp;总数：${count}例 &nbsp;&nbsp;&nbsp;当前第 <span id="currentPage">${currentPage}</span>页 &nbsp;&nbsp;&nbsp;共 ${maxPage}页
			&nbsp;&nbsp;&nbsp;跳到第 <input name="page" id="pageJump" type="text" class="input1" size="1"/>
			页&nbsp;&nbsp;<input type="image" src="images/go.bmp" width="18" height="18" border="0" id="JumpToPage"/>
				</p>
	</form>
</body>
<script type="text/javascript">
	var maxPage="${maxPage}";
	var currentPage=$("#currentPage").text();
	$("#JumpToPage").click(function(){
		var pageJump=$("#pageJump").val();
		console.log(maxPage);
		if(pageJump>maxPage){
			pageJump=currentPage;
		}
		$("#currentPage").text(pageJump);
		console.log(pageJump);
		window.location.href="bshpohr/checkList/jumpToPage.do?currentPage="+pageJump;
	})
</script>
</html>

