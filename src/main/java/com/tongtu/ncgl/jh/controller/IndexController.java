package com.tongtu.ncgl.jh.controller;

import com.tongtu.ncgl.base.controller.BaseController;
import com.tongtu.ncgl.base.util.UserAccessAnnotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


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

    @GetMapping("/")
    public ModelAndView welcome(Map<String, Object> model) {
        return new ModelAndView("redirect:/home.do");
    }

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


}
