package whf.easy.boot.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import whf.easy.boot.conf.MyFactoryBean;
import whf.easy.boot.service.SpringBeanFactoryDemo;
import whf.easy.boot.web.vo.NihaoVO;

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


@Autowired
private SpringBeanFactoryDemo springBeanFactoryDemo;
    @GetMapping("/hi")
    @ResponseBody
    public String hi(){
       return "hi";
    }

    @Autowired
    private MyFactoryBean factoryBean;

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
