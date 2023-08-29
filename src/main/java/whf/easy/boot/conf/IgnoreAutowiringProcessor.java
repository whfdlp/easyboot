package whf.easy.boot.conf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IgnoreAutowiringProcessor
 * @Description TODO
 * @Author whf
 * @Date 2023/3/19 11:58
 * @Version 1.0
 */

public class IgnoreAutowiringProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.ignoreDependencyType(ArrayList.class);
    }
}
