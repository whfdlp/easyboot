package whf.easy.boot.service.stream;


import com.google.common.collect.HashBasedTable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Person
 * @Description TODO
 * @Author whf
 * @Date 2023/1/31 21:35
 * @Version 1.0
 */
@Getter
@Setter
@ToString
public class Person implements ApplicationContextAware {
    public String name;
    public Integer age;

    public static void main(String[] args) {
        String code = "01,31, ,23512000000010240500,1209128.67,20230222, ,3145";
        String[] strings = StringUtils.tokenizeToStringArray(code, ",");
        String[] strings1 = StringUtils.tokenizeToStringArray(code, ",", false, false);
        System.out.println(strings);
        System.out.println(strings.length);
        System.out.println(strings1);
        System.out.println(strings1.length);

        HashBasedTable<String, String, Integer> table = HashBasedTable.create();
        table.put("a","b",1);
        table.put("a","b",2);
        table.put("a","c",3);
        Collection<Integer> values = table.values();
        System.out.println(CollectionUtils.isEmpty(values));
        System.out.println(values);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
