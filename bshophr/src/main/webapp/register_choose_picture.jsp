<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<script type="text/javascript" src="javascript/comm/comm.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<form method="post" action="humanfile.do" enctype="multipart/form-data" id="form">
		<input type="hidden" name="djtZhujian" value="${param.hufId}" id="djtZhujian">
		<table width="100%">
			<tr>
				<td colspan="2"><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记</font></td>
			</tr>
			<tr>
				<td width="59%">提交成功，如有照片，请选择上传照片(.jpg、.gif文件) 
				<input type="file" class="FILE_STYLE1" name="djtFile" width="100%" id="djtFile"></td>
				<td width="41%" align="right">
				
				<input type="button" value="上传照片"
					class="BUTTON_STYLE1" id="djtUpload">
					
					<input type="button" value="上传附件" class="BUTTON_STYLE1"
					onclick="window.location.href='register_choose_attachment.jsp?hufId=${param.hufId}';">
					<input type="button" value="完成" class="BUTTON_STYLE1" id="djtFinished"></td>
			</tr>
		</table>

	</form>
</body>
	<script type="text/javascript">
		$("#djtUpload").click(function(){
			console.log($("#djtZhujian").val());
			var humanPhoto = document.getElementById("djtFile").files[0];
			if(typeof (humanPhoto) == "undefined" || humanPhoto.size <= 0){
            alert("请选择图片");
            return;
       	 	}
        var formData = new FormData($("#form")[0]);
        $.ajax({
            url: "registerChoosePicture/addHumanFilePhoto.do",
            data: formData,
            type: "post",
            dataType: "json",
            processData: false,
            contentType: false,
            success:function(result){
            console.log(result);
           	 	if(result==true){
            		alert("上传成功");
           	 	}
            } 
        });
	})
	</script>
</html>

