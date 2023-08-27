package whf.easy.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DubboConsumerDemo {
    @Autowired
    private DubboInterfaceDemo dubboInterfaceDemo;

    public String sayHello(){
       return dubboInterfaceDemo.sayHello();
    }
}
