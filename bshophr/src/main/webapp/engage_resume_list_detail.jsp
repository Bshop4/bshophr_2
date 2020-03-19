<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'engage_resume.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/table.css"/>


  </head>
  
 <body>
		<form name="humanfileForm" action="zjlEngageResume/updateResume.do" method="post">
			<input type="hidden" value="${obj.resId}" name="resId" id="resId"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--简历管理--简历筛选--简历筛选编辑
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="推荐" class="BUTTON_STYLE1" id="mysubmit">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick=history.back();>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">

						<select name="humanMajorKindName" class="SELECT_STYLE1">
								<option>${obj.humanMajorKindName }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2" width="20%">
						<select name="humanMajorName" class="SELECT_STYLE1">
							<option>${obj.humanMajorName }</option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="engageType" class="SELECT_STYLE1">
							<option value="${obj.engageType }">${obj.engageType }</option>
						</select>
					</td>
					<td rowspan="6">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text"
							value="${obj.humanName }"
							name="humanName" class="INPUT_STYLE2" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="humanSex" class="SELECT_STYLE1">
							<option value="${obj.humanSex }">${obj.humanSex }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanEmail"
							value="${obj.humanEmail }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanTelephone"
							value="${obj.humanTelephone }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanHomephone"
							value="${obj.humanHomephone }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanMobilephone"
							value="${obj.humanMobilephone }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanAddress"
							value="${obj.humanAddress }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>

					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanPostcode"
							value="${obj.humanPostcode }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="humanNationality" class="SELECT_STYLE1">
							<option value="${obj.humanNationality }">${obj.humanNationality }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBirthplace"
							value="${obj.humanBirthplace }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" colspan="2" class="TD_STYLE2">
						<input type="text" name="humanBirthday"
							value="${obj.humanBirthday }" readonly="readonly"
							class="INPUT_STYLE2" id="date_start">
							
							
					</td>

				</tr>
				<tr>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<select name="humanRace" class="SELECT_STYLE1">
							<option value="${obj.humanRace }">${obj.humanRace }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="humanReligion" class="SELECT_STYLE1">
							<option value="${obj.humanReligion }">${obj.humanReligion}</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="humanParty" class="SELECT_STYLE1">
							<option value="${obj.humanParty }">${obj.humanParty }</option>
						</select>
					</td>


				</tr>
				<tr>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanIdcard"
							value="${obj.humanIdcard }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAge"
							value="${obj.humanAge }" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						毕业院校
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanCollege"
							value="${obj.humanCollege }" readonly="readonly"
							class="INPUT_STYLE2" />
					</td>

					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedDegree"
							class="SELECT_STYLE1">
							<option value="${obj.humanEducatedDegree }">${obj.humanEducatedDegree }</option>
						</select>
					</td>

				</tr>
				<tr>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedYears"
							class="SELECT_STYLE1">
							<option value="${obj.humanEducatedYears }">${obj.humanEducatedYears }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedMajor"
							class="SELECT_STYLE1">
							<option value="${obj.humanEducatedMajor }">${obj.humanEducatedMajor }
					</td>

					<td class="TD_STYLE1">
						薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="demandSalaryStandard"
							value="${obj.demandSalaryStandard }" readonly="readonly"
							class="INPUT_STYLE2" />
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2">
						<input class="INPUT_STYLE2" value="${obj.registTime }" readonly="readonly" name="registTime">
					</td>

				</tr>
				<tr>

					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanSpecility" class="SELECT_STYLE1">
							<option value="${obj.humanSpecility }">${obj.humanSpecility }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanHobby" class="SELECT_STYLE1">
							<option value="${obj.humanHobby }">${obj.humanHobby }</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						推荐人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checker"
							value="${user}" readonly="readonly" id="checker"
							class="INPUT_STYLE2" />

					</td>
					<td class="TD_STYLE1">
						推荐时间
					</td>
					<td class="TD_STYLE2">
					<input type="text" name="checkTime"
							  id="checkTime" readonly="readonly" value="${t }"
							class="INPUT_STYLE2">
						 
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td> 
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanHistoryRecords" rows="4" readonly="readonly"
							class="TEXTAREA_STYLE1">${obj.humanHistoryRecords }
						</textarea>
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" readonly="readonly"
							class="TEXTAREA_STYLE1">${obj.remark }
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						推荐意见
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="recomandation" id="recomandation" rows="4"class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
<script src="js/jquery-1.8.3.min.js"></script>
<script>
	
	
	/* $("#mysubmit").click(function(){
		var resId = $("#resId").val();
		var recomandation = $("#recomandation").val();
		var checkTime = $("#checkTime").val();
		var checker = $("#checker").val();
		$.ajax({
			type : "post",
			url : "zjlEngageResume/updateResume.do",
			data : {"resId":resId,"recomandation":recomandation,"checker":checker,"checkTime":checkTime},
			success : function(re){
				alert(re)
			}
			
			
		});
		
	}) */
	
	
</script>

