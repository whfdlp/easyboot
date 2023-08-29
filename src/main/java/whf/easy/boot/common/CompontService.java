package whf.easy.boot.common;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CompontService
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:56
 * @Version 1.0
 */
@Data
public class CompontService<T> implements ApplicationContextAware {

    private List<String> test;

    private ApplicationContext applicationContext;

    public CompontService(List<String> test) {
        this.test = test;
    }

        @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public Map getBeanTypeService(Class<T> type){
        T  t = BeanFactoryUtils.beanOfTypeIncludingAncestors(applicationContext, type);
        Map<String,T> map = BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, type, true, false);
        return map;
    }


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        CompontService compontService = (CompontService)context.getBean("compontService");
        System.out.println(compontService.getTest());
    }
}
