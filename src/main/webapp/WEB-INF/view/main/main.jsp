<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no"/>
    <title>农村公路建设项目备案系统</title>
    <style type="text/css">
        @import url("<c:url value='/resources/css/operamasks/apusic/om-apusic.css' />");
        @import url("<c:url value='/resources/css/base.css' />");
        @import url("<c:url value='/resources/css/layout.css' />");
     </style>

        <script src="<c:url value='/resources/js/jquery.min.js' />"></script>
    <script src="<c:url value='/resources/js/operamasks-ui.min.js' />"></script>
    <script type="text/javascript">
    var interval;
        $(document).ready(function () {
            $('#borderLayout').omBorderLayout({
                panels: [
                    {
                        id: "top-panel",
                        header: false,
                        region: "north",
                        height: 75,
                        url: '<c:url value="/top.do"/>',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        }
                    },
                    {
                        id: "left-panel",
                        title: "功能菜单",
                        header: false,
                        expandToBottom: false,
                        resizable: true,
                        collapsible: true,
                        region: "west",
                        url: 'left.do',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        },
                        width: 190
                    },
                    {
                        id: "center-panel",
                        header: false,
                        region: "center",
                        resizable: true,
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        }
                    },
                    {
                        id: "copyright-panel",
                        header: false,
                        region: "south",
                        url: 'copyright.do',
                        loadingMessage: "正在加载头数据.....",
                        onError: function (xmlHttpRequest, textStatus, errorThrown) {
                            $(this).html("加载数据失败，请稍后重试。");
                        },
                        height: 26
                    }
                ],
                hideCollapsBtn: true,
                spacing: 2
            });
        });
    </script>
</head>
<body>
<div id="borderLayout">
    <div id="top-panel">
        <div id="top" style="height: 100%;width: 100%;padding: 0;margin: 0;">页面头部</div>
    </div>
    <div id="center-panel" style="padding-top:1px;padding-left:1px;padding-right:5px;"></div>
    <div id="left-panel"></div>
</div>
</body>
</html>