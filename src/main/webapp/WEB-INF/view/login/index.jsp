<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>安徽省“十三五”农村公路计划项目部级备案系统</title>
    <meta name="keywords" content="十三五,农村公路,项目备案"/>
    <style type="text/css">
        @import url("<c:url value='/resources/css/bootstrap.min.css' />");
        @import url("<c:url value='/resources/css/bootstrap-dialog.min.css' />");
        @import url("<c:url value='/resources/css/login/style.css' />");
    </style>
    <script type="text/javascript" src="http://cdn.webfont.youziku.com/wwwroot/js/wf/youziku.api.min.js"></script>
    <script src="<c:url value='/resources/js/jquery-3.1.1.min.js' />"></script>
    <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
    <script src="<c:url value='/resources/js/jquery.validate-1.14.0.min.js' />"></script>
    <script src="<c:url value='/resources/js/localization/messages_zh.js' />"></script>
    <script src="<c:url value='/resources/js/jquery-validate.bootstrap-tooltip.min.js' />"></script>
    <script src="<c:url value='/resources/js/bootstrap-dialog.min.js' />"></script>
    <script src="<c:url value='/resources/js/jquery.easing.min.js' />"></script>
    <script src="<c:url value='/resources/js/jquery.mousewheel.min.js' />"></script>
    <script src="<c:url value='/resources/js/jquery.cookie.js'/>"></script>
    <script src="<c:url value='/resources/js/jquery.kinetic.min.js' />"></script>
    <script src="<c:url value='/resources/js/login.js' />"></script>
    <script type="text/javascript">
        jQuery(document).ready(function () {
            $.login.initCookie();
            $("#userForm").validate({
                rules: {
                    codekaptcha: {required: true, maxlength: 4, remote: {url: "<c:url value='/validCaptcha'/>"}},
                    loginName: {required: true},
                    loginPass: {required: true}
                },
                messages: {
                    codekaptcha: {
                        remote: '验证码错误',
                        maxlength: '验证码长度错误',
                        required: '请输入验证码'
                    },
                    loginName: {required: '请输入用户名'},
                    loginPass: {required: '请输入密码'}
                },
                submitHandler: function () {
                    console.log("submitHandler");
                    $.login.loginSubmit();
                }
            });
            jQuery("body").keydown(function (event) {
                switch (event.keyCode) {
                    case 13:
                        $('#userForm').submit();
                }
            });
            jQuery(":input").keypress(function (event) {
                switch (event.keyCode) {
                    case 13:
                        event.stopPropagation();
                }
            });
            $('#codekaptcha').on('blur', function () {
                $(this).valid();
            });
            $('#cookieCheckbox').on('change', function () {
                $.login.checkCookie();
            });
        });
    </script>
</head>
<body>

<div class="top">
    <div class="logo">
        <span class="logo_txt">安徽省“十三五”农村公路建设项目部级备案系统</span>
    </div>
</div>
<div class="middle">
    <ul class="picture">
        <li class="layer">
            <img src="<c:url value='/resources/images/login-1.jpg'/>" alt=""/>
        </li>
        <li class="layer">
            <img src="<c:url value='/resources/images/login-2.jpg'/>" alt=""/>
        </li>
        <li class="layer">
            <img src="<c:url value='/resources/images/login-3.jpg'/>" alt=""/>
        </li>
    </ul>
    <ul class="dot">
        <li class="active"></li>
        <li></li>
        <li></li>
    </ul>
</div>
<div class="login">
    <form id="userForm" name="login-form" class="login-form" action="" method="post">
        <div class="header">
            <h1>欢迎使用</h1>
            <span>请输入用户名密码登录</span>
        </div>
        <div class="form-signin">
            <input id="loginName" name="loginName" type="text" class=" input username " placeholder="请输入登录名称" required/>
            <div class="user-icon"></div>
            <input id="loginPass" name="loginPass" type="password" class="input password" placeholder="请输入登录密码"
                   required/>
            <div class="pass-icon"></div>
            <div id="imageCodeStatus" class="inputline">
                <input id="codekaptcha" name="codekaptcha" class="input " style="width: 100px;" placeholder="验证码"
                       required/>
                <div class="yzm">
                    <img id="findpasswdrefreshImage" height="50px" src="kaptcha" onclick="$.login.refreshCode()"
                         alt="验证码"
                         title="看不清楚?请点击刷新验证码" class="imgkaptcha"/>
                </div>
            </div>
            <div class="inputlinerem">
                <div class="material-switch">
                    <input id="cookieCheckbox" name="cookieCheckbox" type="checkbox"/>
                    <label for="cookieCheckbox" class="label-info"></label>
                </div>
                <div class="remember"><label for="cookieCheckbox">记住用户名和密码 </label></div>
            </div>
        </div>
        <div class="footer">
            <a href="#" class="button" onclick="$('#userForm').submit();">系统登录</a>
        </div>
    </form>
</div>
<div class="bottom">
    主管单位：<a href="http://www.ahjt.gov.cn/" target="_blank">安徽省交通运输厅</a> | 技术支持：<a href="http://www.ahtongtu.com.cn/"
                                                                                  target="_blank">安徽省通途信息技术有限公司</a> |
    服务热线：0551-65371655 65371656 | <a target="_blank"
                                     href="http://shang.qq.com/wpa/qunwpa?idkey=172b2a8f7988840686539efd28034893a5817b2df05ad67d004c60695e8a1042"
                                     title="点击加入此群">QQ群：89765306</a>
</div>
<script src="<c:url value='/resources/js/mySlider.js' />"></script>
<script type="text/javascript">
    $youziku.load(".header", "03c17c6ce6c74bc8aadfe107529f733f", "Source-Han-Light");
    $youziku.load(".bottom,input", "03c17c6ce6c74bc8aadfe107529f733f", "Source-Han-Light");
    $youziku.load(".inputline,label", "03c17c6ce6c74bc8aadfe107529f733f", "Source-Han-Light");
    $youziku.load(".logo", "03c17c6ce6c74bc8aadfe107529f733f", "Source-Han-Sans-Medium");
    $youziku.draw();
</script>
</body>
</html>