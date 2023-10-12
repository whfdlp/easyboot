package whf.easy.boot.web;


import com.alibaba.excel.EasyExcel;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import whf.easy.boot.common.CompontService;
import whf.easy.boot.model.DemoData;
import whf.easy.boot.service.DemoDataListener;
import whf.easy.boot.service.DubboConsumerDemo;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    @PostMapping("excel")
    @ResponseBody
    public String excel(MultipartFile file, @RequestParam("dataRowNumber") int dataRowNumber) throws IOException {
        EasyExcel.read(file.getInputStream(), new DemoDataListener(dataRowNumber-1,"123")).sheet().headRowNumber(dataRowNumber-1).doRead();
        return "success";
    }


    public static void main(String[] args) {
        List<List<Integer>> ints = Lists.newArrayList();
        List<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> integers1 = Lists.newArrayList(1, 2, 3, 4, 5);
        ints.add(integers);
        ints.add(integers1);
        int count = ints.stream().filter(Objects::nonNull)
                .mapToInt(List::size).sum();
        System.out.println(count);
    }
}
