<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<script type="text/javascript">
	function locate() {
//		document.forms[0].action = document.forms[0].action + "?operate=locate";
		document.forms[0].action = "primary_key.jsp";
		document.forms[0].submit();
	}
</script>
</head>
<body>
	<form method="post" action="pyl/configprimarykey.do">
		<table width="100%">
			<tr>
				<td colspan="2"><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--其他设置--关键字查询设置</font></td>
			</tr>
			<tr>
				<td width="49%">关键字设置成功，请返回！</td>
				<td width="51%" align="right"><input type="button" value="返回"
					class="BUTTON_STYLE1" onclick="javascript:locate();"></td>
			</tr>
		</table>

	</form>
</body>
</html>

