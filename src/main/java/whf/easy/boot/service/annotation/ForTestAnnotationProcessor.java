package whf.easy.boot.service.annotation;

import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

public class ForTestAnnotationProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        // 获取目标类是否有ForTestAnnotation注解
        ForTestAnnotation annotation = AnnotationUtils.findAnnotation(AopUtils.getTargetClass(bean),
                ForTestAnnotation.class);

        if (annotation == null) {
            return bean;
        }

        // 处理想要的扩展
        System.out.println(beanName + " has ForTestAnnotation");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}