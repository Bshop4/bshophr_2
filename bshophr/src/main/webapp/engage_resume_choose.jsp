<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
 <form  method="post">
    <table width="100%">
        <tr>
            <td>
                <font color="black">您正在做的业务是：人力资源--招聘管理--简历管理--简历筛选 </font>
            </td>
        </tr>
        <tr>
            <td align="right">
                <input type="submit" value="开始" class="BUTTON_STYLE1">
            </td>
        </tr>
    </table>
    <table width="100%" border="1" cellpadding=0 cellspacing=1 bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
        <tr>
            <td class="TD_STYLE1" width="30%">
                请选择职位分类
            </td>
            <td class="TD_STYLE2" width="30%">
                <select  multiple="multiple" id="humanMajorKind"
                        style="width: 290;height: 100" class="SELECT_STYLE2">
                    <option value="0">--请选择--</option>
                    <option value="0">--请选择--</option>
                    <option value="0">--请选择--</option>
                </select>
                <select name="humanmajorname" multiple="multiple" id="humanMajorId"
                        style="width: 290;height: 100" size="5" class="SELECT_STYLE2">
                    <option>--请选择--</option>
                    <option value="0">--请选择--</option>
                    <option value="0">--请选择--</option>

                </select>

            </td>
        </tr>

        <tr>
            <td class="TD_STYLE1" width="30%">
                请输入关键字
            </td>
            <td width="84%">
                <input type="text" name="primarkey" class="INPUT_STYLE2" />
            </td>
        </tr>

        <tr>
            <td class="TD_STYLE1" width="30%">
                请输入登记时间
            </td>
            <td width="84%" class="TD_STYLE2">
                <input type="text" name="startdate" 
                       style="width: 14%" class="INPUT_STYLE2">
                至
                <input type="text" name="enddate"
                       style="width: 14%" class="INPUT_STYLE2" >
                （YYYY-MM-DD）
            </td>
        </tr>
    </table>
</form>
</html>
