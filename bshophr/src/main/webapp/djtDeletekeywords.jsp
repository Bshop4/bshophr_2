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
	function doStart() {
		//document.forms[0].action = document.forms[0].action + "?operate=doSearch&method=query&delete_status=1";
		document.forms[0].action = "query_list.jsp";
		document.forms[0].submit();
	}
</script>
</head>

<body>
	<form action="humanfile.do" method="post">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案查询</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="开始"
					class="BUTTON_STYLE1" id="djtQueryKeywords">
					<input type="button" value="返回" class="BUTTON_STYLE1"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请输入关键字</td>
				<td width="84%" class="TD_STYLE2">
				<select type="text" name="keywords" value="" class="INPUT_STYLE1">
					<c:if test="${!empty keywordsList}">
						<c:forEach items="${keywordsList }" var="kl">
							<option value="${kl.primaryKey }">${kl.keyName}</option>
						</c:forEach>
					</c:if>
				</select>
				<input type="text" value="" class="INPUT_STYLE1" id="djtKeywordsContext"/>
				</td>
				
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">

	var firstKindId="${condition.firstKindId}";
   		var secondKindId="${condition.secondKindId}";
   		var thirdKindId="${condition.thirdKindId}";
   		var humanMajorKindId="${condition.humanMajorKindId}";
   		var humanMajorId="${condition.humanMajorId}";
   		var dateStart="${condition.dateStart}";
   		var dateEnd="${condition.dateEnd}";

	$("#djtQueryKeywords").click(function(){
		var selectKey=$("select[name='keywords'] option:selected").val();
		var selectValue=$("#djtKeywordsContext").val();
		
		console.log(selectKey);
		console.log(selectValue);

		window.location.href="deleteKeywords/queryByConditions.do?firstKindId="+firstKindId
					+"&secondKindId="+secondKindId+"&thirdKindId="+thirdKindId+"&humanMajorKindId="
					+humanMajorKindId+"&humanMajorId="+humanMajorId+"&dateStart="+dateStart
					+"&dateEnd="+dateEnd+"&selectKey="+selectKey+"&selectValue="+selectValue;
	})
</script>
</html>

