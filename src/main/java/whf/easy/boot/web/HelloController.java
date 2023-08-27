package whf.easy.boot.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import whf.easy.boot.common.CompontService;
import whf.easy.boot.service.DubboConsumerDemo;

import java.util.Map;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午4:26
 * @Version 1.0
 */
@Controller
@ResponseBody
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DubboConsumerDemo dubboConsumerDemo;

    @Autowired
    private CompontService compontService;

    @Value("${app.name}")
    private String values;

    @Value("${name}")
    private String name;

    @GetMapping("/hi")
    public String hi(){
        System.out.println(values);
        System.out.println(this.name);
        Map beanTypeService = compontService.getBeanTypeService(HelloController.class);
        System.out.println("HelloController.hi");
        return "index";
    }

//    @GetMapping("/hello1")
//    public ModelAndView hello1(){
//        System.out.println("HelloController.hello1");
//        ModelAndView modelAndView = new ModelAndView();
//        return modelAndView;
//    }
//
    @GetMapping("/sayHello")
    public String sayHello(){
        String s = dubboConsumerDemo.sayHello();
        return s;
    }
}
