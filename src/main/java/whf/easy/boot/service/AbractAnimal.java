package whf.easy.boot.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName AbractAnimal
 * @Description TODO
 * @Author whf
 * @Date 2023/3/7 16:22
 * @Version 1.0
 */
public abstract class AbractAnimal {

    @Autowired
    private SpringBeanFactoryDemo springBeanFactoryDemo;

    public String print() {
        springBeanFactoryDemo.invoke();
        System.out.println("AbractAnimal.print");
        return printIntel();
    }

    abstract String printIntel();
}
