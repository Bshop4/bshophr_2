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
    
    <script type="text/javascript">
    	function gotoChoose(){
    		location.href="zjlEngageResume/queryMajorKindNameToChoose.do";
    	}
    </script>
</head>

<body>
<form method="post"><!--  action="zjlEngageResume/queryChooseSplit.do" -->
	<!-- <input type="hidden" value=${hiddenMajorKindName} name="hiddenMajorKindName">
	<input type="hidden" value=${humanMajorName} name="humanMajorName">
	<input type="hidden" value=${keyWord} name="keyWord">
	<input type="hidden" value=${startdate} name="startdate">
	<input type="hidden" value=${enddate} name="enddate"> -->
    <table width="100%">
        <tr>
            <td>
                <font color="#0000CC">您正在做的业务是：招聘管理--面试管理--面试结果登记--面试结果登记列表
                </font>
            </td>
        </tr>
        <tr>
			<td align="right"> 
				<input type="button" value="返回" id="mybtn" onclick=history.back();
				>
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
					<td width="10%" class="TD_STYLE1">
						姓名
					</td>
					<td width="10%" class="TD_STYLE1">
						性别
					</td>
					<td width="15%" class="TD_STYLE1">
						职位分类
					</td>
					<td width="5%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="5%" class="TD_STYLE1">
						电话号码
					</td>
					<td width="5%" class="TD_STYLE1">
						面试状态
					</td>
					<td width="5%" class="TD_STYLE1">
						登记
					</td>
				</tr>
				    <c:if test="${!empty erList }">
				    
				    
			 	<c:forEach items="${erList}" var="er"> 
					<tr>
						<td class="TD_STYLE2">
							${er.resId }
						</td>
						<td class="TD_STYLE2">
							${er.humanName }
						</td>
						<td class="TD_STYLE2">
							${er.humanSex }
						</td>
						<td class="TD_STYLE2">
							${er.humanMajorKindName }
						</td>
						<td class="TD_STYLE2">
							${er.humanMajorName }
						</td>
						<td class="TD_STYLE2">
							${er.humanMobilephone }
						</td>
						<td class="TD_STYLE2">
						    <c:if test="${er.interviewStatus == 1}">待面试</c:if>
							<c:if test="${er.interviewStatus == 2}">已面试</c:if>
						</td>
						<td class="TD_STYLE2">
							<c:if test="${er.interviewStatus == 1}">
								<a href="zjlEngageResume/${er.resId}/interviewRegist.do">登记</a>
							</c:if>
							<c:if test="${er.interviewStatus == 2}">
								已面试
							</c:if>
						</td>
					</tr>
			      </c:forEach>
				</c:if>
			</table>
   <p>&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage } 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1 /> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0 />
   
    
    	
</form>
</body>
</html>
