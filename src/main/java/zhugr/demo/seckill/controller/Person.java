package zhugr.demo.seckill.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhugr
 * @date 2021/07/14
 */
@RequestMapping("/person")
public class Person {

    @GetMapping("test")
    public String Test(ModelAndView modelAndView){
        modelAndView.getModel().put("name","liSan");
        return "kk";
    }

}
