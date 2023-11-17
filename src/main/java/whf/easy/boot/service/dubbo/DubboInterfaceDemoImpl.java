package whf.easy.boot.service.dubbo;

import org.springframework.stereotype.Service;

@Service
public class DubboInterfaceDemoImpl implements DubboInterfaceDemo{
    @Override
    public String sayHello() {
        return "hello client";
    }
}

