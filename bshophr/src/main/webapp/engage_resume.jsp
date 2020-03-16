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
	<form id="recruitAction!saveEngageResume" name="fm" action="addResume" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：招聘管理--简历管理--简历登记 </font>
					 
					</td>
				</tr>
				<tr>
					<td align="right">
					 
						<input type="button" value="提交" class="BUTTON_STYLE1" id="mysubmit">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
						<td class="TD_STYLE1">
						*职位分类
					</td>
					<td class="TD_STYLE2">  
					<select name="humanmajorkindname" class="SELECT_STYLE1" id="humanMajorKindName">
						<option value="">&nbsp;</option>
						<c:if test="${!empty emrList }">
							<c:forEach items="${emrList }" var="i">
								<option value="${i }">${i }</option>
							</c:forEach>
						</c:if>
					</select>		
					</td>
					<td class="TD_STYLE1">
						*职位名称
					</td>
					<td class="TD_STYLE2" width="20%"> 
					<select name="humanmajorname" class="SELECT_STYLE1" id="humanMajorName">
						<option value="">&nbsp;</option>
					</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						*招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2"> 
					<select name="engagetype" class="SELECT_STYLE1" id="engageType">
						<option value="">&nbsp;</option>
					</select>
					</td>
					<td rowspan="6" >
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						*姓名
					</td>
					<td class="TD_STYLE2">
						 <input type="text"  name="humanname" id="name" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						*身份证号码
					</td>
					<td class="TD_STYLE1">
						<input type="text" name="humanidcard"  id="cardid" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						*性别
					</td>
					<td class="TD_STYLE1"  colspan="2">
						<select name="humansex" id="sex"  class="SELECT_STYLE1"><option value="男" id="man">男</option>
							<option value="女" id="woman">女</option></select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
					电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humantelephone"  id="phone" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
					 <input type="text" name="humanhomephone" id="humanHomephone" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						*手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanmobilephone" id="humanMobilephone" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						*住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanaddress" id="address" class="INPUT_STYLE2">
					</td>
					 
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanpostcode" id="postal" class="INPUT_STYLE2">
					</td>
				</tr>
				 
				<tr>
					<td class="TD_STYLE1">
						*国籍
					</td>
					<td class="TD_STYLE2">
					 <select name="humannationality"  id="humannationality"  class="SELECT_STYLE1">
					 	<option value="">&nbsp;</option>
						<c:if test="${!empty guoList }">
							<c:forEach items="${guoList }" var="i">
								<option value="${i }">${i }</option>
							</c:forEach>
						</c:if>
					 </select> 
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanbirthplace" class="INPUT_STYLE2" id="humanbirthplace">
					</td>
					<td class="TD_STYLE1">
						*生日
					</td>
					<td width="13%" colspan="2" class="TD_STYLE2">
						<input type="text" name="humanbirthday" id="birthday" class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
				<td width="11%" class="TD_STYLE1">
						*民族
					</td>
					<td class="TD_STYLE2" width="14%">
				 	 <select name="humanrace" id="humanrace"  class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty minList }">
								<c:forEach items="${minList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select>  
					</td>
					<td class="TD_STYLE1">
						*宗教信仰
					</td>
					<td class="TD_STYLE2">
					   <select name="humanreligion"  id="humanreligion"  class="SELECT_STYLE1"> 
							<option value="">&nbsp;</option>
							<c:if test="${!empty zongList }">
								<c:forEach items="${zongList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select>  
					</td>
					<td class="TD_STYLE1">
						*政治面貌
					</td>
					<td class="TD_STYLE2" colspan="2">
					   <select name="humanparty"  id="humanparty" class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty zhengList }">
								<c:forEach items="${zhengList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select>  	  
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						*EMAIL
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanemail" id="email" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						*年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanage" id="humanage" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						*毕业院校
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="humancollege" id="humancollege" class="INPUT_STYLE2"/>
					</td>
					
					<td class="TD_STYLE1">
						*学历
					</td>
					<td class="TD_STYLE2">
					  <select name="humaneducateddegree" id="humaneducateddegree"  class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty xueList }">
								<c:forEach items="${xueList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select> 
					</td>
					
				</tr>
				<tr>
				<td class="TD_STYLE1">
						*教育年限
					</td>
					<td class="TD_STYLE2">
					   <select name="humaneducatedyears" id="humaneducatedyears"  class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty jiaoList }">
								<c:forEach items="${jiaoList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select> 
					</td>
					<td class="TD_STYLE1">
						*学历专业
					</td>
					<td class="TD_STYLE2">
					   <select name="humaneducatedmajor" id="humaneducatedmajor"   class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty zhuanList }">
								<c:forEach items="${zhuanList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select>  
					</td>
					
					<td class="TD_STYLE1">
						*薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="demandsalarystandard" id="demandSalaryStandard" class="INPUT_STYLE2" />
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="registtime"
							  id="nowTime" readonly="readonly" value="${t}"
							class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
					 
					<td class="TD_STYLE1">
						*特长
					</td>
					<td class="TD_STYLE2">
					   <select name="humanspecility" id="humanspecility"   class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty teList }">
								<c:forEach items="${teList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select> 
						 
					</td>
					<td class="TD_STYLE1">
						*爱好
					</td>
					<td class="TD_STYLE2">
				     <select name="humanhobby" id="humanhobby"   class="SELECT_STYLE1">
							<option value="">&nbsp;</option>
							<c:if test="${!empty aiList }">
								<c:forEach items="${aiList }" var="i">
									<option value="${i }">${i }</option>
								</c:forEach>
							</c:if>
					 </select> 
						  
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						*个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanhistoryrecords" id="humanhistoryrecords" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				 
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" id="remark" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		 </form>
	</body>
</html>
<script src="js/jquery-1.8.3.min.js"></script>
<script>

	$("#humanMajorKindName").change(function(){
			$("#engageType").empty();
			
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#engageType").append(str1);
	});

	$("#humanMajorKindName").change(function(){
		
		var val = $('#humanMajorKindName option:selected').val();
		/* 职位种类不为空 找职位名称 */
		if(val != ""){
			$("#humanMajorName").empty();
			$.ajax({
				type : "post",
				url : "zjlEngageResume/queryHumanMajorName.do",
				data : {"humanMajorKindName" : val},
				success : function(re){
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#humanMajorName").append(str);
				}
			})
		} 
		
		/* 如果职位为空  全部清空 */
		if(val == ""){
			$("#humanMajorName").empty();
			$("#engageType").empty();
			
			var str = `
				<option>&nbsp;</option>
			`;
			$("#humanMajorName").append(str);
			
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#engageType").append(str1);
		}
	 });
	 
	 
	 
	 $("#humanMajorName").change(function(){
		
		var val = $('#humanMajorName option:selected').val();
		var val1 = $('#humanMajorKindName option:selected').val();
		/* 职位不为空   根据职位名称和职位种类找招聘类型 */
		 if(val != ""){
			$("#engageType").empty();
			$.ajax({
				type : "post",
				url : "zjlEngageResume/queryEngageType.do",
				data : {"humanMajorKindName" : val1,"humanMajorName" : val},
				success : function(re){
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#engageType").append(str);
				}
			})
		}  
		
		/* 如果职位名称为空  全部清空 */
		if(val == ""){
			$("#engageType").empty();
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#engageType").append(str1);
		}
	 });
	 
	 
	/*   */
	
	$("#mysubmit").click(function(){
		var humanMajorKindName = $('#humanMajorKindName option:selected').val();
		var humanMajorName = $('#humanMajorName option:selected').val();
		var engageType = $('#engageType option:selected').val();
		var name = $("#name").val();
		var cardid = $("#cardid").val();
		var sex = $("#sex option:selected").val();
		var phone = $("#phone").val();//不一定要求填
		var humanHomephone = $("#humanHomephone").val();//+1
		var humanMobilephone = $("#humanMobilephone").val();//一定
		var address = $("#address").val();
		var postal = $("#postal").val();
		var humannationality = $("#humannationality option:selected").val();
		var humanbirthplace = $("#humanbirthplace").val();
		var birthday = $("#birthday").val();
		var humanrace = $("#humanrace option:selected").val();
		var humanreligion = $("#humanreligion option:selected").val();
		var humanparty = $("#humanparty option:selected").val();
		var humanage = $("#humanage").val();
		var humancollege = $("#humancollege").val();
		var humaneducateddegree = $("#humaneducateddegree option:selected").val();
		var humaneducatedyears = $("#humaneducatedyears option:selected").val();
		var humaneducatedmajor = $("#humaneducatedmajor option:selected").val();
		var demandSalaryStandard = $("#demandSalaryStandard").val();
		var nowTime = $("#nowTime").val();
		var humanspecility = $("#humanspecility").val();
		var humanhobby = $("#humanhobby").val();
		var humanhistoryrecords = $("#humanhistoryrecords").val();
		var remark = $("#remark").val();
		var email = $("#email").val();
		
		
		
		if(humanMajorKindName==""|| humanMajorName==""|| engageType==""|| name==""||
		cardid==""|| sex==""|| humanMobilephone==""|| address==""|| humannationality==""||
		birthday==""|| humanrace==""|| humanreligion==""|| humanparty==""|| humanage==""||
		humancollege==""|| humaneducateddegree==""|| humaneducatedyears==""|| humaneducatedmajor==""||
		demandSalaryStandard==""|| humanspecility==""|| humanhobby=="" || humanhistoryrecords==""){
			alert("请填写必要信息！");
			return;
		}
		
		//验证身份证
		var reg = /(^\d{18}$)|(^\d{17}(\d|X|x)$)/; 
		if(!reg.test(cardid)){
			alert("请输入格式正确的身份证");
			return;
		}
		
		//验证手机号
		var test = /^1[358][0-9]{9}$/;
		if(!test.test(humanMobilephone)){
			alert("请输入格式正确的手机号");
			return;
		}
		
		//年龄
		var agetest=/^[1-9][0-9]$/;
		if(!agetest.test(humanage) || humanage < 18){
			alert("年龄不符");
			return;
		}
		
		//邮箱
		var emailReg = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if(!emailReg.test(email)){
			alert("请输格式正确的邮箱");
			return;
		}
		
		
		$.ajax({
			
			type : "post",
			url : "zjlEngageResume/saveEngageResume.do",
			data : {"humanMajorKindName":humanMajorKindName,"humanMajorName":humanMajorName,"engageType":engageType,"humanName":name,
			"humanIdcard":cardid,"humanSex":sex,"humanTelephone":phone,"humanHomephone":humanHomephone,
			"humanMobilephone":humanMobilephone,"humanAddress":address,"humanPostcode":postal,"humanNationality":humannationality,
			"humanBirthplace":humanbirthplace,"humanBirthday":birthday,"humanRace":humanrace,"humanReligion":humanreligion,
			"humanParty":humanparty,"humanAge":humanage,"humanCollege":humancollege,"humanEducatedDegree":humaneducateddegree,
			"humanEducatedYears":humaneducatedyears,"humanEducatedMajor":humaneducatedmajor,"demandSalaryStandard":demandSalaryStandard,"registTime":nowTime,
			"humanSpecility":humanspecility,"humanHobby":humanhobby,"humanHistoryRecords":humanhistoryrecords,"remark":remark,"humanEmail":email},
			success : function(re){
				alert(re)			
			}
			
		});
	});
	 
	 
</script>
