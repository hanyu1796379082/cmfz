<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript">
	$(function() {
		$("#form1").form({
			url:"${pageContext.request.contextPath}/pic/add",
            success:function (data) {
                var data = eval('(' + data + ')');  // change the JSON string to javascript object
                if (data.success){
                    alert("新增成功");
                }else {
                    alert("新增失败");
                }
                $("#dg").datagrid("reload");
                $("#dialog").dialog("close");
            }
		});
	});
</script>

<form id="form1" method="post" enctype="multipart/form-data">
	<div>
		<label >上传图片:</label>
		<input class="easyui-validatebox" type="file" name="myFile"  />
	</div>
	<div>
		<label >简介:</label>
		<input class="easyui-validatebox" type="text" name="descrip"  data-options="required:true" />
	</div>
	<div>
		<label >是否加入播放队列:</label>
		加入 <input type="radio" name="status" value="1">  暂不加入 <input type="radio" name="status" value="0" checked="checked">
	</div>
	<div>
		<input type="submit" value="提交">
	</div>
</form>

</html>
