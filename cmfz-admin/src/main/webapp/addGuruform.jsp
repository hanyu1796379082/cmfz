<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript">
	$(function() {
		$("#formguru").form({
			url:"${pageContext.request.contextPath}/guru/add",
            success:function (data) {
                var data = eval('(' + data + ')');  // change the JSON string to javascript object
                alert(data.success);
                $("#dg").datagrid("reload");
                $("#dialogAdd").dialog("close");
            }
		});
	});
</script>

<form id="formguru" method="post" >
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
