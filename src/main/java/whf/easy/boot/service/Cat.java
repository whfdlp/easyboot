package whf.easy.boot.service;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Service
public class Cat implements Animal{
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Animal getInstance() {
        return new Cat();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setDesc("1");
        Cat cat1 = new Cat();
        cat1.setDesc("1");
        List<Cat> cats = Lists.newArrayList(cat,cat1);
        Cat cat3 = new Cat();
        cat3.setDesc(cats.stream().map(x -> x.getDesc()).collect(Collectors.joining(",")));

        System.out.println(cat3);
    }

}
