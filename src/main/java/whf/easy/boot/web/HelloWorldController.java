package whf.easy.boot.web;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @GetMapping("/hi")
    @ResponseBody
    public String hi(){
       return "hi";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hi1(@RequestParam String message){
        System.out.println(message);
        return "hello";
    }

    @PostMapping("/nihao")
    public NihaoVO hi2(@RequestBody NihaoVO wocao){
        System.out.println(wocao.toString());
        return wocao;
    }
}
