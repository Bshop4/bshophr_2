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
<title>My JSP 'subject_register.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/table.css" type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/cwcalendar.css"
	type="text/css">

</head>

<body>
	<form action="engagesubjectsuccess.do" type="POST">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--招聘管理--招聘考试题库管理--试题登记
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1" onclick="mysubmit()"> <input
					type="reset" value="清除" class="BUTTON_STYLE1"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td class="TD_STYLE1">试题一级分类</td>
				<td class="TD_STYLE2">
					<input type="text" name="firstKindName" class="INPUT_STYLE2" />
				</td>
				<td class="TD_STYLE1">试题二级分类</td>
				<td class="TD_STYLE2">
					<input type="text" name="secondKindName" class="INPUT_STYLE2" />
				</td>
				<td class="TD_STYLE1">姓名</td>
				<td class="TD_STYLE2">
					<input type="text" name="humanName" id="name" class="INPUT_STYLE2" />
				</td>
				<td class="TD_STYLE1">注册时间</td>
				<td class="TD_STYLE2">
					<input type="text" name="registTime" id="nowTime" class="INPUT_STYLE2">
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1" height="50px">题干</td>
				<td class="TD_STYLE2" colspan="7">
					<textarea rows="3" cols="3" name="tigan" class="TEXTAREA_STYLE1" style="resize: none"></textarea>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1" height="50px">答案a</td>
				<td class="TD_STYLE2" colspan="7">
					<textarea rows="3" cols="3" name="daana" class="TEXTAREA_STYLE1" style="resize: none"></textarea>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1" height="50px">答案b</td>
				<td class="TD_STYLE2" colspan="7"><textarea rows="3" cols="3" name="daanb"
						class="TEXTAREA_STYLE1" style="resize: none"></textarea></td>
			</tr>
			<tr>
				<td class="TD_STYLE1" height="50px">答案c</td>
				<td class="TD_STYLE2" colspan="7"><textarea rows="3" cols="3" name="daanc"
						class="TEXTAREA_STYLE1" style="resize: none"></textarea></td>
			</tr>
			<tr>
				<td class="TD_STYLE1" height="50px">答案d</td>
				<td class="TD_STYLE2" colspan="7"><textarea rows="3" cols="3" name="daand"
						class="TEXTAREA_STYLE1" style="resize: none"></textarea></td>
			</tr>
			<tr>
				<td class="TD_STYLE1" height="50px">答案e</td>
				<td class="TD_STYLE2" colspan="7"><textarea rows="3" cols="3" name="daane"
						class="TEXTAREA_STYLE1" style="resize: none"></textarea></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">正确答案</td>
				<td class="TD_STYLE2"><input type="text" name="correctkey"
					id="name" class="INPUT_STYLE2" /></td>
				<td class="TD_STYLE1">试题出处</td>
				<td class="TD_STYLE2"><input type="text" name="fromwhere"
					id="name" class="INPUT_STYLE2" /></td>
				<td class="TD_STYLE1"></td>
				<td class="TD_STYLE2"><input type="text" id="name"
					class="INPUT_STYLE2" /></td>
				<td class="TD_STYLE1"></td>
				<td class="TD_STYLE2"><input type="text" id="name"
					class="INPUT_STYLE2" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/comm/comm.js">
	
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/comm/list.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/calendar-ch.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/jquery-1.7.2.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/locate.js">
	
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/select.js">
</script>
<script type="text/javascript">
	window.onload = Ttime;
	function tick() {
		var now = new Date();
		var hours, minutes, seconds, noon;
		var intHours, intMinutes, intSeconds;
		intHours = now.getHours();
		intMinutes = now.getMinutes();
		intSeconds = now.getSeconds();
		if (intHours < 24) {
			hours = intHours + ":";
			noon = "A.M.";
		} else {
			intHours = intHours - 24;
			hours = intHours + ":";
			noon = "P.M.";
		}
		if (intMinutes < 10) {
			minutes = "0" + intMinutes + ":";
		} else {
			minutes = intMinutes + ":";
		}
		if (intSeconds < 10) {
			seconds = "0" + intSeconds + " ";
		} else {
			seconds = intSeconds + " ";
		}
		timeString = hours + minutes + seconds;
		var now = new Date();
		document.getElementById("nowTime").value = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + now.getDate() + " " + timeString;
		window.setTimeout("tick();", 1000);
	}

	//load事件
	function Ttime() {
		//获得系统当前时间的方法
		tick();
	}
</script>