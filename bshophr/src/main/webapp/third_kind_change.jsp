<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'third_kind_change.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<link rel="stylesheet" href="table.css" type="text/css" />
	<script type="text/javascript" src="javascript/comm/comm.js"></script>
	<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
</head>
<body>
<form name="configfilethirdkindForm" method="post" action="pyl/configfilethirdkind.do">
<table width="100%" >
  <tr>
    <td> 
    <font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--III级机构设置 </font></td>
  </tr>
  <tr>
    <td align="right"><input type="button" value="提交" class="BUTTON_STYLE1" onclick="updateThirdKind('${obj.ftkId}')">
      <input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();"></td>
  </tr>
  </table>
  
<table width="100%"  border="1" cellpadding=0 cellspacing=1 bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
  <tr>
    <td width="19%" class="TD_STYLE1">I级机构编号</td>
    <td width="81%" class="TD_STYLE2"><input type="text" name="firstKindId" value="${obj.firstKindId}" readonly="readonly" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">I级机构名称</td>
    <td class="TD_STYLE2"><input type="text" name="item.firstKindName" value="${obj.firstKindName}" readonly="readonly" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td width="19%" class="TD_STYLE1">II级机构编号</td>
    <td width="81%" class="TD_STYLE2"><input type="text" name="item.firstKindId" value="${obj.secondKindId}" readonly="readonly" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">II级机构名称</td>
    <td class="TD_STYLE2"><input type="text" name="item.firstKindName" value="${obj.secondKindName}" readonly="readonly" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td width="19%" class="TD_STYLE1">III级机构编号</td>
    <td width="81%" class="TD_STYLE2"><input type="text" name="thirdKindId" value="${obj.thirdKindId}" readonly="readonly" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">III级机构名称</td>
    <td class="TD_STYLE2"><input type="text" name="thirdKindName" value="${obj.thirdKindName}" readonly="readonly" class="INPUT_STYLE1"></td>
  </tr>
  <tr>
    <td class="TD_STYLE1">零售</td>
    <td class="TD_STYLE2">
	<select id="thirdKindIsRetail" name="item.thirdKindIsRetail" type="text" class="INPUT_STYLE1">
		<c:if test="${obj.thirdKindIsRetail eq '是'}">
			<option value="是" selected="">是</option>
			<option value="否">否</option>		
		</c:if>
		<c:if test="${obj.thirdKindIsRetail eq '否'}">
			<option value="是">是</option>
			<option value="否" selected="">否</option>
		</c:if>
	</select>
	</td>
  </tr>
  <tr>
    <td class="TD_STYLE1">销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
    <td class="TD_STYLE2"><textarea id="thirdKindSaleId" name="item.thirdKindSaleId" rows="4" class="TEXTAREA_STYLE1">${obj.thirdKindSaleId } </textarea></td>
  </tr>
</table>
</form>
</body>
</html>
<script type="text/javascript">
	function updateThirdKind(id){
		var ts=$("#thirdKindSaleId");
		var tr=$("#thirdKindIsRetail");
		var jsid=id;
		window.location.href='pyl/configfilethirdkind.do?operate=update&thirdKindIsRetail='+$(tr).val()+'&thirdKindSaleId='+$(ts).val()+'&id='+jsid;
	}
</script>