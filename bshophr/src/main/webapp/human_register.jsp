<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" href="table.css" type="text/css">
<link rel="stylesheet" type="text/css" media="all"
	href="javascript/calendar/calendar-win2k-cold-1.css">
<script type="text/javascript" src="javascript/calendar/cal.js"></script>
<script type="text/javascript" src="javascript/comm/comm.js"></script>
<script type="text/javascript" src="javascript/comm/select.js"></script>
<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
//获取想要的数据

</script>
</head>

<body>
	<form name="humanfileForm" method="post" action="/hr/humanfile.do">
		<input type="hidden" id="djtList" value="${humanFile}"/>
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="提交"
					class="BUTTON_STYLE1"
					id="djtRegisterChoosePicture">
					<input type="reset" value="清除" class="BUTTON_STYLE1"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td class="TD_STYLE1" width="11%">I级机构</td>
				<td width="14%" class="TD_STYLE2"><select
					name="item.firstKindName"
					class="SELECT_STYLE1" id="djtFirstSelect">
					<option value="">&nbsp;</option>
					<c:if test="${!empty firstSelect}">
						<c:forEach items="${firstSelect }" var="fs">
							<option value="${fs.firstKindId}">${fs.firstKindName }</option> 
						</c:forEach>
					</c:if>
					</select></td>
				<td width="11%" class="TD_STYLE1">II级机构</td>
				<td width="14%" class="TD_STYLE2"><select
					name="item.secondKindName"
					class="SELECT_STYLE1" id="djtSecondSelect"></select></td>
				<td width="11%" class="TD_STYLE1">III级机构</td>
				<td class="TD_STYLE2" colspan="2"><select
					name="item.thirdKindName" class="SELECT_STYLE1" id="djtThirdSelect"></select></td>
				<td rowspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">职位分类</td>
				<td class="TD_STYLE2"><select name="item.humanMajorKindName"
					class="SELECT_STYLE1" id="djtJobClassSelect"></select></td>
				<td class="TD_STYLE1">职位名称</td>
				<td class="TD_STYLE2"><select name="item.hunmaMajorName"
					class="SELECT_STYLE1" id="djtJobSelect"></select></td>
				<td class="TD_STYLE1">职称</td>
				<td colspan="2" class="TD_STYLE2"><select
					name="item.humanProDesignation" class="SELECT_STYLE1"><option
							value="工程师">工程师</option>

						<option value="经理">经理</option>

						<option value="助理">助理</option>

						<option value="教授">教授</option>

						<option value="讲师">讲师</option>

						<option value="技术支持">技术支持</option></select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">姓名</td>
				<td class="TD_STYLE2"><input type="text" name="item.humanName"
					value="${humanFile.humanName}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">性别</td>
				<td class="TD_STYLE2"><select name="item.humanSex"
					class="SELECT_STYLE1" id="djtHumanSex">
					<option value="男">男</option>
						<option value="女">女</option>
						</select></td>
				<td class="TD_STYLE1">EMAIL</td>
				<td colspan="2" class="TD_STYLE2"><input type="text"
					name="item.humanEmail" value="${humanFile.humanEmail}" class="INPUT_STYLE2"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">电话</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.humanTelephone" value="${humanFile.humanTelephone}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">QQ</td>
				<td class="TD_STYLE2"><input type="text" name="item.humanQq"
					value="${humanFile.humanQq}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">手机</td>
				<td colspan="2" class="TD_STYLE2"><input type="text"
					name="item.humanMobilephone" value="${humanFile.humanMobilephone}" class="INPUT_STYLE2">
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">住址</td>
				<td colspan="3" class="TD_STYLE2"><input type="text"
					name="item.humanAddress" value="${humanFile.humanAddress}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">邮编</td>
				<td colspan="2" class="TD_STYLE2"><input type="text"
					name="item.humanPostcode" value="${humanFile.humanPostcode}" class="INPUT_STYLE2"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">国籍</td>
				<td class="TD_STYLE2"><select name="item.humanNationality"
					class="SELECT_STYLE1">
						<option value="中国">中国</option>
						<option value="美国">美国</option></select></td>
				<td class="TD_STYLE1">出生地</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.humanBirthplace" value="${humanFile.humanBirthplace}" class="INPUT_STYLE2">
				</td>
				<td class="TD_STYLE1">生日</td>
				<td width="13%" class="TD_STYLE2"><input type="text"
					name="item.str_humanBirthday" value="${humanFile.humanBirthday}" class="INPUT_STYLE2"
					id="date_start"></td>
				<td width="11%" class="TD_STYLE1">民族</td>
				<td class="TD_STYLE2" width="14%"><select name="item.humanRace"
					class="SELECT_STYLE1">
						<option value="汉族">汉族</option>
						<option value="回族">回族</option></select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">宗教信仰</td>
				<td class="TD_STYLE2"><select name="item.humanReligion"
					class="SELECT_STYLE1">
					<option value="无">无</option>
					<option value="佛教">佛教</option></select></td>
				<td class="TD_STYLE1">政治面貌</td>
				<td class="TD_STYLE2"><select name="item.humanParty"
					class="SELECT_STYLE1">
						<option value="党员">党员</option>
						<option value="群众">群众</option>
					</select></td>
				<td class="TD_STYLE1">身份证号码</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.humanIdCard" value="${humanFile.humanIdCard}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">社会保障号码</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.humanSocietySecurityId" value="${humanFile.humanSocietySecurityId}" class="INPUT_STYLE2">
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">年龄</td>
				<td class="TD_STYLE2"><input type="text" name="item.humanAge"
					value="${humanFile.humanAge}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">学历</td>
				<td class="TD_STYLE2"><select name="item.humanEducatedDegree"
					class="SELECT_STYLE1">
					<option value="本科">本科</option>
						<option value="大专">大专</option></select></td>
				<td class="TD_STYLE1">教育年限</td>
				<td class="TD_STYLE2"><select name="item.humanEducatedYears"
					class="SELECT_STYLE1"><option value="12">12</option>
						<option value="16">16</option></select></td>
				<td class="TD_STYLE1">学历专业</td>
				<td class="TD_STYLE2"><select name="item.humanEducatedMajor"
					class="SELECT_STYLE1"><option value="生物工程">生物工程</option>
						<option value="计算机">计算机</option></select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">薪酬标准</td>
				<td class="TD_STYLE2"><select name="item.salaryStandardName"
					class="SELECT_STYLE1"><option value="0/未定义">0/未定义</option></select>
				</td>
				<td class="TD_STYLE1">开户行</td>
				<td class="TD_STYLE2"><input type="text" name="item.humanBank"
					value="${humanFile.humanBank}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">帐号</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.humanAccount" value="${humanFile.humanAccount}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">登记人</td>
				<td class="TD_STYLE2"><input type="text" name="item.register"
					value="${humanFile.register}" readonly="readonly" class="INPUT_STYLE2">
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">建档时间</td>
				<td class="TD_STYLE2"><input type="text"
					name="item.str_registTime" value="${humanFile.registTime}"
					readonly="readonly" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">特长</td>
				<td class="TD_STYLE2"><select name="item.humanSpeciality"
					class="SELECT_STYLE1">
					<option value="数据库">数据库</option>

						<option value="java">java</option></select></td>
				<td class="TD_STYLE1">爱好</td>
				<td class="TD_STYLE2"><select name="item.humanHobby"
					class="SELECT_STYLE1">
					<option value="篮球">篮球</option>

						<option value="舞蹈">舞蹈</option></select></td>
				<td class="TD_STYLE1">&nbsp;</td>
				<td class="TD_STYLE2">&nbsp;</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">个人履历</td>
				<td colspan="7" class="TD_STYLE2"><textarea
						name="item.humanHistroyRecords" rows="4" class="TEXTAREA_STYLE1">${humanFile.humanHistroyRecords}</textarea>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">家庭关系信息</td>
				<td colspan="7" class="TD_STYLE2"><textarea
						name="item.humanFamilyMembership" rows="4" class="TEXTAREA_STYLE1">${humanFile.humanFamilyMembership}</textarea>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">备注</td>
				<td colspan="7" class="TD_STYLE2"><textarea name="item.remark"
						rows="4" class="TEXTAREA_STYLE1">${humanFile.remark}</textarea></td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
	Calendar.setup({
		inputField : "date_start",
		ifFormat : "%Y-%m-%d",
		showsTime : false,
		button : "date_start",
		singleClick : true,
		step : 1
	});
	Calendar.setup({
		inputField : "date_end",
		ifFormat : "%Y-%m-%d",
		showsTime : false,
		button : "date_end",
		singleClick : true,
		step : 1
	});
	
	
	$("#djtFirstSelect").change(function(){
		var firstSelect=$("#djtFirstSelect option:selected").val();
		/* 一级不为空 找二级 */
		if(firstSelect != ""){
			$.ajax({
	    		type:"POST",
				url:"queryLocate/secondSelect.do",
				data:{"firstSelect":firstSelect},
				dataType:"json",
				success:function(result){
				console.log(result);
			var str = "";
			for(var i = 0; i < result.length; i++) {
					str+="<option value='"+result[i].secondKindId+"'>"+result[i].secondKindName+"</option>";
			}
			$("#djtSecondSelect").append(str);
		}
	});
	}
	/* 如果一级为空  全部清空 */
	if(firstSelect == ""){
		$("#djtSecondSelect").empty();
		$("#djtThirdSelect").empty();
	}
	
	var str = `
				<option>&nbsp;</option>
			`;
			$("#djtSecondSelect").append(str);
			
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#djtThirdSelect").append(str1);
	
})

	$("#djtSecondSelect").change(function(){
		
		var val = $('#djtSecondSelect option:selected').val();
		
		/* 二级不为空 找三级 */
		 if(val != ""){
			$("#djtThirdSelect").empty();
			$.ajax({
				type:"POST",
				url:"queryLocate/thirdSelect.do",
				data:{"secondSelect":val},
				dataType:"json",
				success : function(result){
					var str = "<option></option>";
					for(var i = 0; i < result.length; i++){
						str+="<option value='"+result[i].thirdKindId+"'>"+result[i].thirdKindName+"</option>";
					}
					$("#djtThirdSelect").append(str);
				}
			})
		} 
		
		/* 如果二级为空  三级清空 */
		if(val == ""){
			$("#djtSecondSelect").empty();
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#djtThirdSelect").append(str1);
		}
	 });
	
	
	//工作选择
	(function(){
		$.ajax({
				type:"POST",
				url:"queryLocate/djtJobClassSelect.do",
				dataType:"json",
				success : function(result){
					var str = "<option></option>";
					for(var i = 0; i < result.length; i++){
						str+="<option value='"+result[i].majorKindId+"'>"+result[i].majorKindName+"</option>";
					}
					$("#djtJobClassSelect").append(str);
				}
			})
	})();
	
	$("#djtJobClassSelect").change(function(){
		$("#djtJobSelect").empty();
		var djtJobClassSelect=$("#djtJobClassSelect option:selected").val();
		/* 一级不为空 找二级 */
		if(djtJobClassSelect != ""){
			$.ajax({
	    		type:"POST",
				url:"queryLocate/djtJobSelect.do",
				data:{"majorKindId":djtJobClassSelect},
				dataType:"json",
				success:function(result){
				var str = "<option></option>";
				for(var i = 0; i < result.length; i++) {
					str+="<option value='"+result[i].majorId+"'>"+result[i].majorName+"</option>";
				}
				$("#djtJobSelect").append(str);
			}
		});
	}
		/* 如果一级为空  全部清空 */
		if(djtJobClassSelect == ""){
			$("#djtJobClassSelect").empty();
			$("#djtJobSelect").empty();
		}
			
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#djtJobSelect").append(str1);
	
	})
	
	
	/*取隐藏域的值*/
	var list=$("#djtList").val();
	if(list!=""){
		$("#djtFirstSelect>option").each(function(){
			if($(this).val()=="${firstKindId}"){
				$(this).prop("selected", true);
			}
		})
		
		$("#djtSecondSelect>option").each(function(){
			if($(this).val()=="${secondKindId}"){
				$(this).prop("selected", true);
			}
		})
		
		$("#djtThirdSelect>option").each(function(){
			if($(this).val()=="${thirdKindId}"){
				$(this).prop("selected", true);
			}
		})
		
		$("#djtJobClassSelect>option").each(function(){
			if($(this).val()=="${humanMajorKindId}"){
				$(this).prop("selected", true);
			}
		})
		
		$("#djtJobSelect>option").each(function(){
			if($(this).val()=="${humanMajorId}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanSex']>option").each(function(){
			if($(this).val()=="${humanSex}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanNationality']>option").each(function(){
			if($(this).val()=="${humanNationality}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanRace']>option").each(function(){
			if($(this).val()=="${humanRace}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanReligion']>option").each(function(){
			if($(this).val()=="${humanReligion}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanParty']>option").each(function(){
			if($(this).val()=="${humanParty}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanEducatedDegree']>option").each(function(){
			if($(this).val()=="${humanEducatedDegree}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanEducatedYears']>option").each(function(){
			if($(this).val()=="${humanEducatedYears}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanEducatedMajor']>option").each(function(){
			if($(this).val()=="${humanEducatedMajor}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.salaryStandardName']>option").each(function(){
			if($(this).val()=="${salaryStandardName}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanSpeciality']>option").each(function(){
			if($(this).val()=="${humanSpeciality}"){
				$(this).prop("selected", true);
			}
		})
		
		$("select[name='item.humanHobby']>option").each(function(){
			if($(this).val()=="${humanHobby}"){
				$(this).prop("selected", true);
			}
		})
	}
	
	
	$("#djtRegisterChoosePicture").click(function(){
		var firstKindId= $('#djtFirstSelect option:selected').val();
		var secondKindId= $('#djtSecondSelect option:selected').val();
		var thirdKindId= $('#djtThirdSelect option:selected').val();
		var humanMajorKindId= $('#djtJobClassSelect option:selected').val();
		var humanMajorId= $('#djtJobSelect option:selected').val();
	
		var humanProDesignation=$("select[name='item.humanProDesignation'] option:selected").val();

		
		var humanName=$("input[name='item.humanName']").val();
		var humanSex=$("select[name='item.humanSex'] option:selected").val();
		var humanBirthplace=$("input[name='item.humanBirthplace']").val();
		var humanBirthday=$("input[name='item.str_humanBirthday']").val();
		var humanNationality=$("select[name='item.humanNationality'] option:selected").val();
		var humanRace=$("select[name='item.humanRace'] option:selected").val();
		
		var humanReligion=$("select[name='item.humanReligion'] option:selected").val();
		var humanParty=$("select[name='item.humanParty'] option:selected").val();
		var humanIdCard=$("input[name='item.humanIdCard']").val();
		var humanSocietySecurityId=$("input[name='item.humanSocietySecurityId']").val();
		var humanAge=$("input[name='item.humanAge']").val();
		
		var humanEducatedDegree=$("select[name='item.humanEducatedDegree'] option:selected").val();
		var humanEducatedYears=$("select[name='item.humanEducatedYears'] option:selected").val();
		var humanEducatedMajor=$("select[name='item.humanEducatedMajor'] option:selected").val();
		var salaryStandardName=$("select[name='item.salaryStandardName'] option:selected").val();
		var humanBank=$("input[name='item.humanBank']").val();
		var humanAccount=$("input[name='item.humanAccount']").val();
		var register=$("input[name='item.register']").val();
		var registTime=$("input[name='item.registTime']").val();
		
		var humanSpeciality=$("select[name='item.humanSpeciality'] option:selected").val();
		var humanHobby=$("select[name='item.humanHobby'] option:selected").val();
		
		var humanHistroyRecords=$("input[name='item.humanHistroyRecords']").val();
		var humanFamilyMembership=$("input[name='item.humanFamilyMembership']").val();
		var remark=$("input[name='item.remark']").val();
		
		$.ajax({
			type:"POST",
			url:"registerChoosePicture/pageJump.do",
			data:{"firstKindId":firstKindId,
				"secondKindId":secondKindId,
				"thirdKindId":thirdKindId,
				"humanMajorKindId":humanMajorKindId,
				"humanProDesignation":humanProDesignation,
				"humanMajorId":humanMajorId,
				"humanName":humanName,
				"humanSex":humanSex,
				"humanBirthplace":humanBirthplace,
				"humanBirthday":humanBirthday,
				"humanNationality":humanNationality,
				"humanRace":humanRace,
				"humanReligion":humanReligion,
				"humanParty":humanParty,
				"humanIdCard":humanIdCard,
				"humanSocietySecurityId":humanSocietySecurityId,
				"humanAge":humanAge,
				"humanEducatedDegree":humanEducatedDegree,
				"humanEducatedYears":humanEducatedYears,
				"humanEducatedMajor":humanEducatedMajor,
				"salaryStandardName":salaryStandardName,
				"humanBank":humanBank,
				"humanAccount":humanAccount,
				"register":register,
				"registTime":registTime,
				"humanSpeciality":humanSpeciality,
				"humanHobby":humanHobby,
				"humanHistroyRecords":humanHistroyRecords,
				"humanFamilyMembership":humanFamilyMembership,
				"remark":remark,	
			},
			dataType:"json",
			success : function(result){
		}	
			})
		
	})
	
	
	
</script>
</html>


