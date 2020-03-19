<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'interview_valid_resume.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="table.css" type="text/css">
  </head>
  
  <body>
  	 <form>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--面试管理--面试筛选  </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="radio" name="result"  value="建议面试">建议面试
						<input type="radio" name="result"   value="建议笔试">建议笔试
						<input type="radio" name="result"   value="建议录用">建议录用
						<input type="radio" name="result"  value="删除简历">删除简历
						<input type="button" value="确认" class="BUTTON_STYLE1" id="mybtn">
						<input type="button" value="返回" class="BUTTON_STYLE1" 
							onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="10%">
						职位分类
					</td>
					<td width="10%" class="TD_STYLE2">
					<input type="text" name="humanmajorkindname" id="humanmajorkindname" value="${re.humanMajorKindName }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td width="10%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="15%" class="TD_STYLE2">
						<input type="text" name="humanmajorname" id="humanmajorname" value="${re.humanMajorName }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td width="10%" class="TD_STYLE1">
						招聘类型
					</td>
					<td width="20%" class="TD_STYLE2" colspan="2">
						<input type="text" name="engagetype" value="${re.engageType }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					
					<td width="10%" rowspan="6" align="center">
						 
					</td>
					
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanname" id="humanname" value="${re.humanName }" readonly="readonly" class="INPUT_STYLE2">
						
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humansex" value="${re.humanSex }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanemail" value="${re.humanEmail }"  readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						电话号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humantelephone" value="${re.humanTelephone }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanhomephone" value="${re.humanHomephone }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanmobilephone" value="${re.humanMobilephone }" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanaddress" value="${re.humanAddress }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanpostcode" value="${re.humanPostcode }" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humannationality" value="${re.humanNationality }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanbirthplace" value="${re.humanBirthplace }"  readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td class="TD_STYLE2" colspan="2"> 
						<input type="text" name="humanbirthday" value="${re.humanBirthday }" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				
				<tr>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<input type="text" name="humanrace" value="${re.humanRace }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanreligion" value="${re.humanReligion }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2" colspan="2">
						<input type="text" name="humanparty" value="${re.humanParty }" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>

					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanidcard" value="${re.humanIdcard }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanage" value="${re.humanAge }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						毕业学校
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humancollege" value="${re.humanCollege }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1" width="10%">
						学历
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humaneducateddegree" value="${re.humanEducatedDegree }" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humaneducatedyears"  value="${re.humanEducatedYears }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humaneducatedmajor" value="${re.humanEducatedMajor }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="demandsalarystandard" value="${re.demandSalaryStandard }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="registtime" value="${re.registTime }" readonly="readonly" class="INPUT_STYLE2">
					
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanspecility" value="${re.humanSpecility }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanhobby" value="${re.humanHobby }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1"><span style="font-size: 10.5pt; font-family: 宋体;"></span> 
						推荐人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checker" value="${re.checker }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1"><span style="font-size: 10.5pt; font-family: 宋体;"></span> 
						推荐时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="checktime" value="${re.checkTime }" readonly="readonly" class="INPUT_STYLE2">
						 
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanhistoryrecords" rows="4"  
						class="TEXTAREA_STYLE1" readonly="readonly"> ${re.humanHistoryRecords }
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4"   class="TEXTAREA_STYLE1"  readonly="readonly"> ${re.remark }
						</textarea>
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						推荐意见
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea name="recomandation" rows="4"   class="TEXTAREA_STYLE1" readonly="readonly">${re.recomandation }						</textarea>
					</td>
				</tr>
				
				
				<tr>
					
					<td class="TD_STYLE1">
						形象评价
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${ei.imageDegree }" class="INPUT_STYLE2" id="imagedegree" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						口才评价
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${ei.nativeLanguageDegree }" class="INPUT_STYLE2" id=""nativelanguagedegree"" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						外语口语能力
					</td>
					<td class="TD_STYLE1">
						<input type="text" value="${ei.foreignLanguageDegree }" class="INPUT_STYLE2" id="foreignlanguagedegree" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						应变能力
					</td>
					<td class="TD_STYLE2">
					<input type="text" value="${ei.responseSpeedDegree }" class="INPUT_STYLE2" id="responsespeeddegree" readonly="readonly"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						EQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${ei.eqDegree }" class="INPUT_STYLE2" id="EQdegree" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						IQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${ei.iqDegree }" class="INPUT_STYLE2" id="IQdegree" readonly="readonly"/>

					</td>
					<td class="TD_STYLE1">
						综合素质
					</td>
					<td class="TD_STYLE1">
					<input type="text" value="${ei.multiQualityDegree }" class="INPUT_STYLE2" id="multiqualitydegree" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2"></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						面试人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="register" id="register" value="${ei.register }" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						面试时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="registetime"  value="${ei.registeTime}" readonly="readonly"
							  class="INPUT_STYLE2"  id="registetime" >
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
						面试评价
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea
							name="interviewcomment" id="interviewcomment" class="TEXTAREA_STYLE1"
							rows="4">${ei.interviewComment }</textarea>
					</td>
				</tr>
			</table>
			<input type="hidden" id="passRegistTime" value="${passRegistTime }" >
			<input type="hidden" id="passRegister" value="${passRegister }" >
			<input type="hidden" id="einId" value="${ei.einId }" >
			<input type="hidden" id="resumeId" value="${ei.resumeId }" >
		</form>

  </body>
</html>
 <script src="js/jquery-1.8.3.min.js"></script>
 <script>
	
 	$("#mybtn").click(function(){
 		
 		var passRegistTime = $("#passRegistTime").val();
 		var passRegister = $("#passRegister").val();
 		var einId = $("#einId").val();
 		var resumeId = $("#resumeId").val();
 		var passCheckcomment = $("input[name='result']:checked").val();
 	    if(passCheckcomment == undefined){
 			alert("请选择建议！")
 		}else{
 			
 			$.ajax({
 				type : "post",
 				url : "zjlEngageResume/updateInterviewResume.do",
 				data : {"passRegistTime":passRegistTime,"passRegister":passRegister,"einId":einId,
 				"resumeId":resumeId,"passCheckcomment":passCheckcomment},
 				success : function(re){
 					/* for(var i = 0; i<re.length;i++){
 						if(re[i] == "删除简历"){
 							alert("消息提示：删除简历成功！");
 						}
 						if(re[i] == "建议面试"){
 							alert("消息提示：建议面试成功！");
 						}
 						if(re[i] == "建议笔试"){
 							alert("消息提示：建议笔试成功！");
 						}
 						if(re[i] == "建议录用"){
 							alert("消息提示：建议录用成功！")
 						}
 						
 					} */
 					var str = re[0];
			 		location.href="interview_valid_resume_success.jsp?str="+str;
 				}
 			})
 		} 
 		
 	});
 
 </script>
