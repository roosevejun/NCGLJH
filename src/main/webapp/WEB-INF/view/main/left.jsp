<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="<c:url value='/resources/css/left.css' />" rel="stylesheet" pointType="text/css"/>
    <script src="<c:url value='/resources/js/jquery.cookie.js' />"></script>
    <script src="<c:url value='/resources/js/leftmenu.js' />"></script>
</head>
<script pointType="text/javascript">
    $(document).ready(function () {
        leftMenuOnload();
    });
    function userGoOut() {
        parent.location = "loginout.do";
    }
</script>
<body>
<div class="wrap">
    <div class="leftBg">功能菜单</div>
    <div class="user">
        <div class="userName">您好，<span style="color: red;">${user.appuserName}</span><br/>登录系统 <span><a
                href="javascript:userGoOut();" class="redLink">[注销]</a></span></div>
    </div>
    <ul id="menu">
        <li class="item default" id="li_1"><a href="#" class="title" name="baxm" id="a1">项目备案</a>
            <ul id="opt_1" class="optiton">
                <li class="plus" id="t1" style="height:26px;line-height:38px;"><a href="#">公路类</a></li>
                <li class="text" style="display:none" id="tt1">
                    <ul style="display:block;" class="list">
                        <li class="linkUrl"><a href="#" linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=10&beian=0' />">县乡道改造工程</a>
                        </li>
                        <li class=" linkUrl"><a href="#"
                                                linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=09&beian=0' />">撤并建制村通硬化路</a>
                        </li>

                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=12&beian=0' />">窄路基路面拓宽工程</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=13&beian=0' />">村道安全生命防护工程</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=20&beian=0' />">乡（镇）客运站</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=41&beian=0' />">村道危桥改造</a>
                        </li>

                    </ul>
                </li>
            </ul>
        </li>
        <li class="item default" id="li_2"><a href="#" class="title" name="yba" id="a2">已备案</a>
            <ul id="opt_2" class="optiton">
                <li class="plus" id="t3" style="height:26px;line-height:38px;"><a href="#">公路类</a></li>
                <li class="text" style="display:none" id="tt3">
                    <ul style="display:block;" class="list">
                        <li class="linkUrl"><a href="#" linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=10&beian=1' />">县乡道改造工程</a>
                        </li>
                        <li class=" linkUrl"><a href="#"
                                                linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=09&beian=1' />">撤并建制村通硬化路</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=12&beian=1' />">窄路基路面拓宽工程</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=13&beian=1' />">村道安全生命防护工程</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=20&beian=1' />">乡（镇）客运站</a>
                        </li>
                        <li class="joinBottom linkUrl"><a href="#"
                                                          linkUrl="<c:url value='/xmxx/xmxxPage.do?xmlxdm=41&beian=1' />">村道危桥改造</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>
</body>