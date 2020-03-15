<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
<link rel="stylesheet" href="table.css" type="text/css" />
<title>无标题文档</title>
</head>

<body>
	<form method="post" action="recheckout.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准登记复核</font>
				</td>
			</tr>
			<tr>
				<td>
					<div align="right">
						<input type="submit" value="复核通过" class="BUTTON_STYLE1"
							onclick="check();"> <input type="button" value="返回"
							onclick="history.back();" class="BUTTON_STYLE1">
					</div>
				</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="12%" class="TD_STYLE1">薪酬编号</td>
				<td width="15%" class="TD_STYLE2">
					<input type="text" name="stid" id="xcbh" value="${cstandardId}"/>
				</td>
				<td width="12%" class="TD_STYLE1">薪酬标准名称</td>
				<td width="11%" class="TD_STYLE2">
					<input type="text" name="sname" id="standardName" value="${cstandardName}" class="INPUT_STYLE2">
				</td>
				<td width="11%" class="TD_STYLE1">薪酬总额</td>
				<td width="17%" class="TD_STYLE2">
					<input type="text" name="ssum" value="${csalarySum}" id="sumSalary" class="INPUT_STYLE2">
				</td>
				<td width="12%" class="TD_STYLE1">&nbsp;</td>
				<td width="10%" class="TD_STYLE2">&nbsp;</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">制定人</td>
				<td class="TD_STYLE2">
					<input type="text" name="sdesigner" id="designer" value="${cdesigner}" class="INPUT_STYLE2">
				</td>
				<td class="TD_STYLE1">复核人</td>
				<td class="TD_STYLE2"><input type="text" name="item.checker"
					id="recheck" value="" class="INPUT_STYLE2">
				</td>
				<td class="TD_STYLE1">复核时间</td>
				<td class="TD_STYLE2">
					<input type="text" name="sctime" value="Tdate" id="Tdate" class="INPUT_STYLE2">
				</td>
				<td class="TD_STYLE1">&nbsp;</td>
 				<td class="TD_STYLE2">&nbsp;</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">复核意见</td>
				<td colspan="7" class="TD_STYLE2">
					<textarea name="sfgcomment" rows="4" class="INPUT_STYLE2" id="fhyj"></textarea>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">序号</td>
				<td colspan="3" class="TD_STYLE1">薪酬项目名称</td>
				<td colspan="4" class="TD_STYLE1">金额</td>
			</tr>

			<c:forEach items="${cflist}" var="s" varStatus="vs">
				<tr class="TD_STYLE2">
					<td align="center">${vs.count }</td>
					<td colspan="3">${s.attributeName}</td>
					<%-- </c:forEach>
					<c:forEach items="${ssdlist}" var="ssd" varStatus="vss"> --%>
					<td>
						<input type="text" id="salary${vss.count}" value="${ssdlist[vs.count-1].salary }" name="csum" 
							onkeyup="countMoney('6','salary${vs.count}')" class="INPUT_STYLE2"></input>
						<%-- <input type="hidden" name="pbcid" value="${s.xcxmid }"> --%>
					</td>
					<td colspan="3">
						&nbsp;
					</td>
				</tr>
			</c:forEach>

		</table>
	</form>
</body>
</html>
<script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function check() {
		var recheck = $("#recheck").val();
		var fhyj = $("#fhyj").val();
		if (recheck.length<=0||fhyj.length<=0) {
			alert("复核人或者复核意见不可以为空！！！");
			return;
		}
		/* var s1 = $("#recheck").val();//复核人
		var s2 = $("#Tdate").val();//复核时间
		var s3 = ($("#comment").val()==""?"null":$("#comment").val());//复核意见
		var s4 = $("#xcbh").val();//薪酬编号
		var obj = s1+","+s2+","+s3+","+s4;
		alert(obj);
		$.ajax({
			type:"POST",
			url:"recheckout.do?str="+obj,
			dataType:"json",
			contentType:"application/json; charset=utf-8",
			data:obj,
		});*/
	} 
	
	/* function countMoney(obj,o) {
		if (isNaN(document.getElementById(o).value) || document.getElementById(o).value < 0) {
			$.messager.show("消息提示","金额填写错误!",2000);
			document.getElementById(o).value="0.00";
			return;
		}
		var sum=0;
	 	for(var i=1;i<=obj;i++){
	 		var salary=document.getElementById("salary"+i).value;
	 		if(salary==""){
	 		salary="0.00";
	 		}
	 		sum=Number(sum)+Number(salary);
	 	}
	 	document.getElementById("sumSalary").value=sum;
	} */
	
	function time(){
		var tdate=document.getElementById("Tdate");					 
		var d=new Date();
		var y=d.getFullYear();
		var moth=d.getMonth()+1;
		var date=d.getDate();
		var h=d.getHours();
		var m=d.getMinutes();
		var s=d.getSeconds();
		var hh=20-1-h;
		var mm=60-1-m;
		var ss=60-s;
		if(hh>0){
				mm=mm+60*hh;
		}
		if(moth<10){
				moth="0"+moth;
		}
		if(date<10){
				date="0"+date;
		}
		if(h<10){
				h="0"+h;
		}
		if(m<10){
				m="0"+m;
		}
		if(s<10){
				s="0"+s;
		}
		if(mm<10){
				mm="0"+mm;
		}
		if(ss<10){
				ss="0"+ss;
		}	
		tdate.value=y+"-"+moth+"-"+date+" "+h+":"+m+":"+s;
		}
		window.onload=time;
		var out=window.setInterval(time, 1000);
</script>
