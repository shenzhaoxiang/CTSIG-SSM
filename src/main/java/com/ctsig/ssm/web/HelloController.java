package com.ctsig.ssm.web;

import com.ctsig.ssm.exception.WebException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version： V1.0.0
 * @des：
 * @author: Shen
 * @email: shenzhaoxiang@gmail.com
 * @date: 2016/11/19
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://baidu.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(ModelMap map){
        // return模板文件的名称，对应src/main/resources/templates/hello.html
        return "hello";
    }

    @RequestMapping("/web/error")
    public String hello() throws Exception {
        throw new WebException("发生错误");
    }
}
