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
		<form name="fm" action="zjlTransfer/updateMajorChange.do" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是:人力资源--调动管理--调动审核</font>
					</td>
				</tr>
				
				<tr>
					<td align="right">
						<input type="hidden" name="mchId" value="${obj.mchId }">
						<input type="radio" name="isPass" value="通过">通过
						<input type="radio" name="isPass" value="不通过">不通过
						<input type="button" value="确认" class="BUTTON_STYLE1" id="mybtn">
						<input type="button" class="BUTTON_STYLE1" onclick="javascript:window.history.back();" value="返回">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				
				<tr height="21">
					<td class="TD_STYLE1" width="8%">
						档案编号
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="humanId" readonly="readonly"
							value="${obj.humanId }" class="INPUT_STYLE2">
							
					</td>
					<td class="TD_STYLE1" width="8%">
						姓名
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="humanName"
							value="${obj.humanName }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>
				<tr>
				
					<td class="TD_STYLE1" width="8%">
						原一级机构
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="firstKindName"
							readonly="readonly" value="${obj.firstKindName }"
							class="INPUT_STYLE2">
					<input type="hidden" name="firstKindId" value="${obj.firstKindId }">
					</td>
					<td class="TD_STYLE1" width="8%">
						原二级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="secondKindName"
							 readonly="readonly" value="${obj.secondKindName }"
							class="INPUT_STYLE2">
							<input type="hidden" name="secondKindId" value="${obj.secondKindId }">
					</td>
					<td class="TD_STYLE1" width="8%">
						原三级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="thirdKindName"
							 readonly="readonly" value="${obj.thirdKindName }"
							class="INPUT_STYLE2">
							<input type="hidden" name="thirdKindId" value="${obj.thirdKindId }">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						原职位分类
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorKindName"
							 readonly="readonly"
							value="${obj.majorKindName }" class="INPUT_STYLE2">
							<input type="hidden" name="majorKindId" value="${obj.majorKindId }">
					</td>
					<td class="TD_STYLE1" width="12%">
						原职位名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorName"
							value="${obj.majorName }" readonly="readonly" 
							class="INPUT_STYLE2">
							<input type="hidden" name="majorId" value="${obj.majorId }">
					</td>
					<td class="TD_STYLE1">
						原薪酬标准
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="salaryStandardName"
							value="${obj.salaryStandardName }"
							readonly="readonly"   class="INPUT_STYLE2">
							<input type="hidden" name="salaryStandardId" value="${obj.salaryStandardId }">
					</td>
					<td class="TD_STYLE1">
					</td>
					<td class="TD_STYLE2">
						
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						新一级机构名称
					</td>
					<td class="TD_STYLE2">
					<input type="text" name="newFirstKindName"
							value="${obj.newFirstKindName }"
							readonly="readonly"   class="INPUT_STYLE2">
							<input type="hidden" name="newFirstKindId" value="${obj.newFirstKindId }">
					</td>
					<td class="TD_STYLE1" width="12%">
						新二级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="newSecondKindName"
								value="${obj.newSecondKindName }"
								readonly="readonly"   class="INPUT_STYLE2">
								<input type="hidden" name="newSecondKindId" value="${obj.newSecondKindId }">
					</td>
					<td class="TD_STYLE1" width="12%">
						新三级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="newThirdKindName"
								value="${obj.newThirdKindName }"
								readonly="readonly"   class="INPUT_STYLE2">
								<input type="hidden" name="newThirdKindId" value="${obj.newThirdKindId }">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						新职位分类
					</td>
					<td class="TD_STYLE2">
					<input type="text" name="newMajorKindName"
								value="${obj.newMajorKindName }"
								readonly="readonly"   class="INPUT_STYLE2">
								<input type="hidden" name="newMajorKindId" value="${obj.newMajorKindId }">
					</td>
					<td class="TD_STYLE1" width="12%">
						新职位名称
					</td>
					<td class="TD_STYLE2">
					<input type="text" name="newMajorName"
								value="${obj.newMajorName }"
								readonly="readonly"   class="INPUT_STYLE2">
								<input type="hidden" name="newMajorId" value="${obj.newMajorId }">
					</td>
					<td class="TD_STYLE1">
						新薪酬标准
					</td>
					<td class="TD_STYLE2">
					<input type="text" name="newSalaryStandardName"
								value="${obj.newSalaryStandardName }"
								readonly="readonly"   class="INPUT_STYLE2">
								<input type="hidden" name="newSalaryStandardId" value="${obj.newSalaryStandardId }">
					</td>
					<td class="TD_STYLE1">
					</td>
					<td class="TD_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="register" readonly="readonly" value="${obj.register }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="registTime" readonly="readonly" value="${obj.registTime }"
							id="Tdate" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						审核人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checker" readonly="readonly" value="${checker }"
							id="checker" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						审核时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checkTime" readonly="readonly" value="${checkTime }"
							id="checker" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						调动原因
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="changeReason" id="changeReason" rows="6" class="TEXTAREA_STYLE1">${obj.changeReason }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						审核意见
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="checkReason" id="checkReason" rows="6" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">

	 
	 
	 
	 $("#mybtn").click(function(){
	 	
	 	var isPass = $("input[name='isPass']:checked").val()
	 	var checkReason = $("#checkReason").val();
	 	
	 	if(isPass == undefined){
	 		alert("请选择是否通过！");
	 		return;
	 	}
	 	if(checkReason == ""){
	 		alert("请填写审核意见！");
	 		return;
	 	}
	 	
	 	
	 	
	 	$("form[name='fm']").submit();
	 
	 })
	 
	 

</script>
