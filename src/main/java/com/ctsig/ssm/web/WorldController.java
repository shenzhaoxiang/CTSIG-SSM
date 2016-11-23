package com.ctsig.ssm.web;

import com.ctsig.ssm.exception.JsonException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version： V1.0.0
 * @des：
 * @author: Shen
 * @email: shenzhaoxiang@gmail.com
 * @date: 2016/11/19
 */

/**
 * @RestController：Spring4之后加入的注解，
 * 原来在@Controller中返回json需要@ResponseBody来配合，
 * 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，
 * 默认返回json格式。
 */
@RestController
public class WorldController {

    @RequestMapping("/world")
    public String world(){
        return "json";
    }

    @RequestMapping("/json/error")
    public String exception()throws JsonException {
        throw new JsonException("发生异常") ;
    }
}
