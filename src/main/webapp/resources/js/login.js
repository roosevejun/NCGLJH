/**
 * Created with IntelliJ IDEA.
 * User: ahtt_nsj
 * Date: 13-10-31
 * Time: 下午3:59
 * To change this template use File | Settings | File Templates.
 */
jQuery.login = {
    initCookie: function () {
        var userNameValue = $.cookie('loginName');
        var passwordValue = $.cookie('loginPass');
        var cookieCheckbox = $.cookie('cookieCheckbox');
        console.log(cookieCheckbox)
        if (cookieCheckbox == 'true') {
            $("#loginName").val(userNameValue);
            $("#loginPass").val(passwordValue);
            $("#imageCodeStatus").css("display", "none");
            $("#cookieCheckbox").attr("checked", "true");
        } else {
            $("#loginName").val("");
            $("#loginPass").val("");
        }
    },
    checkCookie: function () {
        if ($(".material-switch  input[type=checkbox]:checked + label").length==1) {
            $.cookie("loginName", $("#loginName").val(), {expires: 14});
            $.cookie("loginPass", $("#loginPass").val(), {expires: 14});
            $.cookie("cookieCheckbox", "true", {expires: 14});
        } else {
            $.cookie("loginName", '', {expires: -1});
            $.cookie("loginPass", '', {expires: -1});
            $.cookie("cookieCheckbox", 'false', {expires: 14});
        }
    },
    refreshCode: function () {
        $("#findpasswdrefreshImage").attr('src', $("#findpasswdrefreshImage").attr("src") + "?" + Math.random())
    },
    loginSubmit: function () {
        $.ajax({
            url: 'checkLogin',
            type: 'POST',
            data: {
                loginName: $("#loginName").val(),
                loginPass: $("#loginPass").val()
            },
            dataType: 'json',
            success: function (data) {
                console.log(data)
                var loginMessageDialog = new BootstrapDialog();
                $(loginMessageDialog).attr("onshow", function () {
                    setTimeout(function (dialogRef) {
                        loginMessageDialog.close();
                    }, 500);
                });
                if (data.code == "0001") {
                    loginMessageDialog.setTitle("登陆成功");
                    loginMessageDialog.setMessage("正在转入...............");
                    loginMessageDialog.setType(BootstrapDialog.TYPE_SUCCESS);
                    $(loginMessageDialog).attr("onhidden", function () {
                        console.log("onhidden")
                        window.location.href = "welcome.do";
                    });

                } else {
                    loginMessageDialog.setTitle("登陆失败");
                    loginMessageDialog.setMessage("登陆失败,用户名密码不正确");
                    loginMessageDialog.setType(BootstrapDialog.TYPE_DANGER);
                    $(loginMessageDialog).attr("onhidden", function () {
                        $.login.refreshCode();
                        $('#userForm')[0].reset();
                    });
                }
                loginMessageDialog.open();
            }
        });
    }
}
$(function () {

});
