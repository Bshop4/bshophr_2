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
    
    <title>My JSP 'major_release.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <style>
        .resizeDivClass
        {
            position:relative;
            background-color:#DEDBD6;
            width:2;
            z-index:1;
            left:expression(this.parentElement.offsetWidth-1);
            cursor:e-resize;

        }
        A:visited {
            TEXT-DECORATION: none
        }
        A:active {
            TEXT-DECORATION: none
        }
        A:hover {
            TEXT-DECORATION: underline overline
        }
        A:link {
            TEXT-DECORATION: none
        }
        .t {
            LINE-HEIGHT: 1.4
        }
        BODY {
            background-color:#E9F8F3;
            FONT-FAMILY:??;
            FONT-SIZE: 9pt;
            SCROLLBAR-HIGHLIGHT-COLOR: buttonface;
            SCROLLBAR-SHADOW-COLOR: buttonface;
            SCROLLBAR-3DLIGHT-COLOR: buttonhighlight;
            SCROLLBAR-TRACK-COLOR: #eeeeee;
            SCROLLBAR-DARKSHADOW-COLOR: buttonshadow;
            margin-left: 0px;
            margin-top: 0px;
            margin-right: 0px;
            margin-bottom: 0px;
        }
        TD {
            FONT-FAMILY: ??; FONT-SIZE: 9pt
        }
        DIV {
            FONT-FAMILY: ??; FONT-SIZE: 9pt
        }
        FORM {
            FONT-FAMILY: ??; FONT-SIZE: 9pt
        }
        OPTION {
            FONT-FAMILY: ??; FONT-SIZE: 9pt
        }
        P {
            FONT-FAMILY: ??; FONT-SIZE: 9pt
        }
        TD {
            FONT-FAMILY: ??; FONT-SIZE: 9pt
        }
        BR {
            FONT-FAMILY: 宋体; FONT-SIZE: 9pt
        }

        TEXTAREA {
            BACKGROUND-COLOR: #efefef; BORDER-BOTTOM-COLOR: #000000; BORDER-BOTTOM-WIDTH: 1px; BORDER-LEFT-COLOR: #000000; BORDER-LEFT-WIDTH: 1px; BORDER-RIGHT-COLOR: #000000; BORDER-RIGHT-WIDTH: 1px; BORDER-TOP-COLOR: #000000; BORDER-TOP-WIDTH: 1px; FONT-FAMILY: 宋体 ; FONT-SIZE: 9pt
        }
        SELECT {
            BACKGROUND-COLOR: #efefef; BORDER-BOTTOM-COLOR: #000000; BORDER-BOTTOM-WIDTH: 1px; BORDER-LEFT-COLOR: #000000; BORDER-LEFT-WIDTH: 1px; BORDER-RIGHT-COLOR: #000000; BORDER-RIGHT-WIDTH: 1px; BORDER-TOP-COLOR: #000000; BORDER-TOP-WIDTH: 1px; FONT-FAMILY: 宋体 ; FONT-SIZE: 9pt
        }

        .gray {
            CURSOR: hand; FILTER: gray
        }
        .style3 {
            font-size: 16px;
            font-weight: bold;
        }
        .TABLE_STYLE1{
            border: 1px solid;
            border-color:#000000;
            border-collapse: collapse;
            width: 100%;

        }
        .TABLE_STYLE2{
            width: 100%;
        }
        .ALL-STYLE{
            border: 1px ridge #666666;
            border-color:#DEDBD6;

        }
        .TR_STYLE1{

        }

        .style8 {color: #000066}



        .TD_HANDBOOK_STYLE1 {
            vertical-align : top ;
            width:100%;
            color:#0000FF;
        }

        .TD_STYLE1{
            background-color:#96E1A0;
            border-width:1;
        }

        .TD_STYLE2{
            border-spacing: 1px;
            background-color:#D4F8D4;
            border-color:#DEDBD6
        }
        .TD_STYLE3{

        }
        .SUBMIT_STYLE1{
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid

        }
        .BUTTON_STYLE1{
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid
        }
        .RESET_STYLE1{
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid
        }
        .RADIO_STYLE1{

        }
        .CHECKBOX_STYLE1{

        }
        .SELECT_STYLE1{
            width:100%;
        }
        .SELECT_STYLE2{
            width:30%;
        }
        .TEXTAREA_STYLE1{
            width:100%;
        }
        .DIV_STYLE1{

            float :right ;
            vertical-align : top ;

        }
        .DIV_STYLE2{

            float :center ;
            vertical-align : top ;

        }
        .INPUT_STYLE1{
            background-color:#D4F8D4;
            width:30%
        }
        .INPUT_STYLE2{
            background-color:#D4F8D4;
            width:100%
        }
        .FILE_STYLE1{
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid
        }
        .btn3_mouseout {
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid
        }
        .btn3_mouseover {
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#D7E7FA); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid
        }
        .btn3_mousedown
        {
            BORDER-RIGHT: #FFE400 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #FFE400 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #FFE400 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #FFE400 1px solid
        }
        .btn3_mouseup {
            BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid
        }

    </style>
    
    
    
</head>
<body>

<form name="humanfileForm">
    <table width="100%">
        <tr>
            <td>
                <font color="#0000CC">您正在做的业务是：招聘管理--职位发布管理--职位发布登记</font>
            </td>
        </tr>
        <tr>
            <td align="right">
                <input type="button" value="提交" class="BUTTON_STYLE1" id="submit">
                <input type="reset" value="返回" class="BUTTON_STYLE1">
            </td>
        </tr>
    </table>
    <table width="100%" border="1" cellpadding=0 cellspacing=1
           bordercolorlight=#848284 bordercolordark=#eeeeee
           class="TABLE_STYLE1">
        <tr>
            <td class="TD_STYLE1" width="11%">
                I级机构
            </td>
            <td width="14%" class="TD_STYLE2">
                <select name="item.firstKindName" class="SELECT_STYLE1" id="zjlFirstKind">
                	<option value="">&nbsp;</option>
					<c:if test="${!empty firstList}">
						<c:forEach items="${firstList }" var="fl">
							<option value="${fl}">${fl }</option> 
						</c:forEach>
					</c:if>
                </select>
            </td>
            <td width="11%" class="TD_STYLE1">
                II级机构
            </td>
            <td width="14%" class="TD_STYLE2">
                <select name="item.secondKindName" class="SELECT_STYLE1" id="zjlSecondKind">
                	<option value="">&nbsp;</option>
                </select>
            </td>
            <td width="11%" class="TD_STYLE1">
                III级机构
            </td>
            <td class="TD_STYLE2" colspan="2">
                <select name="item.thirdKindName" class="SELECT_STYLE1" id="zjlThirdKind">
                	<option value="">&nbsp;</option>
                </select>
            </td>
            <td width="11%" class="TD_STYLE1">
                招聘类型
            </td>
            <td class="TD_STYLE2" colspan="2">
                <select name="selectType" class="SELECT_STYLE1" id="getType">
                	<option value="">&nbsp;</option>
                    <option value="社会招聘">社会招聘</option>
                    <option value="校园招聘">校园招聘</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="TD_STYLE1">
                职位分类
            </td>
            <td class="TD_STYLE2">
                <select name="item.humanMajorKindName" class="SELECT_STYLE1" id="zjlMajorKindName">
                	<option value="">&nbsp;</option>
					<c:if test="${!empty majorKindNameList}">
						<c:forEach items="${majorKindNameList }" var="mknl">
							<option value="${mknl}">${mknl }</option> 
						</c:forEach>
					</c:if>
                </select>
            </td>
            <td class="TD_STYLE1">
                职位名称
            </td>
            <td class="TD_STYLE2">
                <select name="item.hunmaMajorName" class="SELECT_STYLE1" id="zjlMajorName">
                	<option value="">&nbsp;</option>
                </select>
            </td>
            <td class="TD_STYLE1">
                招聘人数
            </td>
            <td colspan="2" class="TD_STYLE2">
                <input type="text" name="personNum" id="personNum" class="INPUT_STYLE2"/>
            </td>
            <td class="TD_STYLE1">
                截止日期
            </td>
            <td colspan="2" class="TD_STYLE2">
                <input type="text" name="overTime" id="overTime" class="INPUT_STYLE2"/>
            </td>
        </tr>
        <tr>
            <td class="TD_STYLE1">
                登记人
            </td>
            <td class="TD_STYLE2">
                <input type="text" class="INPUT_STYLE2" id="loger">
            </td>
            <td class="TD_STYLE1">
                登记时间
            </td>
            <td class="TD_STYLE2">
                <input type="text" name="loginTime" class="INPUT_STYLE2" readonly value="${now }" id="loginTime"/>
            </td>
            <td class="TD_STYLE1">

            </td>
            <td colspan="2" class="TD_STYLE2">

            </td>
            <td class="TD_STYLE1">

            </td>
            <td colspan="2" class="TD_STYLE2">

            </td>
        </tr>

        <tr>
            <td class="TD_STYLE1">
                职位描述
            </td>
            <td colspan="8" class="TD_STYLE2">
                <textarea name="item.humanHistroyRecords" rows="4" id="descri" class="TEXTAREA_STYLE1"></textarea>
            </td>
        </tr>
        <tr>
            <td class="TD_STYLE1">
                招聘信息
            </td>
            <td colspan="8" class="TD_STYLE2">
                <textarea name="item.humanFamilyMembership" rows="4" id="info" class="TEXTAREA_STYLE1"></textarea>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	
	$("#zjlFirstKind").change(function(){
		
		var val = $('#zjlFirstKind option:selected').val();
		
		/* 一级不为空 找二级 */
		if(val != ""){
			$("#zjlSecondKind").empty();
			$.ajax({
				type : "post",
				url : "zjlMajorRelease/querySecondKindName.do",
				data : {"firstKindName" : val},
				success : function(re){
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#zjlSecondKind").append(str);
				}
			})
		}
		
		/* 如果一级为空  全部清空 */
		if(val == ""){
			$("#zjlSecondKind").empty();
			$("#zjlThirdKind").empty();
			
			var str = `
				<option>&nbsp;</option>
			`;
			$("#zjlSecondKind").append(str);
			
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#zjlThirdKind").append(str1);
			
		}
		
	 });
	
	
	$("#zjlSecondKind").change(function(){
		
		var val = $('#zjlSecondKind option:selected').val();
		
		/* 二级不为空 找三级 */
		 if(val != ""){
			$("#zjlThirdKind").empty();
			$.ajax({
				type : "post",
				url : "zjlMajorRelease/queryThirdKindName.do",
				data : {"secondKindName" : val},
				success : function(re){
					
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#zjlThirdKind").append(str);
				}
			})
		} 
		
		/* 如果二级为空  三级清空 */
		if(val == ""){
			$("#zjlThirdKind").empty();
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#zjlThirdKind").append(str1);
		}
	 });
	 
	 
	/* 职位分类 */
	$("#zjlMajorKindName").change(function(){
		var val = $('#zjlMajorKindName option:selected').val();
		/* 职位类型不为空 找职位名称 */
		if(val != ""){
			$("#zjlMajorName").empty();
			$.ajax({
				type : "post",
				url : "zjlMajorRelease/queryMajorKindName.do",
				data : {"majorName" : val},
				success : function(re){
					
					var str = "<option></option>";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#zjlMajorName").append(str);
				}
			})
		} 
		
		/* 如果职位类型为空  职位名称清空 */
		if(val == ""){
			$("#zjlMajorName").empty();
			var str1 = `
				<option>&nbsp;</option>
			`;
			$("#zjlMajorName").append(str1);
		} 
	 });

	
	//提交
	$("#submit").click(function(){
		
		var firstKind = $('#zjlFirstKind option:selected').val();//一级
		var secondKind = $('#zjlSecondKind option:selected').val();//二级
		var thirdKind = $('#zjlThirdKind option:selected').val();//三级
		var getType = $('#getType option:selected').val();//招聘类型
		var majorKindName = $('#zjlMajorKindName option:selected').val();//职位分类
		var majorName = $("#zjlMajorName option:selected").val();//职位名称
		var personNum = $("#personNum").val();//人数
		var overTime = $("#overTime").val();//结束时间
		var loger = $("#loger").val();//等记人
		var loginTime = $("#loginTime").val();//登记时间
		var descri = $("#descri").val();//职位描述
		var info = $("#info").val();//职位信息
		
		if(firstKind=="" || secondKind=="" || thirdKind=="" || getType=="" || majorKindName=="" ||
			majorName=="" || personNum=="" || overTime=="" || loger=="" || descri=="" || info==""){
				alert("请填写完整职位发布信息！")
				return;
			}
		overTime += " 00:00:00";
		$.ajax({
			type : "post",
			url : "zjlMajorRelease/saveMajorRelease.do",
			data : {"firstKindName":firstKind,"secondKindName":secondKind,"thirdKindName":thirdKind,
			"engageType":getType,"majorKindName":majorKindName,"majorName":majorName,
			"humanAmount":personNum,"registTime":overTime,"register":loger,
			"deadline":loginTime,"majorDescribe":descri,"engageRequired":info},
			success : function(re){
				alert(re)
			}
		})
		
		
		
	});
		
	

</script>

