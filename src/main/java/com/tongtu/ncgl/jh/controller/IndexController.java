package com.tongtu.ncgl.jh.controller;


import com.google.code.kaptcha.spring.boot.ext.KaptchaResolver;
import com.google.code.kaptcha.spring.boot.ext.exception.KaptchaIncorrectException;
import com.google.code.kaptcha.spring.boot.ext.exception.KaptchaTimeoutException;
import com.tongtu.ncgl.base.controller.BaseController;
import com.tongtu.ncgl.base.util.MD5;
import com.tongtu.ncgl.base.util.ResultGenerator;
import com.tongtu.ncgl.base.util.UserAccessAnnotation;
import com.tongtu.ncgl.jh.services.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-15上午11:19
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
@Controller
public class IndexController extends BaseController {
    @Autowired
    private KaptchaResolver captchaResolver;

    @Autowired
    private UserService userService;

    @UserAccessAnnotation()
    @RequestMapping(method = RequestMethod.GET, value = "home.do")
    public ModelAndView loginIndex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login/index");
        return mav;
    }

    @RequestMapping(value = "path/{path}/{jsppath}.do")
    public ModelAndView loginIndex(@PathVariable("path") String path, @PathVariable("jsppath") String jsppath) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(path + "/" + jsppath);
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginToHome() {
        return new ModelAndView("redirect:/home.do");
    }

    /**
     * 验证注册码
     *
     * @param response
     * @param request
     * @return
     */
    @RequestMapping(value = "/validCaptcha", method = RequestMethod.GET)
    public void validCaptcha(HttpServletRequest request, HttpServletResponse response) {
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
        try {
            response.getWriter().print(status);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public ModelAndView checkLogin(@RequestParam(value = "loginName", required = true) String loginName, @RequestParam(value = "loginPass", required = true) String loginPass) {
        loginPass = MD5.encrypt(loginPass);
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, loginPass);
        try {
            Subject subject = SecurityUtils.getSubject();
            if (subject != null)
                subject.logout();
            SecurityUtils.getSubject().login(token);
            return new ModelAndView("result", "result", ResultGenerator.genSuccessResult("登录成功"));
        } catch (UnknownAccountException | IncorrectCredentialsException | LockedAccountException e) {
            return new ModelAndView("result", "result", ResultGenerator.genFailResult(e.getMessage()));
        } catch (AuthenticationException e) {
            return new ModelAndView("result", "result", ResultGenerator.genFailResult("认证失败！"));
        }

    }
}
