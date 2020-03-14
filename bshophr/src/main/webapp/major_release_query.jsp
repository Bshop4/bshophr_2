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
<form method="post" action="zjlMajorRelease/queryAllSub.do">
    <table width="100%">
        <tr>
            <td>
                <font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置
                </font>
            </td>
        </tr>
    </table>
   
	    <label>当前职位发布总数：${sumNumber}</label>
    
    <table width="100%" border="1" cellpadding=0 cellspacing=1
           bordercolorlight=#848284 bordercolordark=#eeeeee
           class="TABLE_STYLE1">
        <tr>
            <td width="15%" class="TD_STYLE1">
                职位名称
            </td>
            <td width="15%" class="TD_STYLE1">
                机构名称
            </td>
            <td width="15%" class="TD_STYLE1">
                招聘人数
            </td>
            <td width="20%" class="TD_STYLE1">
                发布时间
            </td>
            <td width="15%" class="TD_STYLE1">
                截止时间
            </td>
            <td width="10%" class="TD_STYLE1">
                申请职位
            </td>
        </tr>

		<c:if test="${list ne '0'}">
		
			<c:forEach var="major" items="${list}">
			<tr>
           	 <td class="TD_STYLE2">
                ${major.majorKindName }
             </td>
             <td class="TD_STYLE2">
                ${major.secondKindName }
             </td>
             <td class="TD_STYLE2">
                ${major.humanAmount }
             </td>
             <td class="TD_STYLE2">
                ${major.deadline }
             </td>
             <td class="TD_STYLE2">
                ${major.registTime }
             </td>
             <td class="TD_STYLE2">
                <a href="zjlEngageResume/${major.mreId}/gotoEngageResume.do" target="mainFrame">申请该职位</a>
             </td>
        </tr>
		</c:forEach>
			
		</c:if>
		

    </table>
    <c:if test="${list ne '0'}">
	    <p>&nbsp;&nbsp;总数：${sumNumber}例 &nbsp;&nbsp;&nbsp;当前第${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage }页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0>
    </c:if>
    <c:if test="${list eq '0'}">
	    <p>&nbsp;&nbsp;总数：0例 &nbsp;&nbsp;&nbsp;当前第 ${pageNo } 页  &nbsp;&nbsp;&nbsp;共 ${maxPage } 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0>
    </c:if>
    	
</form>
</body>
</html>
