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
<link rel="stylesheet" href="table.css" type="text/css" />
<link rel="stylesheet" type="text/css" media="all"
	href="javascript/calendar/calendar-win2k-cold-1.css">
<script type="text/javascript" src="javascript/calendar/cal.js"></script>
<script type="text/javascript" src="javascript/comm/comm.js"></script>
<script type="text/javascript" src="javascript/comm/list.js"></script>
<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
	

	function search() {
		//document.forms[0].action = document.forms[0].action + "?operate=toSearch&method=query";
		document.forms[0].action = "query_keywords.jsp";
		document.forms[0].submit();
	}
	function doExport(name) {
		//document.forms[0].action = "exportfile.do?operate=doExport&name="+name;
		document.forms[0].action = "excel_locate.jsp";
		document.forms[0].submit();
	}
</script>
</head>

<body>
	<form name="humanfileForm" method="post">
		<input type="hidden" class="djt_SelectN" value="${myselectmap}"/>
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案查询
				</font></td>
			</tr>
			<tr>
				<td align="right">
					<input type="button" value="开始" class="BUTTON_STYLE1" id="djtQlSearch"> 
					<input type="button"
					value="搜索" class="BUTTON_STYLE1" id="djtQueryKeywords"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择员工所在I级机构</td>
				<td width="84%" class="TD_STYLE2">
				<select name="item.firstKindName" size="5"
					class="SELECT_STYLE2" id="djtFirstSelect">
						<option value="">&nbsp;</option>
						<c:if test="${!empty firstSelect}">
						<c:forEach items="${firstSelect }" var="fs">
							<option value="${fs.firstKindId}">${fs.firstKindName }</option> 
						</c:forEach>
					</c:if>
				</select>
						</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请选择员工所在II级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.secondKindName" size="5"
					class="SELECT_STYLE2" id="djtSecondSelect"></select></td>
			</tr>
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择员工所在III级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.thirdKindName" size="5" class="SELECT_STYLE2" id="djtThirdSelect">
					</select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请选择职位分类</td>
				<td width="84%" class="TD_STYLE2"><select
					 size="5" name="item.humanMajorKindName"
					class="SELECT_STYLE2" id="djtJobClassSelect">
					</select>
					</td>
			</tr>
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择职位名称</td>
				<td width="84%" class="TD_STYLE2"><select
					 size="5" class="SELECT_STYLE2" name="item.humanMajorName" id="djtJobSelect">
					
					</select>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请输入建档时间</td>
				<td width="84%" class="TD_STYLE2">
				<input type="date"
					 value="" style="width: 14%"
					 id="dateStart">至<input type="date"
					value="" style="width: 14%"
					 id="dateEnd"> （YYYY-MM-DD）</td>
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
	})()
	
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
				var str="";
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
	
	
	/*查询*/
	$("#djtQlSearch").click(function(){
		var firstSelect=$("#djtFirstSelect option:selected").val();
		var secondSelect=$("#djtSecondSelect option:selected").val();
		var thirdSelect=$("#djtThirdSelect option:selected").val();
		var djtJobClassSelect=$("#djtJobClassSelect option:selected").val();
		var djtJobSelect=$("#djtJobSelect option:selected").val();
		var dateStart=$("#dateStart").val();
		var dateEnd=$("#dateEnd").val();
		
		console.log(djtJobClassSelect);
		console.log(djtJobSelect);
		
		window.location.href="/bshophr/djtQueryPage/djtSearch.do?firstKindId="+firstSelect
					+"&secondKindId="+secondSelect+"&thirdKindId="+thirdSelect+"&humanMajorKindId="
					+djtJobClassSelect+"&humanMajorId="+djtJobSelect+"&dateStart="+dateStart
					+"&dateEnd="+dateEnd;
	})
	
	$("#djtQueryKeywords").click(function(){
		var firstKindId=$("#djtFirstSelect option:selected").val();
		var secondKindId=$("#djtSecondSelect option:selected").val();
		var thirdKindId=$("#djtThirdSelect option:selected").val();
		var humanMajorKindId=$("#djtJobClassSelect option:selected").val();
		var humanMajorId=$("#djtJobSelect option:selected").val();
		var dateStart=$("#dateStart").val();
		var dateEnd=$("#dateEnd").val();
		
		window.location.href="queryKeywords/djtSearch.do?firstKindId="+firstKindId
					+"&secondKindId="+secondKindId+"&thirdKindId="+thirdKindId+"&humanMajorKindId="
					+humanMajorKindId+"&humanMajorId="+humanMajorId+"&dateStart="+dateStart
					+"&dateEnd="+dateEnd;
	})
	
	
</script>
</html>

