<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript" src="js/datagrid-detailview.js"></script>
<script type="text/javascript">
    $(function () {
        <%--$("#tt2").datagrid({--%>
            <%--width:400,--%>
            <%--height:250,--%>
            <%--fit:true,--%>
            <%--singleSelect:true,--%>
            <%--columns:[[--%>
                <%--{field:"id",title:"编号",width:80},--%>
                <%--{field:"path",title:"图片名",width:100,sortable:true},--%>
                <%--{field:"date",title:"日期",width:80,align:'right',sortable:true},--%>
                <%--{field:"descrip",title:"简介",width:80,align:'right',sortable:true},--%>
                <%--{field:'status',title:"播放状态",width:150,sortable:true},--%>
                <%--{field:'opt', title: '操作', width: 80,--%>
                    <%--formatter: function () {--%>
                        <%--return "<a class='easyui-linkbutton'id='change' onclick='changePic()'> 修改</a>";--%>
                    <%--}--%>
                <%--}--%>
            <%--]],--%>
            <%--url:"${pageContext.request.contextPath}/pic/all",--%>
            <%--pagination:true,--%>
            <%--pageSize:5,--%>
            <%--pageList:[4,5,6],--%>
            <%--fitColumns:true,--%>
            <%--view: detailview,--%>
            <%--detailFormatter: function(rowIndex, rows){--%>
                <%--return '<table><tr>' +--%>
                    <%--'<td rowspan=2 style="border:0"><img src="img/picture/'+rows.path+'" style="height:300px;width: 400px" /></td>' +--%>
                    <%--'<td style="border:0">' +--%>
                    <%--'</td>' +--%>
                    <%--'</tr></table>';--%>
            <%--},--%>
            <%--toolbar:"#tb"--%>
        <%--});--%>
        <%--$("#add").linkbutton({--%>
            <%--iconCls:'icon-add',--%>
            <%--text:'新增',--%>
            <%--plain:true,--%>
            <%--onClick:function () {--%>
                <%--$("#dialogAdd").dialog({--%>
                    <%--width:360,--%>
                    <%--height:300,--%>
                    <%--title:"新增用户",--%>
                    <%--toolbar:[{--%>
                        <%--iconCls:"icon-help",--%>
                        <%--text:"帮助",--%>
                        <%--handler:function(){--%>
                            <%--alert("新增");--%>
                        <%--}--%>
                    <%--}],--%>
                    <%--href:"${pageContext.request.contextPath}/addPicform.jsp",--%>
                    <%--model:false,--%>
                <%--});--%>
            <%--}--%>
        <%--});--%>
        <%--$("#remove").linkbutton({--%>
            <%--iconCls:'icon-cancel',--%>
            <%--text:'删除',--%>
            <%--plain:true,--%>
            <%--onClick:function () {--%>
                <%--var item = $("#tt2").datagrid("getSelected");--%>
                <%--var a = item.id;--%>
                <%--console.log(a);--%>
                <%--$.ajax({--%>
                    <%--type:"post",--%>
                    <%--&lt;%&ndash;url:"${pageContext.request.context}/pic/remove",&ndash;%&gt;--%>
                    <%--&lt;%&ndash;data:"id"+a,&ndash;%&gt;--%>
                    <%--success:function (message) {--%>
                        <%--console.log(message);--%>
                    <%--}--%>
                <%--});--%>
                <%--$("#tt2").datagrid("reload");--%>
            <%--}--%>
        <%--});--%>
        <%--$("#change").linkbutton({--%>
            <%--iconCls:'icon-edit',--%>
            <%--text:'修改',--%>
            <%--plain:true,--%>
        <%--});--%>
    <%--})--%>
    <%--function changePic() {--%>
        <%--var item = $("#tt2").datagrid("getSelected");--%>
        <%--if(item==null){--%>
        <%--}else{--%>

        <%--}--%>
    })

</script>






<table id="tt2"></table>

<div id="dialogAdd"></div>


<div id="tb" style="display: none">
    <a  id="add" ></a>
    <a  id="remove" ></a>
</div>

