<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<script type="text/javascript" src="js/datagrid-detailview.js"></script>
<script type="text/javascript">
    $(function () {
        $("#ttguru").datagrid({
            width:400,
            height:250,
            fit:true,
            singleSelect:true,
            columns:[[
                {field:"id",title:"上师号",width:80},
                {field:"name",title:"上师名",width:100,sortable:true},
                {field:"photo",title:"上师图片",width:80,align:'right',sortable:true},
                {field:"summary",title:"上师简介",width:80,align:'right',sortable:true}
            ]],
            url:"${pageContext.request.contextPath}/guru/all",
            pagination:true,
            pageSize:4,
            pageList:[4,5,6],
            fitColumns:true,
            view: detailview,
            detailFormatter: function(rowIndex, rows){
                return '<table><tr>' +
                    '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}/upload/guru/'+rows.photo+'" style="height:300px;width: 400px" /></td>' +
                    '<td style="border:0">' +
                    '</td>' +
                    '</tr></table>';
            },
            toolbar:"#tbguru"
        });
        $("#addguru").linkbutton({
            iconCls:'icon-add',
            text:'新增',
            plain:true,
            onClick:function () {
                $("#dialogAdd").dialog({
                    width:360,
                    height:300,
                    title:"新增用户",
                    toolbar:[{
                        iconCls:"icon-help",
                        text:"帮助",
                        handler:function(){
                            alert("新增");
                        }
                    }],
                    href:"${pageContext.request.contextPath}/addGuruform.jsp",
                    model:false,
                });
            }
        });
        $("#changeguru").linkbutton({
            iconCls:'icon-cancel',
            text:'修改',
            plain:true,
            onClick:function () {
                var item = $("#ttguru").datagrid("getSelected");
                if(item==null){

                }else{
                $("#dialogChange").dialog({
                    width:360,
                    height:300,
                    title:"修改用户",
                    toolbar:[{
                        iconCls:"icon-help",
                        text:"帮助",
                        handler:function(){
                            alert("这是修改");
                        }
                    }],
                    href:"${pageContext.request.contextPath}/updateGuru.jsp",
                    model:false,
                    onLoad:function(){
                        $("#formguru").form("load",item);
                    }
                });
                }
            }
        });
        $("#insertguru").linkbutton({
            text:"点我批量插入",
            iconCls:'icon-reload',
            onClick:function () {
                $("#dialogInsert").dialog({
                    width:360,
                    height:300,
                    title:"批量插入",
                    toolbar:[{
                        iconCls:"icon-help",
                        text:"帮助",
                        handler:function(){
                            alert("插入");
                        }
                    }],
                    href:"${pageContext.request.contextPath}/addAnyGuruform.jsp",
                    model:false,
                });
            }

        })

    })
    function search(value,name) {
       $.ajax({
           type:"post",
           url:"${pageContext.request.contextPath}/guru/anyAll",
           data:{"name":value,"page":1,"rows":5},
           success:function (message) {
               console.log(message);
               $("#ttguru").datagrid({
                   width:400,
                   height:250,
                   fit:true,
                   singleSelect:true,
                   columns:[[
                       {field:"id",title:"上师号",width:80},
                       {field:"name",title:"上师名",width:100,sortable:true},
                       {field:"photo",title:"上师图片",width:80,align:'right',sortable:true},
                       {field:"summary",title:"上师简介",width:80,align:'right',sortable:true}
                   ]],
                   url:"${pageContext.request.contextPath}/guru/anyAll?name="+value,
                   pagination:true,
                   pageSize:4,
                   pageList:[4,5,6],
                   fitColumns:true,
                   view: detailview,
                   detailFormatter: function(rowIndex, rows){
                       return '<table><tr>' +
                           '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}/upload/guru/'+rows.photo+'" style="height:300px;width: 400px" /></td>' +
                           '<td style="border:0">' +
                           '</td>' +
                           '</tr></table>';
                   },
                   toolbar:"#tbguru"
               })
           }

       })
    }

</script>


<table id="ttguru"></table>

<div id="dialogAdd"></div>

<div id = "dialogChange"></div>

<div id = "dialogInsert"></div>


<div id="tbguru" style="display: none">
    <a  id="addguru" ></a>
    <a  id="changeguru" ></a>
    <a id = "insertguru"></a>
    <input id="ss" style="float: right" class="easyui-searchbox" style="width:300px"
           data-options="searcher:search,prompt:'请您输入',menu:'#mm' "></input>
    <div id="mm" style="width:120px">
        <div data-options="name:'name',iconCls:'icon-ok'">姓名</div>
    </div>
</div>

