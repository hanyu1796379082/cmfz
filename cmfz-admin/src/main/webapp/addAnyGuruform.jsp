<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript">
	$("#guru_btn").linkbutton({
		onClick:function () {
			$("#formguru").form("submit",{
				url:"${pageContext.request.contextPath}/guru/addBatch",
				onSubmit:function () {
					return true;
                },
				success:function () {
                }
			});
        }
	})
</script>

<form id="formguru" method="post" enctype="multipart/form-data">

	<div>

		<input class="easyui-filebox" type="text" name="myFile"/>
	</div>

	<div>
		<a class="easyui-linkbutton" id = "guru_btn">提交按钮</a>
	</div>
</form>

</html>
