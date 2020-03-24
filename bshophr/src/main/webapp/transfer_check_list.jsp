<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'major_list.jsp' starting page</title>
    
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
		<form method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--调动管理--调动审核列表</font>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						当前待复核的调动人数:${sumNumber}
						例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr height="21">
					<td width="19%" class="TD_STYLE1">
						I级机构
					</td>
					<td width="19%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="19%" class="TD_STYLE1">
						Ⅲ级机构
					</td>
					<td width="19%" class="TD_STYLE1">
						薪酬标准
					</td>
					<td width="19%" class="TD_STYLE1">
						名字
					</td>
					<td width="5%" class="TD_STYLE1">
						审核
					</td>

				</tr>
				
					<c:if test="${!empty list}">
						<c:forEach items="${list }" var="list">
							<tr height="21">
						<td class="TD_STYLE2">
							${list.newFirstKindName }
						</td>
						<td class="TD_STYLE2">
							${list.newSecondKindName }
						</td>
						<td class="TD_STYLE2">
							${list.newThirdKindName }
						</td>
						<td class="TD_STYLE2">
							${list.newSalaryStandardName }
						</td>
						<td class="TD_STYLE2">
							${list.humanName }
						</td>
						<td class="TD_STYLE2">
							<a href="zjlTransfer/${list.mchId}/queryOneMC.do">审核</a>
						</td>
					</tr>
						</c:forEach>
					</c:if>
					
			</table>
   <p>&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage } 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1 /> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0 />
   
    
    	
</form>
</body>
</html>
