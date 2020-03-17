<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 	function selAll(obj)
 	{
 		var cho = document.all.choice.value;
 		if(cho == "全选")
 			document.all.choice.value = "取消";
 		else
 			document.all.choice.value = "全选";
 			
 		 for(var i=0;i<obj.elements.length;i++){
 			if(obj.elements[i].tagName.toLowerCase()=="input" &&　obj.elements[i].type=="checkbox"){
 				if(cho == "全选")
 					obj.elements[i].checked=true;
 				else
 					obj.elements[i].checked=false;
 			}
 		}
 	}
 	
 	
 	
 	
 	
 	
 	
 	function doRegister()
 	{	
 		var lists='';
 		var checks=$("input[type='checkbox']:checked");
 		for(var i=0;i<checks.length;i++){
 			var s=$(checks[i]).siblings(".hiddenid");
	 		lists=lists+s[0].value;
	 		if(i==checks.length-1){
	 			break;
	 		}
	 		lists=lists+",";
 		}
 		
 	
 		document.forms[0].action = document.forms[0].action + "?operate=doRegister&lists="+lists;
		//document.forms[0].action = "register_success.jsp";
		document.forms[0].submit();
 	}
</script>
</head>

<body>
	<form action="pyl/configprimarykey.do" method="post">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--其他设置--关键字查询设置</font>
				</td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="提交"
					class="BUTTON_STYLE1" onclick="doRegister();"> <input
					type="button" value="返回" class="BUTTON_STYLE1"
					onclick="history.back();"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td class="TD_STYLE1" colspan="4">请选择用于关键字查询的字段&nbsp; <input
					type="button" name="choice" value="全选" class="BUTTON_STYLE1"
					onclick="selAll(this.form)">
				</td>
			</tr>
			<c:set var="num" value="0"></c:set>
			<c:set var="num1" value="1"></c:set>
			<c:forEach items="${list }" var="pk" varStatus="vs">
			<c:if test="${vs.index mod 4 eq 0}">
				<tr>
			</c:if>
			<c:set var="num" value="${num+num1 }"></c:set>
				<td class="TD_STYLE2">
					<input type="hidden" name="primaryKeyTable${vs.index }" value="${pk.primaryKeyTable}">
					<input type="hidden" class="hiddenid" name="prkId${vs.index }" value="${pk.prkId}">
					<input type="hidden" name="primaryKey${vs.index }" value="${pk.primaryKey}">
					<input type="hidden" name="keyName${vs.index }" value="${pk.keyName}">
					<%--根据状态来是否选中 --%>
					<c:if test="${pk.primaryKeyStatus eq 1}">
						<input type="checkbox" name="checked${vs.index }" value="on" checked="checked">${pk.keyName}					
					</c:if>
					<c:if test="${pk.primaryKeyStatus eq 0}">
						<input type="checkbox" name="checked${vs.index }" value="on">${pk.keyName}
					</c:if>
				</td>

			<c:if test="${num mod 4 eq 0 and num ne 0 or vs.last}">
				</tr>
			</c:if>
			</c:forEach>
		

		</table>
	</form>
</body>
</html>
<script type="text/javascript">
	$("input[type='checkbox']").each(function(i){
		$(this).click(function(i){
			if($(this).is(":checked")){
				$(this).prop("checked",true);
			}else{
				$(this).removeAttr("checked");
			}
		
		});
	
	});

</script>

