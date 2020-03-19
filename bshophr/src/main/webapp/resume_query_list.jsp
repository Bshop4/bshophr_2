<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'interview_valid_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet"
			href="css/table.css" type="text/css">
  </head>
  
 	<body>
		<form method="post" name="fm">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--录用管理--录用查询列表
						</font>
					</td>
				</tr>
			  
			</table> 
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="15%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="15%" class="TD_STYLE1">
						姓名
					</td>
					<td width="15%" class="TD_STYLE1">
						职位分类
					</td>
					<td width="15%" class="TD_STYLE1">
						职位名称
					</td>
					
					<td width="15%" class="TD_STYLE1">
						综合素质
					</td>
					<td width="35%" class="TD_STYLE1">
						查看
					</td>
				</tr>
				
				<c:if test="${!empty list }">
					<c:forEach items="${list}" var="v">
					<tr>
						<td class="TD_STYLE2">
							${v.einId }
						</td>
						<td class="TD_STYLE2">
							${v.humanName }
						</td>
						<td class="TD_STYLE2">
							${v.humanMajorKindName }
						</td>
						<td class="TD_STYLE2">
						    ${v.humanMajorName }
						</td>
						<td class="TD_STYLE2">
							${v.multiQualityDegree }
						</td>
						<td class="TD_STYLE2">
							<a href="zjlEngageResume/${v.einId}/${v.resumeId}/resumeQuery.do">查看</a>						
						</td>
					</tr>
				</c:forEach>
				</c:if>
				
			</table>
			<p>&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage } 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1 /> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0 />
			
		</form>
  </body>
</html>
s