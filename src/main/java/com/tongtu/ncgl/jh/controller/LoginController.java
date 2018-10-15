package com.tongtu.ncgl.jh.controller;

import com.google.code.kaptcha.spring.boot.ext.KaptchaResolver;
import com.google.code.kaptcha.spring.boot.ext.exception.KaptchaIncorrectException;
import com.google.code.kaptcha.spring.boot.ext.exception.KaptchaTimeoutException;
import com.tongtu.ncgl.base.bean.Result;
import com.tongtu.ncgl.base.util.MD5;
import com.tongtu.ncgl.base.util.ResultGenerator;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @Autowired
    private KaptchaResolver captchaResolver;
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public Result checkLogin(@RequestParam(value = "loginName", required = true) String loginName, @RequestParam(value = "loginPass", required = true) String loginPass) {
        loginPass = MD5.encrypt(loginPass);
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, loginPass);
        try {
            Subject subject = SecurityUtils.getSubject();
            if (subject != null)
                subject.logout();
            SecurityUtils.getSubject().login(token);
            return  ResultGenerator.genSuccessResult("登录成功");
        } catch (UnknownAccountException | IncorrectCredentialsException | LockedAccountException e) {
            return  ResultGenerator.genFailResult(e.getMessage());
        } catch (AuthenticationException e) {
            return ResultGenerator.genFailResult("认证失败！");
        }

    }
    /**
     * 验证注册码
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/validCaptcha", method = RequestMethod.GET)
    public Boolean validCaptcha(HttpServletRequest request) {
        Boolean status = false;
        String kaptchaReceived = request.getParameter("codekaptcha"); //获取填写的验证码内容
        try {
            if (captchaResolver.validCaptcha(request, kaptchaReceived)) {
                status = true;
            }
        } catch (KaptchaIncorrectException e) {
            e.printStackTrace();
        } catch (KaptchaTimeoutException e) {
            e.printStackTrace();
        }
        return status;
    }
}
