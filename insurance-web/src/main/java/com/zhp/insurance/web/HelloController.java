package com.zhp.insurance.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhp.insurance.base.HelloBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhp.dts
 * @date 2018/1/4.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloBootService helloBootService;
    @ResponseBody
    @RequestMapping(value = "/boot/{id}",method= RequestMethod.GET)
    public String helloBoot(@PathVariable Integer id){
        return helloBootService.getUserName(id);
    }
    public ModelAndView helloBootView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("");
        return modelAndView;
    }
}
