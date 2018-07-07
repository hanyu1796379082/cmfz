<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript">
	$(function() {
		$("#formguru").form({
			url:"${pageContext.request.contextPath}/guru/change",

            success:function (data) {
                var data = eval('(' + data + ')');  // change the JSON string to javascript object
                alert("修改成功");
                $("#ttguru").datagrid("reload");
                $("#dialogChange").dialog("close");
            }
		});
	});
</script>
<form id="formguru" method="post">
	<div>
		<label >&nbsp;&nbsp;&nbsp; 上师号:</label>
		<input class="easyui-validatebox" type="text" name="id"  data-options="required:true" readonly="readonly" />
	</div><br/>
	<div>
		<label >&nbsp;&nbsp;&nbsp; 上师名:</label>
		<input class="easyui-validatebox" type="text" name="name"  data-options="required:true" />
	</div><br/>
	<div>
		<label >上师图片:</label>
		<input class="easyui-validatebox" type="text" name="photo"  data-options="required:true" />
	</div><br/>
	<div>
		<label >上师简介:</label>
		<input class="easyui-validatebox" type="text" name="summary"  data-options="required:true" />
	</div><br/>
	<div>
		<input type="submit" value="提交">
	</div>
</form>

</html>
