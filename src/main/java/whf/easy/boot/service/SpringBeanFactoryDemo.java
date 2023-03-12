package whf.easy.boot.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
        Dog dog = context.getBean("dog",Dog.class);
        System.out.println(dog);
    }
}
