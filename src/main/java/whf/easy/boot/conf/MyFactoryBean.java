package whf.easy.boot.conf;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;
import whf.easy.boot.service.strategy.Dog;

@Component
public class MyFactoryBean implements SmartFactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isEagerInit() {
        return true;
    }
}
