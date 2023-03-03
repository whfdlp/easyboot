package whf.easy.boot.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SpringBeanFactoryDemo
 * @Description TODO
 * @Author whf
 * @Date 2023/2/16 21:41
 * @Version 1.0
 */
public class SpringBeanFactoryDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        Dog dog = context.getBean("dog",Dog.class);
        System.out.println(dog);
    }
}
