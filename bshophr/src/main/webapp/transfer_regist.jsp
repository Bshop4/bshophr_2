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
		<form>
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是:人力资源--调动管理--调动登记</font>
					</td>
				</tr>
				
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
							onclick="mySubmit()">
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
						<input type="text" name="majorChange.humanId" readonly="readonly"
							value="bt201211190619440428" class="INPUT_STYLE2">
							
					</td>
					<td class="TD_STYLE1" width="8%">
						姓名
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.humanName"
							value="杨阳" readonly="readonly"
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
						<input type="text" name="majorChange.firstKindName"
							value="Ⅰ级结构" readonly="readonly" value=""
							class="INPUT_STYLE2">
					<input type="hidden" name="majorChange.firstKindId" value="1353318953319">
					</td>
					<td class="TD_STYLE1" width="8%">
						原二级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.secondKindName"
							value="Ⅱ级结构3" readonly="readonly" value=""
							class="INPUT_STYLE2">
							<input type="hidden" name="majorChange.secondKindId" value="1353318979558">
					</td>
					<td class="TD_STYLE1" width="8%">
						原三级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.thirdKindName"
							value="" readonly="readonly" value=""
							class="INPUT_STYLE2">
							<input type="hidden" name="majorChange.thirdKindId" value="1353319077370">
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
						<input type="text" name="majorChange.majorKindName"
							value="软件开发" readonly="readonly"
							value="" class="INPUT_STYLE2">
						<input type="hidden" name="majorChange.majorKindId" value="02">
					</td>
					<td class="TD_STYLE1" width="12%">
						原职位名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.majorName"
							value="程序员" readonly="readonly" 
							class="INPUT_STYLE2">
						<input type="hidden" name="majorChange.majorId" value="02">
					</td>
					<td class="TD_STYLE1">
						原薪酬标准
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.salaryStandardName"
							value="经理级别"
							readonly="readonly"   class="INPUT_STYLE2">
							<input type="hidden" name="majorChange.salaryStandardId" value="1353320082662">
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
   					<select style="width:160px" name="majorChange.newFirstKindId" id="firstKindId" size="1" class="SELECT_STYLE2">						
								<option value="0">-----请选择-----</option>					
					  			
					  				<option  value="1353318953319">Ⅰ级结构</option>	
					  			
					  				<option  value="1353318929919">集团</option>	
					  			
					  				<option  value="1353318937391">总部</option>	
					  			
					  </select>
					</td>
					<td class="TD_STYLE1" width="12%">
						新二级机构名称
					</td>
					<td class="TD_STYLE2">
   					<select style="width:160px" name="majorChange.newSecondKindId" id="secondKindId" size="1" class="SELECT_STYLE2">						
								<option value="0">-----请选择-----</option>						
					 		
					  </select>
					  <input type="hidden" name="majorChange.newSecondKindName" id="newSecondKindName">
					</td>
					<td class="TD_STYLE1" width="12%">
						新三级机构名称
					</td>
					<td class="TD_STYLE2">
						 <select style="width:160px" name="majorChange.newThirdKindId" id="thirdKindId" size="1" class="SELECT_STYLE2">		
								<option value="0">-----请选择-----</option>						
					   </select>
					   <input type="hidden" name="majorChange.newThirdKindName" id="newThirdKindName">
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
						 <select style="width:160px" name="majorChange.newMajorKindId" id="newMajorKindId" size="1" class="SELECT_STYLE2">						
								<option value="0">-----请选择-----</option>					
					  			
					  				<option  value="01">销售</option>	
					  			
					  				<option  value="02">软件开发</option>	
					  			
					  				<option  value="03">人力资源</option>	
					  			
					  				<option  value="04">生产部</option>	
					  			
					  </select>
					</td>
					<td class="TD_STYLE1" width="12%">
						新职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="majorChange.newMajorId" id="newMajorId" class="INPUT_STYLE2">
							<option value="0">-----请选择-----</option>	
						</select>
						 <input type="hidden" name="majorChange.newMajorName" id="newMajorName">
					</td>
					<td class="TD_STYLE1">
						新薪酬标准
					</td>
					<td class="TD_STYLE2">
						 <select style="width:160px" name="majorChange.newSalaryStandardId" id="newSalaryStandardId" size="1" class="SELECT_STYLE2">						
								<option value="0">-----请选择-----</option>					
					  			
					  				<option  value="1353320063473">普通员工</option>	
					  			
					  				<option  value="1353320082662">经理级别</option>	
					  			
					  				<option  value="1353320112255">董事长</option>	
					  			
					  </select>
					  <input type="hidden" name="majorChange.newSalaryStandardName" id="newSalaryStandardName">
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
						<input type="text" name="majorChange.register" readonly="readonly" value="better_admin"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.registTime" readonly="readonly"
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
						<textarea name="majorChange.changeReason" rows="6" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>
