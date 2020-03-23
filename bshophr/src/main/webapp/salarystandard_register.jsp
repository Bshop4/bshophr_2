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
<!-- <meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page"> -->
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="table.css" type="text/css" />
<script type="text/javascript" src="javascript/comm/comm.js"></script>
<title>无标题文档</title>
</head>

<body>
	<form name="salarystandardForm" method="post"
		action="hr/salarystandard.do" id="myform">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--薪酬标准管理--薪酬标准登记
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="提交"
					onclick="getdata()" 
					class="BUTTON_STYLE1"> <input type="reset" value="清除"
					class="BUTTON_STYLE1"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="74" class="TD_STYLE1">薪酬标准编号</td>
				<td width="168" class="TD_STYLE2"><input type="text"
					name="standardId" value="" class="INPUT_STYLE2" id="my1"></td>
				<td width="83" class="TD_STYLE1">薪酬标准名称</td>
				<td width="171" class="TD_STYLE2"><input type="text"
					name="standardName" value="" class="INPUT_STYLE2" id="my2"></td>
				<td width="170" class="TD_STYLE1">薪酬总额</td>
				<td width="138" class="TD_STYLE2">&nbsp;</td>
				<td width="103" class="TD_STYLE1">&nbsp;</td>
				<td width="95" height="26" class="TD_STYLE2">&nbsp;</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">制定人</td>
				<td class="TD_STYLE2"><input type="text" name="designer"
					value="" class="INPUT_STYLE2" id="my3"></td>
				<td class="TD_STYLE1">登记人</td>
				<td class="TD_STYLE2"><input type="text" name="register"
					value="" class="INPUT_STYLE2" id="my4">
				</td>
				<td class="TD_STYLE1">登记时间</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.str_registeTime" value="${cdate } "
					readonly="readonly" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">&nbsp;</td>
				<td class="TD_STYLE2">&nbsp;</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">备注</td>
				<td colspan="7" class="TD_STYLE2"><textarea name="remark"
						rows="4" class="TEXTAREA_STYLE1" id="my5"></textarea></td>
			</tr>
			<tr class="TD_STYLE1">
				<td align="center">序号</td>
				<td colspan="3">薪酬项目名称</td>
				<td>金额</td>
				<td colspan="3">&nbsp;</td>
			</tr>

			<tr class="TD_STYLE2">
				<td align="center">1 <input type="hidden" name="list[0].itemId"
					value="1">
				</td>
				<td colspan="3">出差补助 <input type="hidden"
					name="list[0].itemName" value="出差补助">
				</td>
				<td><input type="text" name="list[0].salary" value=""
					class="INPUT_STYLE2"  id="td1"></td>
				<td colspan="3">&nbsp;</td>
			</tr>

			<tr class="TD_STYLE2">
				<td align="center">2 <input type="hidden" name="list[1].itemId"
					value="2">
				</td>
				<td colspan="3">交通补贴 <input type="hidden"
					name="list[1].itemName" value="交通补贴">
				</td>
				<td><input type="text" name="list[1].salary" value=""
					class="INPUT_STYLE2"  id="td2"></td>
				<td colspan="3">&nbsp;</td>
			</tr>

			<tr class="TD_STYLE2">
				<td align="center">3 <input type="hidden" name="list[2].itemId"
					value="3">
				</td>
				<td colspan="3">住房补贴 <input type="hidden"
					name="list[2].itemName" value="住房补贴">
				</td>
				<td><input type="text" name="list[2].salary" value=""
					class="INPUT_STYLE2" id="td3"></td>
				<td colspan="3">&nbsp;</td>
			</tr>

			<tr class="TD_STYLE2">
				<td align="center">4 <input type="hidden" name="list[3].itemId"
					value="4">
				</td>
				<td colspan="3">基本工资 <input type="hidden"
					name="list[3].itemName" value="基本工资">
				</td>
				<td><input type="text" name="list[3].salary" value=""
					class="INPUT_STYLE2" id="td4"></td>
				<td colspan="3">&nbsp;</td>
			</tr>

			<tr class="TD_STYLE2">
				<td align="center">5 <input type="hidden" name="list[4].itemId"
					value="5">
				</td>
				<td colspan="3">年终奖 <input type="hidden"
					name="list[4].itemName" value="年终奖">
				</td>
				<td><input type="text" name="list[4].salary" value=""
					class="INPUT_STYLE2" id="td5"></td>
				<td colspan="3">&nbsp;</td>
			</tr>

			<tr class="TD_STYLE2">
				<td align="center">6 <input type="hidden" name="list[5].itemId"
					value="6">
				</td>
				<td colspan="3">误餐补助 <input type="hidden"
					name="list[5].itemName" value="误餐补助">
				</td>
				<td><input type="text" name="list[5].salary" value=""
					class="INPUT_STYLE2" id="td6"></td>
				<td colspan="3">&nbsp;</td>
			</tr>

		</table>
		<p>&nbsp;</p>
	</form>
</body>
</html>
<script type="text/javascript" src="javascript/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	 function getdata() {
		var my1 = $("#my1").val();
		var my2 = $("#my2").val();
		var my3 = $("#my3").val();
		var my4 = $("#my4").val();
		var my5 = $("#my5").val();
		var str1 = $("#td1").val();
		var str2 = $("#td2").val();
		var str3 = $("#td3").val();
		var str4 = $("#td4").val();
		var str5 = $("#td5").val();
		var str6 = $("#td6").val();
		if (my1.length<=0||my2.length<=0||my3.length<=0||my4.length<=0||my5.length<=0||str1.length<=0||str2.length<=0||str3.length<=0||str4.length<=0||str5.length<=0||str6.length<=0) {
			alert("数据不能为空！");
			return;
		}
		$("#myform").submit();
		/*var salary_sum = Number(str1)+Number(str2)+Number(str3)+Number(str4)+Number(str5)+Number(str6);
		var obj = my1+","+my2+","+my3+","+my4+","+my5+","+str1+","+str2+","+str3+","+str4+","+str5+","+str6+","+salary_sum;
		 $.ajax({
			type:"POST",
			url:"hr/salarystandard.do?str="+obj,
			data:obj,
			contentType:"application/json; charset=utf-8", 
			 async : true,
            cache : false,
            contentType : false,
            processData : false,
			enctype:'multipart/form-data',
			 dataType:"json", 
			success:function(data){
				console.log(data.result);
				window.location.href="salarystandard_register_success.jsp";
			},
			error:function(){
				console.log(2);
				window.location.href="salarystandard_register_success.jsp";
			}
		});*/
	} 
</script>