package whf.easy.boot.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import whf.easy.boot.conf.MyFactoryBean;

/**
 * @ClassName SpringBeanFactoryDemo
 * @Description TODO
 * @Author whf
 * @Date 2023/2/16 21:41
 * @Version 1.0
 */
@Component
public class SpringBeanFactoryDemo {

    public void invoke(){
        System.out.println("SpringBeanFactoryDemo.invoke");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        Object myFactoryBean = context.getBean("myFactoryBean");
        System.out.println(myFactoryBean);
    }
}
