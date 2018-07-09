<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"  isELIgnored="false" %>
<!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->

<body style="background-color: #e68900">
<form action="" method="post" style="margin-left: 75px" id = "formart">
    <br/><br/>
    文章标题：<input style="width:200px" class="easyui-textbox" name="name" id ="arttitle"><br/><br/>
    文章作者：<input style="width:150px" class="easyui-textbox" name="guruid" id = "artauthor"><br/><br/>
    文章状态： <input class="easyui-switchbutton" data-options="onText:'上架',offText:'暂不',value:'on'" id = "artstatus" name="status"><br/><br/>
    <input type="hidden" id="txt" name = "txt" >

</form>

<div id="editor" style="width: 90%;margin-left: 75px">
    <p>欢迎使用 <b>wangEditor</b> 富文本编辑器</p>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/wangEditor.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor
    var editor = new E('#editor')
    // 或者 var editor = new E( document.getElementById('editor') )
    editor.create()
    $("#btnart1").linkbutton({
        onClick:function () {
            $("#txt").val(editor.txt.html()),
                console.log($("#txt").val());
                $("#formart").form('submit',{
                    url:"${pageContext.request.contextPath}/art/add",
                    onSubmit:function () {
                        return true;
                    },
                    success:function (message) {

                    }
                })
        }
    });
    $("#btnart2").linkbutton({
        onClick:function () {
            editor.txt.clear()
            $("#arttitle").textbox("clear");
            $("#artauthor").textbox("clear");
            $("#artstatus").switchbutton("reset");
        }
    });
</script>
 <br/><br/>
<a id = "btnart1" style="margin-left: 75px">创建文章</a>
<a id = "btnart2" style="margin-left: 30px">清除文章重置内容</a>
</body>
