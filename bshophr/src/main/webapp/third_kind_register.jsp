<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'third_kind_register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="table.css" type="text/css" />
	<script type="text/javascript" src="javascript/comm/comm.js"></script>
</head>
<body>
<form name="configfilethirdkindForm" method="post" action="pyl/configfilethirdkind/save.do">
<table width="100%" >
  <tr>
    <td> 
    <font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--III级机构设置 </font></td>
  </tr>
  <tr>
    <td align="right"><input type="button" value="提交" class="BUTTON_STYLE1" onclick="submit()">
      <input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
    </td>
  </tr>
  </table>
  
<table width="100%"  border="1" cellpadding=0 cellspacing=1 bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
  <tr>
    <td width="19%" class="TD_STYLE1">I级机构编号</td>
    <td width="81%" class="TD_STYLE2"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">I级机构名称</td>
    <td class="TD_STYLE2">
    	<select id="firstKindName" name="firstKindNameAndId" class="INPUT_STYLE1" onchange="getII()">
    		<option value="">请选择I级机构名称</option>
			<c:forEach items="${falist}" var="fa">
				<option value="${fa.firstKindName},${fa.firstKindId}">${fa.firstKindName }</option>
			</c:forEach>
		</select>
    </td>
  </tr>
  <tr>
    <td width="19%" class="TD_STYLE1">II级机构编号</td>
    <td width="81%" class="TD_STYLE2"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">II级机构名称</td>
    <c:forEach items="${fklist}" var="fk">
    	<input type="hidden" name="iiname" value="${fk.secondKindName},${fk.secondKindId},${fk.firstKindId}" />
	</c:forEach>
    <td class="TD_STYLE2">
    	<select id="secondKindName" name="secondKindNameAndId" value="" class="INPUT_STYLE1">
    		<option value="">请选择II级机构名称</option>	
		</select>
    </td>
  </tr>
  <tr>
    <td width="19%" class="TD_STYLE1">III级机构编号</td>
    <td width="81%" class="TD_STYLE2"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">III级机构名称</td>
    <td class="TD_STYLE2"><input type="text" name="thirdKindName" value="" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">零售</td>
    <td class="TD_STYLE2">
		<select name="thirdKindIsRetail" type="text" class="INPUT_STYLE1">
			<option value="是">是</option>
			<option value="否">否</option>
		</select>
	</td>
  </tr>
  <tr>
    <td class="TD_STYLE1">销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
    <td class="TD_STYLE2"><textarea name="thirdKindSaleId" rows="4" class="TEXTAREA_STYLE1"></textarea></td>
  </tr>
</table>
</form>
</body>
</html>
<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
	//获得下拉框II数据的个数
	var iilengthstr="${fn:length(fklist)}";
	var iilength=parseInt(iilengthstr);
	//搞一个数组
	var iiarr=new Array();
	//循环给数组赋值
	for(var i=0;i < iilength;i++){
		iiarr[i]=$("input[name='iiname']").eq(i)[0].value;
	}
 	
     function getII(){
         //获得I下拉框的对象
         var sltI=document.getElementById("firstKindName");
         //获得II下拉框的对象
         var sltII=document.getElementById("secondKindName");
         
         //获得I的对象的索引
         var Iindex =sltI.selectedIndex;
         
         
         //得到I的id
         var indexId=sltI.options[Iindex].value.split(",")[1];
 		
         //清空城市下拉框，仅留提示选项
    	 sltII.length=1;
    	 
    	 
         //获取索引的值
		var  num=0;
         //将城市数组中的值填充到城市下拉框中
         for(var i=0;i<iilength;i++){
			 //Option(选项描述，选项值) 等价于 <option value="选项值" >选项描述</option>;
			 if(indexId==parseInt(iiarr[i].split(",")[2])){
			 	num++;
            	sltII[num]=new Option(iiarr[i].split(",")[0],iiarr[i].split(",")[0]+","+iiarr[i].split(",")[1]);
			 }
         }
     }

	
</script>