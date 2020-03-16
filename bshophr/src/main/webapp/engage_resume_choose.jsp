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
    
    <title>My JSP 'engage_resume_choose.jsp' starting page</title>
    
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
 <form id="frm">
    <table width="100%">
        <tr>
            <td>
                <font color="black">您正在做的业务是：招聘管理--简历管理--简历筛选 </font>
            </td>
        </tr>
        <tr>
            <td align="right">
                <input type="button" value="开始" class="BUTTON_STYLE1" id="mysubmit">
            </td>
        </tr>
    </table>
    <table width="100%" border="1" cellpadding=0 cellspacing=1 bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
        <tr>
            <td class="TD_STYLE1" width="30%">
                请选择职位分类
            </td>
            <td class="TD_STYLE2" width="30%">
                <select  multiple="multiple" id="humanMajorKindName"
                        style="width: 290;height: 100" class="SELECT_STYLE2">
                    <c:if test="${!empty list }">
                    	<c:forEach items="${list }" var="i">
                    		<option value="${i }">${i }</option>
                    	</c:forEach>
                    </c:if>
                </select>
                <select name="humanmajorname" multiple="multiple" id="humanMajorName"
                        style="width: 290;height: 100" size="5" class="SELECT_STYLE2">
                </select>

            </td>
        </tr>

        <tr>
            <td class="TD_STYLE1" width="30%">
                请输入关键字
            </td>
            <td width="84%">
                <input type="text" name="primarkey" class="INPUT_STYLE2"  id="keyWord"/>
            </td>
        </tr>

        <tr>
            <td class="TD_STYLE1" width="30%">
                请输入登记时间
            </td>
            <td width="84%" class="TD_STYLE2">
                <input type="text" name="startdate" 
                       style="width: 14%" class="INPUT_STYLE2" id="startdate">
                至
                <input type="text" name="enddate"
                       style="width: 14%" class="INPUT_STYLE2" id="enddate">
                （YYYY-MM-DD）
            </td>
        </tr>
    </table>
    <input type="hidden" name="hiddenMajorKindName" id="hiddenMajorKindName" data-value=""/> 
    
</form>
</html>
<script src="js/jquery-1.8.3.min.js"></script>
<script>

	$("#humanMajorKindName").change(function(){
		
		var val = $('#humanMajorKindName option:selected').val();
		/* 职位种类不为空 找职位名称 */
		if(val != ""){
			$("#hiddenMajorKindName").attr("data-value",val);
			$("#humanMajorName").empty();
			$.ajax({
				type : "post",
				url : "zjlEngageResume/queryHumanMajorName.do",
				data : {"humanMajorKindName" : val},
				success : function(re){
					var str = "";
					for(var i = 0; i < re.length; i++){
						str += "<option value='"+re[i]+"'>"+re[i]+"</option>";
					}
					$("#humanMajorName").append(str);
				}
			})
		} 
		
	 });
	 
	 
	 
	 $("#mysubmit").click(function(){
	 	
	 	var hiddenMajorKindName = $("#hiddenMajorKindName").attr("data-value");
	 	var humanMajorName = $("#humanMajorName option:selected").val();
	 	var keyWord = $("#keyWord").val();
	 	var startdate = $("#startdate").val();
	 	var enddate = $("#enddate").val();
	 	
	 	
	 	
	 	if(hiddenMajorKindName == "" || humanMajorName == "" || keyWord == "" ||
	 	startdate == "" || enddate==""){
	 		alert("请填写必要信息！");
	 		return;
	 	}
	 	
	 	var dateReg = /^20[0-2][0-9]-[01][012]-[0-9][0-9]$/;
	 	if(!dateReg.test(startdate)){
	 		alert("请填写格式正确的日期！");
	 		return;
	 	}
	 	
	 	if(!dateReg.test(enddate)){
	 		alert("请填写格式正确的日期！");
	 		return;
	 	}
	 	
	 	startdate += " 00:00:00";
	 	enddate += " 00:00:00";
			
	 	//$("#frm").action = "zjlEngageResume/"+hiddenMajorKindName+"/"+humanMajorName+"/"+keyWord+"/"+startdate+"/"+enddate+"/queryChoose.do";
	 	//$("#frm").action="zjlEngageResume/test.do";
	 	//$("#frm").method="post";
	 	//$("#frm").submit();
	 	
	 	var frm = document.getElementById("frm");
	 	frm.action="zjlEngageResume/"+hiddenMajorKindName+"/"+humanMajorName+"/"+keyWord+"/"+startdate+"/"+enddate+"/queryChoose.do";
	 	frm.submit();
	 	
	 	
	 });

	 
	 
</script>