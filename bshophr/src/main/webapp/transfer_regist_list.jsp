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
                <font color="#0000CC">您正在做的业务是：人力资源-调动管理-调动登记列表
                </font>
            </td>
        </tr>
    </table>
	<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="10%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="10%" class="TD_STYLE1">
						姓名
					</td>
					<td width="10%" class="TD_STYLE1">
						一级机构
					</td>
					<td width="10%" class="TD_STYLE1">
						二级机构
					</td>
					<td width="10%" class="TD_STYLE1">
						三级机构
					</td>
					<td width="10%" class="TD_STYLE1">
						职位分类
					</td>
					<td width="10%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="15%" class="TD_STYLE1">
						登记
					</td>
				</tr>
				    <c:if test="${!empty list }">
				    
				    
			 	<c:forEach items="${list}" var="list"> 
					<tr>
						<td class="TD_STYLE2">
							${list.hufId }
						</td>
						<td class="TD_STYLE2">
							${list.humanName }
						</td>
						<td class="TD_STYLE2">
							${list.firstKindName }
						</td>
						<td class="TD_STYLE2">
							${list.secondKindName }
						</td>
						<td class="TD_STYLE2">
							${list.thirdKindName }
						</td>
						<td class="TD_STYLE2">
							${list.humanMajorKindName }
						</td>
						<td class="TD_STYLE2">
							${list.hunmaMajorName }
						</td>
						
						<td class="TD_STYLE2">
							<a href="zjlTransfer/${list.hufId}/queryOneHF.do">登记</a>
						</td>
					</tr>
			      </c:forEach>
				</c:if>
			</table>
   <p>&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage } 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1 /> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0 />
   
    
    	
</form>
</body>
</html>
