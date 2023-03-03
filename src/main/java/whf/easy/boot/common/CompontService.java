package whf.easy.boot.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName CompontService
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:56
 * @Version 1.0
 */
@Component
public class CompontService implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public Map getBeanTypeService(Class type){
        Map<String,Object> map = BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, type, true, false);
        return map;
    }
}
