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
    
   <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
    	
    	function update(obj){
    		
    		var myselect = document.getElementById("selectType");
    		var index=myselect.selectedIndex;
    		var Typeval = myselect.options[index].value;//招聘类型
    		
    		var cnt = document.getElementById("cnt").value;//人数
    		
    		var overTime = document.getElementById("overTime").value;//结束时间
    		
    		var describe = document.getElementById("describe").value;//描述
    		
    		var require = document.getElementById("require").value;//要求
    		
    		var changer = document.getElementById("changer").value;//更改人
    		
    		var changeTime = document.getElementById("changeTime").value;//改变时间
    		
    		
    		
    		$.ajax({
    			
    			type:"post",
    			url : "zjlMajorRelease/"+obj+"/update.do",
    			data : {"engageType" : Typeval, "humanAmount" : cnt, "registTime" : overTime, "majorDescribe" : describe, "engageRequired" : require, "changer" : changer, "changeTime" : changeTime},
    			dataType:"json",
    			success : function(re){
    				
    				location.href="major_release_update_success.jsp";
    				
    			}		
    		})
    		
    	}
    	
    	function toMajorChange(){
    		location.href = "zjlMajorRelease/queryAll.do";
    	}
    	
    </script>
    
</head>
<body>

<form name="humanfileForm">
    <table width="100%">
        <tr>
            <td>
                <font color="#0000CC">您正在做的业务是：招聘管理--职位发布管理--职位发布更新</font>
            </td>
        </tr>
        <tr>
            <td align="right">
                <input type="button" onclick="update(${obj.mreId})" value="重新提交" id="updateBtn" class="BUTTON_STYLE1" data_id="${obj.mreId }">
                <input type="reset" onclick="toMajorChange()" value="返回" class="BUTTON_STYLE1">
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
                ${obj. firstKindName}
            </td>
            <td width="11%" class="TD_STYLE1">
                II级机构
            </td>
            <td width="14%" class="TD_STYLE2">
                ${obj.secondKindName }
            </td>
            <td width="11%" class="TD_STYLE1">
                III级机构
            </td>
            <td class="TD_STYLE2" colspan="2">
               ${obj.thirdKindName }
            </td>
            <td width="11%" class="TD_STYLE1">
                招聘类型
            </td>
            <td class="TD_STYLE2" colspan="2">
                <select id="selectType" name="selectType" class="SELECT_STYLE1">
                	<c:if test="${obj.engageType eq '社会招聘' }">
                		<option value="社会招聘" selected="selected">社会招聘</option>
                		<option value="校园招聘">校园招聘</option>
                	</c:if>
                	<c:if test="${obj.engageType eq '校园招聘' }">
                		<option value="社会招聘" >社会招聘</option>
                		<option value="校园招聘" selected="selected">校园招聘</option>
                	</c:if>
                </select>
            </td>
        </tr>
        <tr>
            <td class="TD_STYLE1">
                职位分类
            </td>
            <td class="TD_STYLE2">
                	${obj.majorKindName }
            </td>
            <td class="TD_STYLE1">
                职位名称
            </td>
            <td class="TD_STYLE2">
                ${obj.majorName}
            </td>
            <td class="TD_STYLE1">
                招聘人数
            </td>
            <td colspan="2" class="TD_STYLE2">
                <input type="text" name="personNum" id="cnt" value="${obj.humanAmount }"/>
            </td>
            <td class="TD_STYLE1">
                截止日期
            </td>
            <td colspan="2" class="TD_STYLE2">
                <input type="text" name="overTime" id="overTime" value="${obj.deadline }"/>
            </td>
        </tr>
        <tr>
            <td class="TD_STYLE1">
                变更人
            </td>
            <td class="TD_STYLE2">
                <input type="text" name="item.humanName" id="changer" value="${obj.changer }" class="INPUT_STYLE2">
            </td>
            <td class="TD_STYLE1">
                变更时间
            </td>
            <td class="TD_STYLE2">
                <input type="text" name="loginTime" id="changeTime" readonly value="${obj.changeTime }"/>
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
                <textarea name="item.humanHistroyRecords" id="describe" rows="4" class="TEXTAREA_STYLE1">${obj.majorDescribe }</textarea>
            </td>
        </tr>
        <tr>
            <td class="TD_STYLE1">
                招聘信息
            </td>
            <td colspan="8" class="TD_STYLE2">
                <textarea name="item.humanFamilyMembership" id="require" rows="4" class="TEXTAREA_STYLE1">${obj.engageRequired }</textarea>
            </td>
        </tr>
    </table>
</form>
</body>
</html>