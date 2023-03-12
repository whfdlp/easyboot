package whf.easy.boot.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import whf.easy.boot.service.AbractAnimal;
import whf.easy.boot.service.Animal;
import whf.easy.boot.service.SpringBeanFactoryDemo;
import whf.easy.boot.web.vo.NihaoVO;

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
@RequestMapping("/helloWorld")
public class HelloWorldController {

//    @Qualifier("cat")
//    @Autowired
//    private AbractAnimal catAnimal;
//
//    @Qualifier("dog")
    @Autowired
    private AbractAnimal dogAnimal;

@Autowired
private SpringBeanFactoryDemo springBeanFactoryDemo;
    @GetMapping("/hi")
    @ResponseBody
    public String hi(){
       return "hi";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hi1(@RequestParam String message){
        System.out.println(message);
//        String print = dogAnimal.print();
//        System.out.println("print" + print);
//        String print1 = catAnimal.print();
//        System.out.println("print1" + print1);
        return "hello";
    }

    @PostMapping("/nihao")
    public NihaoVO hi2(@RequestBody NihaoVO wocao){
        System.out.println(wocao.toString());
        return wocao;
    }

    @PostMapping("/post")
    public String post(@ModelAttribute("haha") String haha){
        System.out.println(haha);
        return haha;
    }
}
