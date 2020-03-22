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
		<form name="fm" action="zjlTransfer/saveMajorChange.do" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是:人力资源--调动管理--调动登记</font>
					</td>
				</tr>
				
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
							id="mybtn">
						<input type="button" class="BUTTON_STYLE1"
							onclick="javascript:window.history.back();" value="返回">
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
							value="${obj.humanMajorKindName }" class="INPUT_STYLE2">
						<input type="hidden" name="majorKindId" value="${obj.humanMajorKindId}">
					</td>
					<td class="TD_STYLE1" width="12%">
						原职位名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorName"
							value="${obj.hunmaMajorName }" readonly="readonly" 
							class="INPUT_STYLE2">
						<input type="hidden" name="majorId" value="${obj.humanMajorId }">
					</td>
					<td class="TD_STYLE1">
						原薪酬标准
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="salaryStandardName"
							value="${obj.salaryStandardName }"
							readonly="readonly"   class="INPUT_STYLE2">
							<input type="hidden" name="salaryStandardId" value="${obj.salaryStandardName }">
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
   					<select style="width:160px" name="newFirstKindName" id="newFirstKindName" size="1" class="SELECT_STYLE2">						
						<option value="">&nbsp;</option>
						<c:if test="${!empty firstList}">
							<c:forEach items="${firstList }" var="fl">
								<option value="${fl}">${fl }</option> 
							</c:forEach>
						</c:if>						  			
					</select>
					</td>
					<td class="TD_STYLE1" width="12%">
						新二级机构名称
					</td>
					<td class="TD_STYLE2">
   					<select style="width:160px" name="newSecondKindName" id="newSecondKindName" size="1" class="SELECT_STYLE2">						
							<option value="">&nbsp;</option>						
					  </select>
					</td>
					<td class="TD_STYLE1" width="12%">
						新三级机构名称
					</td>
					<td class="TD_STYLE2">
						 <select style="width:160px" name="newThirdKindName" id="newThirdKindName" size="1" class="SELECT_STYLE2">		
								<option value="">&nbsp;</option>						
					   </select>
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
						 <select style="width:160px" name="newMajorKindName" id="newMajorKindName" size="1" class="SELECT_STYLE2">						
							<option value="">&nbsp;</option>
							<c:if test="${!empty majorKindNameList}">
								<c:forEach items="${majorKindNameList }" var="mknl">
									<option value="${mknl}">${mknl }</option> 
								</c:forEach>
							</c:if>
					  			
					  </select>
					</td>
					<td class="TD_STYLE1" width="12%">
						新职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="newMajorName" id="newMajorName" class="INPUT_STYLE2">
							<option value="">&nbsp;</option>	
						</select>
					</td>
					<td class="TD_STYLE1">
						新薪酬标准
					</td>
					<td class="TD_STYLE2">
						 <select style="width:160px" name="newSalaryStandardName" id="newSalaryStandardName" size="1" class="SELECT_STYLE2">						
							<option value="">&nbsp;</option>
					  		<c:if test="${!empty listss}">
								<c:forEach items="${listss }" var="listss">
									<option value="${listss.standardName}">${listss.standardName }</option> 
								</c:forEach>
							</c:if>
					 	 </select>
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
						<input type="text" name="register" readonly="readonly" value="${register }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="registTime" readonly="readonly" value="${registTime }"
							id="Tdate" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">

					</td>
					<td class="TD_STYLE2">

					</td>
					<td class="TD_STYLE1">

					</td>
					<td class="TD_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						调动原因
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="changeReason" id="changeReason" rows="6" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$("#newFirstKindName").change(function(){
		
		var val = $('#newFirstKindName option:selected').val();
		/* 一级不为空 找二级 */
		if(val != ""){
			$("#newSecondKindName").empty();
			$.ajax({
				type : "post",
				url : "zjlTransfer/querySecondKindName.do",
				data : {"firstKindName" : val},
				success : function(re){
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#newSecondKindName").append(str);
				}
			})
		}
		
		/* 如果一级为空  全部清空 */
		if(val == ""){
			$("#newSecondKindName").empty();
			$("#newThirdKindName").empty();
			
			var str = `
				<option>&nbsp;</option>
			`;
			$("#newSecondKindName").append(str);
			
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#newThirdKindName").append(str1);
			
		}
		
	 });
	 
	 
	 $("#newSecondKindName").change(function(){
		
		var val = $('#newSecondKindName option:selected').val();
		
		/* 二级不为空 找三级 */
		 if(val != ""){
			$("#newThirdKindName").empty();
			$.ajax({
				type : "post",
				url : "zjlTransfer/queryThirdKindName.do",
				data : {"secondKindName" : val},
				success : function(re){
					
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#newThirdKindName").append(str);
				}
			})
		} 
		
		/* 如果二级为空  三级清空 */
		if(val == ""){
			$("#newThirdKindName").empty();
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#newThirdKindName").append(str1);
		}
	 });
	 
	 
	 /* 职位分类 */
	$("#newMajorKindName").change(function(){
		var val = $('#newMajorKindName option:selected').val();
		/* 职位类型不为空 找职位名称 */
		if(val != ""){
			$("#newMajorName").empty();
			$.ajax({
				type : "post",
				url : "zjlTransfer/queryMajorKindName.do",
				data : {"majorName" : val},
				success : function(re){
					
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#newMajorName").append(str);
				}
			})
		} 
		
		/* 如果职位类型为空  职位名称清空 */
		if(val == ""){
			$("#newMajorName").empty();
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#newMajorName").append(str1);
		} 
	 });
	 
	 
	 
	 $("#mybtn").click(function(){
	 	
	 	var newFirstKindName = $("#newFirstKindName option:selected").val();
		var newSecondKindName = $("#newSecondKindName option:selected").val();
		var newThirdKindName = $("#newThirdKindName option:selected").val();
		var newMajorKindName = $("#newMajorKindName option:selected").val();
		var newMajorName = $("#newMajorName option:selected").val();
		var newSalaryStandardName = $("#newSalaryStandardName option:selected").val();
		var changeReason = $("#changeReason").val();
	 	
	 	if(newFirstKindName == "" || newSecondKindName == "" || newThirdKindName == "" ||
	 	newMajorKindName == "" || newMajorName == "" || newSalaryStandardName == "" || 
	 	changeReason == ""){
	 		alert("请填写必要信息！");
	 		return;
	 	}
	 	
	 	$("form[name='fm']").submit();
	 
	 })
	 
	 

</script>
