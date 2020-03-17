<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/table.css" type="text/css" />
<title>无标题文档</title>
<style type="text/css">
<!--
.style3 {
	color: #0000CC
}

td {
	text-align: center
}
-->
</style>
<script type="text/javascript" src="javascript/jquery-1.7.2.js">
	
</script>
<script type="text/javascript" src="javascript/jquery.messager.js"></script>

</head>

<body>
	<form method="post" action="updateSalary.do">
		<table width="100%">
			<tr>
				<td colspan="2" style="text-align: left"><font color="black">您正在做的业务是：人力资源--薪酬标准管理--薪酬发放登记
				</font></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;"><input type="submit"
					value="提交" class="BUTTON_STYLE1"> <input type="button"
					value="返回" onclick="javascript:window.history.back();"
					class="BUTTON_STYLE1"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: left">薪酬单编号：${sid} <input
					type="hidden" name="salaryGrant.salaryGrantId" value="">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: left">机构： <c:if
						test="${sid == 1}">
						<span>I级机构名称</span>
					</c:if> <c:if test="${sid == 2}">
						<span>II级机构名称</span>
					</c:if> <c:if test="${sid == 3}">
						<span>III级机构名称</span>
					</c:if>

				</td>
			</tr>
			<tr>
				<td style="text-align: left">本机构总人数:${count } <input
					type="hidden" name="salaryGrant.humanAmount" value="">
					，基本薪酬总数:${salaryStandardSum }<input type="hidden"
					name="salaryGrant.salaryStandardSum" value="" />
					，实发总额:<span id="salarySum_sum" name="salarySum_sum">${salaryPaidSum }</span> <input
					type="hidden" id="salaryPaidSum" name="salaryGrant.salaryPaidSum"
					value="" />


				</td>
				<td style="text-align: right;">登记人:<input type="text"
					name="salaryGrant.register" value="${register }"
					size="8" readonly="readonly"> 登记时间：<span id="Tdate"></span>
					<input type="hidden" name="salaryGrant.registTime" id="Tdate2">
				</td>
			</tr>
		</table>


		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td class="TD_STYLE1"><span>序号</span></td>
				<td class="TD_STYLE1"><span>档案编号</span></td>
				<td class="TD_STYLE1"><span>姓名</span></td>
				<td class="TD_STYLE1">出差补助</td>
				<td class="TD_STYLE1">交通补贴</td>
				<td class="TD_STYLE1">住房补贴</td>
				<td class="TD_STYLE1">基本工资</td>
				<td class="TD_STYLE1">年终奖</td>
				<td class="TD_STYLE1">误餐补助</td>
				<td class="TD_STYLE1" width="7%">奖励金额</td>
				<td class="TD_STYLE1" width="7%">销售绩效总额</td>
				<td class="TD_STYLE1" width="7%">应扣金额</td>
				<td class="TD_STYLE1" width="7%">实发金额</td>
			</tr>

			<%-- <c:forEach items="${ssdlist}" var="s" varStatus="vs"> --%>
				<input type="hidden" name="humanid"
					value="${ssid }">
				<input type="hidden" id="salaryStandardSum"
					name="humanname"
					value="${humanName }" />
				<tr class="TD_STYLE2">
					<td>1</td>
					<td>${ssid }</td>
					<td>${humanName }</td>
					<td>${mission}</td>
					<td>${travel }</td>
					<td>${housing }</td>
					<td>${base }</td>
					<td>${bonus }</td>
					<td>${meal }</td>
					<td><input type="text" name="bounsSum" maxlength="5"
						id="bounsSum" οnkeyup="value=value.replace(/[^\d]/g,'')"
						οnblur="value=value.replace(/[^\d]/g,'')"
						class="INPUT_STYLE2" /></td>
					<td><input type="text" name="saleSum" id="saleSum"
						οnkeyup="value=value.replace(/[^\d]/g,'')" maxlength="5" 
						οnblur="value=value.replace(/[^\d]/g,'')" class="INPUT_STYLE2" /></td>
					<td><input type="text" name="deductSum" maxlength="5"
						id="deductSum" οnkeyup="value=value.replace(/[^\d]/g,'')"
						οnblur="value=value.replace(/[^\d]/g,'')" class="INPUT_STYLE2" /></td>
					<td><input type="text" name="salaryPaidSum" id="salaryPaidSum"
						value="" class="INPUT_STYLE2" /></td>
				</tr>
			<%-- </c:forEach> --%>

		</table>

	</form>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<SCRIPT type="text/javascript">
		/* $(function() {
			var s1 = 0;
			var s2 = 0;
			$("#bounsSum").bind("input propertychange",function(){
				var a = $("#bounsSum").val();
				s1 = a ;
			});
			$("#saleSum").bind("input propertychange",function(){
				var b = $("#saleSum").val();
				s2 = b ;
			});
			$("#deductSum").bind("input propertychange",function(){
				var c = $("#deductSum").val();
				var d = $("#salarySum_sum").val();
				console.log(s1);
				var sum = Number(s1)+Number(s2)-Number(c)+Number(d);
				$("#salaryPaidSum").val(sum);
			});
		}); */
		function time() {
			var tdate = document.getElementById("Tdate");
			var d = new Date();
			var y = d.getFullYear();
			var moth = d.getMonth() + 1;
			var date = d.getDate();
			var h = d.getHours();
			var m = d.getMinutes();
			var s = d.getSeconds();
			var hh = 20 - 1 - h;
			var mm = 60 - 1 - m;
			var ss = 60 - s;
			if (hh > 0) {
				mm = mm + 60 * hh;
			}
			if (moth < 10) {
				moth = "0" + moth;
			}
			if (date < 10) {
				date = "0" + date;
			}
			if (h < 10) {
				h = "0" + h;
			}
			if (m < 10) {
				m = "0" + m;
			}
			if (s < 10) {
				s = "0" + s;
			}
			if (mm < 10) {
				mm = "0" + mm;
			}
			if (ss < 10) {
				ss = "0" + ss;
			}

			tdate.innerHTML = y + "-" + moth + "-" + date + " " + h + ":" + m + ":" + s;
			document.getElementById("Tdate2").value = tdate.innerHTML;
		}
		window.onload = time;
		var out = window.setInterval(time, 1000);
	</SCRIPT>
</body>
</html>
