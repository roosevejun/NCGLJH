package com.tongtu.ncgl.jh.controller;


import com.google.code.kaptcha.spring.boot.ext.KaptchaResolver;
import com.google.code.kaptcha.spring.boot.ext.exception.KaptchaIncorrectException;
import com.google.code.kaptcha.spring.boot.ext.exception.KaptchaTimeoutException;
import com.tongtu.ncgl.base.controller.BaseController;
import com.tongtu.ncgl.base.util.UserAccessAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}
