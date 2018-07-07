<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript">
    $(function() {
        $("#formpic").form({
            url:"${pageContext.request.contextPath}/pic/change",

            success:function (data) {
                var data = eval('(' + data + ')');  // change the JSON string to javascript object
                alert("修改成功");
                $("#ttguru").datagrid("reload");
                $("#dialogChange").dialog("close");
            }
        });
    });
</script>
<form id="formpic" method="post">
    <div>
        <label >&nbsp;&nbsp;&nbsp; 图片编号:</label>
        <input class="easyui-validatebox" type="text" name="id"  data-options="required:true" readonly="readonly" />
    </div><br/>
    <div>
        <label >&nbsp;&nbsp;&nbsp; 图片名:</label>
        <input class="easyui-validatebox" type="text" name="path"  data-options="required:true" />
    </div><br/>
    <div>
        <label >日期:</label>
        <input class="easyui-validatebox" type="Date" name="date"   readonly="readonly"/>
    </div><br/>
    <div>
        <label >简介:</label>
        <input class="easyui-validatebox" type="text" name="descrip"  data-options="required:true" />
    </div><br/>
    <div>
        <label >状态:</label>
        <input class="easyui-validatebox" type="text" name="status"  data-options="required:true" />
    </div><br/>
    <div>
        <input type="submit" value="提交">
    </div>
</form>

</html>
