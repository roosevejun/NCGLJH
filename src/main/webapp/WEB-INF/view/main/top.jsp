<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>页面头</title>
    <link href="<c:url value='/resources/css/top.css' />" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">
        function userGoOut() {
            parent.location = "loginout.do";
        }
        function  systemGoOut(){
              $.omMessageBox.confirm({
        title: '<font color="red">确定退出系统???</font>',
        content: '<font size="3"><strong>' + '</strong></font><br><br><font color="red">&nbsp;&nbsp;&nbsp;&nbsp;你确定要退出当前系统？</font>',
        onClose: function (v) {
           if(v ==  true){
                 self.opener=null;  
                 self.open('','_self');  
                 self.close();  
               }
                  }
             });
        }
        
        function systemPage(){
            parent.location = "welcome.do";
        }
       var userPassFormInfo = "#userPassFormInfo";  //弹出框ID
        function  updateUserPass(){
           var url =  'updatePassWord.do';
           $(userPassFormInfo).omDialog({
      	     title : "修改密码 <font color='red'>" + "</font>",
      	        width: 'auto',
      	        height: 'auto'
    	   });
    	    $(userPassFormInfo).load(url,function(){
            $(userPassFormInfo).omDialog('open');
           });
        }
        
        </script>
        <link href="<c:url value='/resources/css/top/style.css' />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/resources/css/top/basic.css' />" rel="stylesheet" type="text/css"/>
</head>

<body>
<div class="top">
            <div class="top_left logo">
            	<img src="<c:url value='/resources/images/logo.png'/>" />
            </div>
            <div class="top_right">
                <div class="top_user">登陆用户：${user.appuserName}&nbsp;&nbsp;<a href="javascript:userGoOut();">安全退出</a>
                </div>
            </div>
    </div>
</body>
</html>